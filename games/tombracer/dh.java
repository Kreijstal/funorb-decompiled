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
        int var44 = 0;
        an var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        uca stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        uca stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param3;
                if (null == var45.field_q) {
                  break L2;
                } else {
                  if (var45.field_K <= 1) {
                    break L2;
                  } else {
                    var62 = var45.field_q;
                    uu.a(0, 2507, var62, 0, ow.field_q);
                    break L1;
                  }
                }
              }
              ne.a((byte) -124);
              break L1;
            }
            var66 = new int[param3.field_A];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param3.field_A];
            var65 = ada.field_y;
            var64 = ie.field_i;
            var63 = dd.field_d;
            var13 = 0;
            L3: while (true) {
              if (param3.field_A <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (var44 >= pq.field_f) {
                    break L0;
                  } else {
                    L5: {
                      var14 = aia.field_t[var44];
                      var15 = param3.field_B[var14];
                      var16 = param3.field_w[var14];
                      var17 = param3.field_f[var14];
                      if (ada.field_y.length > param3.field_C[var14]) {
                        stackOut_25_0 = param3.field_C[var14];
                        stackIn_26_0 = stackOut_25_0;
                        break L5;
                      } else {
                        stackOut_24_0 = -1;
                        stackIn_26_0 = stackOut_24_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_26_0;
                      if (ada.field_y.length <= param3.field_s[var14]) {
                        stackOut_28_0 = -1;
                        stackIn_29_0 = stackOut_28_0;
                        break L6;
                      } else {
                        stackOut_27_0 = param3.field_s[var14];
                        stackIn_29_0 = stackOut_27_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_29_0;
                      if (param3.field_y[var14] < ada.field_y.length) {
                        stackOut_31_0 = param3.field_y[var14];
                        stackIn_32_0 = stackOut_31_0;
                        break L7;
                      } else {
                        stackOut_30_0 = -1;
                        stackIn_32_0 = stackOut_30_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_32_0;
                        if (ej.field_d == null) {
                          break L9;
                        } else {
                          if (null == param3.field_M) {
                            break L9;
                          } else {
                            if (var14 >= param3.field_M.length) {
                              break L9;
                            } else {
                              if (param3.field_M[var14] == -1) {
                                break L9;
                              } else {
                                if (ej.field_d.length <= param3.field_M[var14]) {
                                  break L9;
                                } else {
                                  stackOut_37_0 = ej.field_d[param3.field_M[var14]];
                                  stackIn_39_0 = stackOut_37_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_38_0 = null;
                      stackIn_39_0 = (uca) (Object) stackOut_38_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_39_0;
                        var22 = ds.field_f[var15];
                        var23 = mg.field_e[var15];
                        var24 = ds.field_f[var16];
                        var25 = mg.field_e[var16];
                        var26 = ds.field_f[var17];
                        var27 = mg.field_e[var17];
                        if (var19 != var18) {
                          break L11;
                        } else {
                          if (var19 == var20) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref == null) {
                                stackOut_48_0 = 8355711;
                                stackIn_49_0 = stackOut_48_0;
                                break L12;
                              } else {
                                stackOut_47_0 = var21_ref.field_e;
                                stackIn_49_0 = stackOut_47_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_49_0;
                            var31 = var30 & 16711935;
                            var32 = 65280 & var30;
                            var33 = (var32 * var28 & 16711789) >>> 8 | (var28 * var31 & -16711744) >>> 8;
                            var33 = var33 + var29 * 65793;
                            oea.a(var25, -8543, var26, var23, var27, var22, (var33 & 16711422) >> 1, var24);
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        var28 = var66[var18];
                        var29 = var66[var19];
                        var30 = var66[var20];
                        var31 = var67[var18];
                        var32 = var67[var19];
                        var33 = var67[var20];
                        if (var21_ref == null) {
                          stackOut_44_0 = 8355711;
                          stackIn_45_0 = stackOut_44_0;
                          break L13;
                        } else {
                          stackOut_43_0 = var21_ref.field_e;
                          stackIn_45_0 = stackOut_43_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_45_0;
                      var35 = 16711935 & var34;
                      var36 = var34 & 65280;
                      var37 = (var28 * var36 & 16711823) >>> 8 | (var28 * var35 & -16711692) >>> 8;
                      var38 = (16711869 & var36 * var29) >>> 8 | (var35 * var29 & -16711781) >>> 8;
                      var37 = var37 + 65793 * var31;
                      var38 = var38 + 65793 * var32;
                      var39 = var30 * var35 >>> 8 & 1140785407 | (16711738 & var36 * var30) >>> 8;
                      var39 = var39 + var33 * 65793;
                      cm.a(var25, (65365 & var39) >> 8, var37 >> 16, var38 >> 16, var24, var38 >> 8 & 255, var26, 117, var22, var39 & 255, var39 >> 16, var37 >> 8 & 255, var23, 255 & var38, var27, 255 & var37);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = param0 * var63[var13] + (var64[var13] * param1 + param4 * var65[var13]) >> 8;
                  if (var14 < 0) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var14 < 0) {
                    stackOut_16_0 = 128;
                    stackIn_17_0 = stackOut_16_0;
                    break L15;
                  } else {
                    if (var14 < 128) {
                      stackOut_15_0 = var14 + 128;
                      stackIn_17_0 = stackOut_15_0;
                      break L15;
                    } else {
                      stackOut_14_0 = 256;
                      stackIn_17_0 = stackOut_14_0;
                      break L15;
                    }
                  }
                }
                L16: {
                  var14 = stackIn_17_0;
                  var15 = param5 * var63[var13] + var64[var13] * param2 + var65[var13] * param6 >> 8;
                  stackOut_17_0 = gta.field_g;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var15 >= 0) {
                    stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                    stackOut_19_1 = var15;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L16;
                  } else {
                    stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                    stackOut_18_1 = -var15;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L16;
                  }
                }
                var15 = stackIn_20_0[stackIn_20_1];
                var14 = (256 + -var15) * var14 >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var8;
            stackOut_52_1 = new StringBuilder().append("dh.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param3 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + -23 + 41);
        }
    }

    public static void a(byte param0) {
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
                field_e = null;
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
            stackOut_4_0 = (RuntimeException) var13;
            stackOut_4_1 = new StringBuilder().append("dh.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param12 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
    }
}
