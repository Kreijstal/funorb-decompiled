/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    int field_a;
    static jea field_e;
    int field_d;
    int field_c;
    int field_b;

    final static void a(int param0, int param1, int param2, an param3, int param4, int param5, int param6, byte param7) {
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
        uca var21_ref = null;
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
        an var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_18_0 = 0;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        uca stackIn_42_0 = null;
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
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        short stackOut_30_0 = 0;
        short stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        uca stackOut_40_0 = null;
        Object stackOut_41_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int[] stackOut_18_0 = null;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var40 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param3;
                if (null == var44.field_q) {
                  break L2;
                } else {
                  if ((var44.field_K ^ -1) >= -2) {
                    break L2;
                  } else {
                    var60 = var44.field_q;
                    uu.a(0, 2507, var60, 0, ow.field_q);
                    if (var40 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ne.a((byte) -124);
              break L1;
            }
            var54 = new int[param3.field_A];
            var49 = var54;
            var41 = var49;
            var8_array = var41;
            var64 = new int[param3.field_A];
            var63 = ada.field_y;
            var62 = ie.field_i;
            var61 = dd.field_d;
            if (param7 == -23) {
              var13 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    L6: {
                      if ((param3.field_A ^ -1) >= (var13 ^ -1)) {
                        break L6;
                      } else {
                        var14 = param0 * var61[var13] + (var62[var13] * param1 + param4 * var63[var13]) >> -878188408;
                        stackOut_9_0 = -1;
                        stackOut_9_1 = var14 ^ -1;
                        stackIn_24_0 = stackOut_9_0;
                        stackIn_24_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var40 != 0) {
                          L7: while (true) {
                            if (stackIn_24_0 >= stackIn_24_1) {
                              break L5;
                            } else {
                              var14 = aia.field_t[var13];
                              var15 = param3.field_B[var14];
                              var16 = param3.field_w[var14];
                              var17 = param3.field_f[var14];
                              if (var40 != 0) {
                                break L4;
                              } else {
                                L8: {
                                  if ((ada.field_y.length ^ -1) < (param3.field_C[var14] ^ -1)) {
                                    stackOut_28_0 = param3.field_C[var14];
                                    stackIn_29_0 = stackOut_28_0;
                                    break L8;
                                  } else {
                                    stackOut_27_0 = -1;
                                    stackIn_29_0 = stackOut_27_0;
                                    break L8;
                                  }
                                }
                                L9: {
                                  var18 = stackIn_29_0;
                                  if (ada.field_y.length <= param3.field_s[var14]) {
                                    stackOut_31_0 = -1;
                                    stackIn_32_0 = stackOut_31_0;
                                    break L9;
                                  } else {
                                    stackOut_30_0 = param3.field_s[var14];
                                    stackIn_32_0 = stackOut_30_0;
                                    break L9;
                                  }
                                }
                                L10: {
                                  var19 = stackIn_32_0;
                                  if (param3.field_y[var14] < ada.field_y.length) {
                                    stackOut_34_0 = param3.field_y[var14];
                                    stackIn_35_0 = stackOut_34_0;
                                    break L10;
                                  } else {
                                    stackOut_33_0 = -1;
                                    stackIn_35_0 = stackOut_33_0;
                                    break L10;
                                  }
                                }
                                L11: {
                                  L12: {
                                    var20 = stackIn_35_0;
                                    if (ej.field_d == null) {
                                      break L12;
                                    } else {
                                      if (null == param3.field_M) {
                                        break L12;
                                      } else {
                                        if ((var14 ^ -1) <= (param3.field_M.length ^ -1)) {
                                          break L12;
                                        } else {
                                          if (0 == (param3.field_M[var14] ^ -1)) {
                                            break L12;
                                          } else {
                                            if (ej.field_d.length <= param3.field_M[var14]) {
                                              break L12;
                                            } else {
                                              stackOut_40_0 = ej.field_d[param3.field_M[var14]];
                                              stackIn_42_0 = stackOut_40_0;
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_41_0 = null;
                                  stackIn_42_0 = (uca) ((Object) stackOut_41_0);
                                  break L11;
                                }
                                L13: {
                                  L14: {
                                    L15: {
                                      var21_ref = stackIn_42_0;
                                      var22 = ds.field_f[var15];
                                      var23 = mg.field_e[var15];
                                      var24 = ds.field_f[var16];
                                      var25 = mg.field_e[var16];
                                      var26 = ds.field_f[var17];
                                      var27 = mg.field_e[var17];
                                      if (var19 != var18) {
                                        break L15;
                                      } else {
                                        if (var19 == var20) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    L16: {
                                      var28 = var54[var18];
                                      var29 = var54[var19];
                                      var30 = var54[var20];
                                      var31 = var64[var18];
                                      var32 = var64[var19];
                                      var33 = var64[var20];
                                      if (var21_ref == null) {
                                        stackOut_47_0 = 8355711;
                                        stackIn_48_0 = stackOut_47_0;
                                        break L16;
                                      } else {
                                        stackOut_46_0 = var21_ref.field_e;
                                        stackIn_48_0 = stackOut_46_0;
                                        break L16;
                                      }
                                    }
                                    var34 = stackIn_48_0;
                                    var35 = 16711935 & var34;
                                    var36 = var34 & 65280;
                                    var37 = (var28 * var36 & 16711823) >>> -2121140824 | (var28 * var35 & -16711692) >>> -928617080;
                                    var38 = (16711869 & var36 * var29) >>> 1837446120 | (var35 * var29 & -16711781) >>> 700831304;
                                    var37 = var37 + 65793 * var31;
                                    var38 = var38 + 65793 * var32;
                                    var39 = var30 * var35 >>> 547425576 & 1140785407 | (16711738 & var36 * var30) >>> -699064728;
                                    var39 = var39 + var33 * 65793;
                                    cm.a(var25, (65365 & var39) >> 723341064, var37 >> 631380528, var38 >> 1454207504, var24, var38 >> -1147318584 & 255, var26, 117, var22, var39 & 255, var39 >> 1647718928, var37 >> 1882400200 & 255, var23, 255 & var38, var27, 255 & var37);
                                    if (var40 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L17: {
                                    var28 = var54[var18];
                                    var29 = var64[var18];
                                    if (var21_ref == null) {
                                      stackOut_51_0 = 8355711;
                                      stackIn_52_0 = stackOut_51_0;
                                      break L17;
                                    } else {
                                      stackOut_50_0 = var21_ref.field_e;
                                      stackIn_52_0 = stackOut_50_0;
                                      break L17;
                                    }
                                  }
                                  var30 = stackIn_52_0;
                                  var31 = var30 & 16711935;
                                  var32 = 65280 & var30;
                                  var33 = (var32 * var28 & 16711789) >>> 1275341896 | (var28 * var31 & -16711744) >>> 1107163048;
                                  var33 = var33 + var29 * 65793;
                                  oea.a(var25, -8543, var26, var23, var27, var22, (var33 & 16711422) >> 417457761, var24);
                                  break L13;
                                }
                                var13++;
                                if (var40 == 0) {
                                  stackOut_23_0 = var13;
                                  stackOut_23_1 = pq.field_f;
                                  stackIn_24_0 = stackOut_23_0;
                                  stackIn_24_1 = stackOut_23_1;
                                  continue L7;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        } else {
                          L18: {
                            if (stackIn_10_0 < stackIn_10_1) {
                              var14 = -var14;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            if ((var14 ^ -1) > -1) {
                              stackOut_17_0 = 128;
                              stackIn_18_0 = stackOut_17_0;
                              break L19;
                            } else {
                              if (var14 < 128) {
                                stackOut_16_0 = var14 + 128;
                                stackIn_18_0 = stackOut_16_0;
                                break L19;
                              } else {
                                stackOut_15_0 = 256;
                                stackIn_18_0 = stackOut_15_0;
                                break L19;
                              }
                            }
                          }
                          L20: {
                            var14 = stackIn_18_0;
                            var15 = param5 * var61[var13] + var62[var13] * param2 + var63[var13] * param6 >> 562363016;
                            stackOut_18_0 = gta.field_g;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (-1 >= (var15 ^ -1)) {
                              stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                              stackOut_20_1 = var15;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              break L20;
                            } else {
                              stackOut_19_0 = (int[]) ((Object) stackIn_19_0);
                              stackOut_19_1 = -var15;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_21_1 = stackOut_19_1;
                              break L20;
                            }
                          }
                          var15 = stackIn_21_0[stackIn_21_1];
                          var14 = (256 + -var15) * var14 >>> 756666824;
                          var54[var13] = var14;
                          var64[var13] = var15;
                          var13++;
                          if (var40 == 0) {
                            continue L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var13 = 0;
                    L21: while (true) {
                      stackOut_23_0 = var13;
                      stackOut_23_1 = pq.field_f;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      if (stackIn_24_0 >= stackIn_24_1) {
                        break L5;
                      } else {
                        var14 = aia.field_t[var13];
                        var15 = param3.field_B[var14];
                        var16 = param3.field_w[var14];
                        var17 = param3.field_f[var14];
                        if (var40 != 0) {
                          break L4;
                        } else {
                          L22: {
                            if ((ada.field_y.length ^ -1) < (param3.field_C[var14] ^ -1)) {
                              stackOut_28_0 = param3.field_C[var14];
                              stackIn_29_0 = stackOut_28_0;
                              break L22;
                            } else {
                              stackOut_27_0 = -1;
                              stackIn_29_0 = stackOut_27_0;
                              break L22;
                            }
                          }
                          L23: {
                            var18 = stackIn_29_0;
                            if (ada.field_y.length <= param3.field_s[var14]) {
                              stackOut_31_0 = -1;
                              stackIn_32_0 = stackOut_31_0;
                              break L23;
                            } else {
                              stackOut_30_0 = param3.field_s[var14];
                              stackIn_32_0 = stackOut_30_0;
                              break L23;
                            }
                          }
                          L24: {
                            var19 = stackIn_32_0;
                            if (param3.field_y[var14] < ada.field_y.length) {
                              stackOut_34_0 = param3.field_y[var14];
                              stackIn_35_0 = stackOut_34_0;
                              break L24;
                            } else {
                              stackOut_33_0 = -1;
                              stackIn_35_0 = stackOut_33_0;
                              break L24;
                            }
                          }
                          L25: {
                            L26: {
                              var20 = stackIn_35_0;
                              if (ej.field_d == null) {
                                break L26;
                              } else {
                                if (null == param3.field_M) {
                                  break L26;
                                } else {
                                  if ((var14 ^ -1) <= (param3.field_M.length ^ -1)) {
                                    break L26;
                                  } else {
                                    if (0 == (param3.field_M[var14] ^ -1)) {
                                      break L26;
                                    } else {
                                      if (ej.field_d.length <= param3.field_M[var14]) {
                                        break L26;
                                      } else {
                                        stackOut_40_0 = ej.field_d[param3.field_M[var14]];
                                        stackIn_42_0 = stackOut_40_0;
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_41_0 = null;
                            stackIn_42_0 = (uca) ((Object) stackOut_41_0);
                            break L25;
                          }
                          L27: {
                            L28: {
                              L29: {
                                var21_ref = stackIn_42_0;
                                var22 = ds.field_f[var15];
                                var23 = mg.field_e[var15];
                                var24 = ds.field_f[var16];
                                var25 = mg.field_e[var16];
                                var26 = ds.field_f[var17];
                                var27 = mg.field_e[var17];
                                if (var19 != var18) {
                                  break L29;
                                } else {
                                  if (var19 == var20) {
                                    break L28;
                                  } else {
                                    break L29;
                                  }
                                }
                              }
                              L30: {
                                var28 = var54[var18];
                                var29 = var54[var19];
                                var30 = var54[var20];
                                var31 = var64[var18];
                                var32 = var64[var19];
                                var33 = var64[var20];
                                if (var21_ref == null) {
                                  stackOut_47_0 = 8355711;
                                  stackIn_48_0 = stackOut_47_0;
                                  break L30;
                                } else {
                                  stackOut_46_0 = var21_ref.field_e;
                                  stackIn_48_0 = stackOut_46_0;
                                  break L30;
                                }
                              }
                              var34 = stackIn_48_0;
                              var35 = 16711935 & var34;
                              var36 = var34 & 65280;
                              var37 = (var28 * var36 & 16711823) >>> -2121140824 | (var28 * var35 & -16711692) >>> -928617080;
                              var38 = (16711869 & var36 * var29) >>> 1837446120 | (var35 * var29 & -16711781) >>> 700831304;
                              var37 = var37 + 65793 * var31;
                              var38 = var38 + 65793 * var32;
                              var39 = var30 * var35 >>> 547425576 & 1140785407 | (16711738 & var36 * var30) >>> -699064728;
                              var39 = var39 + var33 * 65793;
                              cm.a(var25, (65365 & var39) >> 723341064, var37 >> 631380528, var38 >> 1454207504, var24, var38 >> -1147318584 & 255, var26, 117, var22, var39 & 255, var39 >> 1647718928, var37 >> 1882400200 & 255, var23, 255 & var38, var27, 255 & var37);
                              if (var40 == 0) {
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                            L31: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21_ref == null) {
                                stackOut_51_0 = 8355711;
                                stackIn_52_0 = stackOut_51_0;
                                break L31;
                              } else {
                                stackOut_50_0 = var21_ref.field_e;
                                stackIn_52_0 = stackOut_50_0;
                                break L31;
                              }
                            }
                            var30 = stackIn_52_0;
                            var31 = var30 & 16711935;
                            var32 = 65280 & var30;
                            var33 = (var32 * var28 & 16711789) >>> 1275341896 | (var28 * var31 & -16711744) >>> 1107163048;
                            var33 = var33 + var29 * 65793;
                            oea.a(var25, -8543, var26, var23, var27, var22, (var33 & 16711422) >> 417457761, var24);
                            break L27;
                          }
                          var13++;
                          if (var40 == 0) {
                            continue L21;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  break L4;
                }
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
          L32: {
            var8 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var8);
            stackOut_55_1 = new StringBuilder().append("dh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param3 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L32;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L32;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -6) {
            field_e = (jea) null;
        }
        field_e = null;
    }

    final static int a(da param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, String param12) {
        RuntimeException var13 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param9 == 29870) {
                break L1;
              } else {
                field_e = (jea) null;
                break L1;
              }
            }
            stackOut_2_0 = param0.a((aa) null, param11, param3, 0, param7, jg.a(param1, (byte) -90, param8), (int[]) null, param2, jg.a(param1, (byte) -45, param6), param12, (byte) -118, param5, 0, (nh[]) null, param4, param10);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var13);
            stackOut_4_1 = new StringBuilder().append("dh.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param12 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
