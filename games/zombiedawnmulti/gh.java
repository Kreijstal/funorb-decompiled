/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String[] field_f;
    boolean field_e;
    boolean field_d;
    static int field_a;
    int field_c;
    static boolean field_g;
    String[] field_b;
    String field_h;

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= 48) {
          L0: {
            L1: {
              if (10 > a.field_b) {
                break L1;
              } else {
                if (og.field_N) {
                  break L1;
                } else {
                  int discarded$2 = 1;
                  if (vo.e()) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(md param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
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
        af var21_ref = null;
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
        md var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        af stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        af stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var40 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param0;
                if (var45.field_z == null) {
                  break L2;
                } else {
                  if (var45.field_m > 1) {
                    var62 = var45.field_z;
                    si.a(0, 255, var62, nn.field_c, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              int discarded$2 = 8;
              pn.b();
              break L1;
            }
            var66 = new int[param0.field_o];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param0.field_o];
            var64 = eb.field_J;
            var63 = bq.field_g;
            var65 = wp.field_i;
            var13 = 0;
            L3: while (true) {
              if (param0.field_o <= var13) {
                var44 = 0;
                var13 = var44;
                L4: while (true) {
                  if (tf.field_Eb <= var44) {
                    break L0;
                  } else {
                    L5: {
                      var14 = ah.field_f[var44];
                      var15 = param0.field_y[var14];
                      var16 = param0.field_L[var14];
                      var17 = param0.field_H[var14];
                      if (param0.field_F[var14] < eb.field_J.length) {
                        stackOut_24_0 = param0.field_F[var14];
                        stackIn_25_0 = stackOut_24_0;
                        break L5;
                      } else {
                        stackOut_23_0 = -1;
                        stackIn_25_0 = stackOut_23_0;
                        break L5;
                      }
                    }
                    L6: {
                      var18 = stackIn_25_0;
                      if (param0.field_K[var14] >= eb.field_J.length) {
                        stackOut_27_0 = -1;
                        stackIn_28_0 = stackOut_27_0;
                        break L6;
                      } else {
                        stackOut_26_0 = param0.field_K[var14];
                        stackIn_28_0 = stackOut_26_0;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = stackIn_28_0;
                      if (eb.field_J.length > param0.field_x[var14]) {
                        stackOut_30_0 = param0.field_x[var14];
                        stackIn_31_0 = stackOut_30_0;
                        break L7;
                      } else {
                        stackOut_29_0 = -1;
                        stackIn_31_0 = stackOut_29_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var20 = stackIn_31_0;
                        if (qh.field_f == null) {
                          break L9;
                        } else {
                          if (null == param0.field_c) {
                            break L9;
                          } else {
                            if (param0.field_c.length <= var14) {
                              break L9;
                            } else {
                              if (param0.field_c[var14] == -1) {
                                break L9;
                              } else {
                                if (param0.field_c[var14] >= qh.field_f.length) {
                                  break L9;
                                } else {
                                  stackOut_36_0 = qh.field_f[param0.field_c[var14]];
                                  stackIn_38_0 = stackOut_36_0;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_38_0 = (af) (Object) stackOut_37_0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var21_ref = stackIn_38_0;
                        var22 = lo.field_j[var15];
                        var23 = jk.field_k[var15];
                        var24 = lo.field_j[var16];
                        var25 = jk.field_k[var16];
                        var26 = lo.field_j[var17];
                        var27 = jk.field_k[var17];
                        if (var18 != var19) {
                          break L11;
                        } else {
                          if (var19 == var20) {
                            L12: {
                              var28 = var66[var18];
                              var29 = var67[var18];
                              if (var21_ref == null) {
                                stackOut_47_0 = 8355711;
                                stackIn_48_0 = stackOut_47_0;
                                break L12;
                              } else {
                                stackOut_46_0 = var21_ref.field_f;
                                stackIn_48_0 = stackOut_46_0;
                                break L12;
                              }
                            }
                            var30 = stackIn_48_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = (var28 * var31 & -16711894) >>> 8 | (16711900 & var32 * var28) >>> 8;
                            var33 = var33 + var29 * 65793;
                            mo.a(var22, 8355711 & var33 >> 1, var23, var24, var25, var26, var27, (byte) 58);
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
                          stackOut_43_0 = 8355711;
                          stackIn_44_0 = stackOut_43_0;
                          break L13;
                        } else {
                          stackOut_42_0 = var21_ref.field_f;
                          stackIn_44_0 = stackOut_42_0;
                          break L13;
                        }
                      }
                      var34 = stackIn_44_0;
                      var35 = 16711935 & var34;
                      var36 = var34 & 65280;
                      var37 = (16711726 & var36 * var28) >>> 8 | -1962999553 & var35 * var28 >>> 8;
                      var38 = 1258225919 & var35 * var29 >>> 8 | (16711826 & var36 * var29) >>> 8;
                      var37 = var37 + var31 * 65793;
                      var39 = (16711695 & var36 * var30) >>> 8 | -1140915969 & var30 * var35 >>> 8;
                      var38 = var38 + var32 * 65793;
                      var39 = var39 + var33 * 65793;
                      int discarded$3 = 121;
                      qe.a(var39 >> 16, 255 & var37, var37 >> 16, var37 >> 8 & 255, 255 & var39, var27, 255 & var38, var26, var23, (var39 & 65366) >> 8, (65470 & var38) >> 8, var38 >> 16, var25, var24, var22);
                      break L10;
                    }
                    var44++;
                    continue L4;
                  }
                }
              } else {
                L14: {
                  var14 = var63[var13] * param7 + (var64[var13] * param1 + var65[var13] * param5) >> 8;
                  if (0 > var14) {
                    var14 = -var14;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var14 >= 0) {
                    if (var14 >= 128) {
                      stackOut_15_0 = 256;
                      stackIn_16_0 = stackOut_15_0;
                      break L15;
                    } else {
                      stackOut_14_0 = 128 - -var14;
                      stackIn_16_0 = stackOut_14_0;
                      break L15;
                    }
                  } else {
                    stackOut_12_0 = 128;
                    stackIn_16_0 = stackOut_12_0;
                    break L15;
                  }
                }
                L16: {
                  var14 = stackIn_16_0;
                  var15 = var63[var13] * param6 + (var64[var13] * param3 + param4 * var65[var13]) >> 8;
                  stackOut_16_0 = na.field_K;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (var15 >= 0) {
                    stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                    stackOut_18_1 = var15;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L16;
                  } else {
                    stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                    stackOut_17_1 = -var15;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L16;
                  }
                }
                var15 = stackIn_19_0[stackIn_19_1];
                var14 = var14 * (256 - var15) >>> 8;
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
            stackOut_51_0 = (RuntimeException) var8;
            stackOut_51_1 = new StringBuilder().append("gh.C(");
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + param1 + ',' + 116 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static double a(double param0) {
        return ah.field_a[(int)(32768.0 * param0 / 3.141592653589793) & 65535];
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 11653) {
            boolean discarded$0 = gh.a(-108, 3);
        }
        return 0 != (w.field_m & 1 << -param0) ? true : false;
    }

    public static void a() {
        field_f = null;
        int var1 = 2;
    }

    gh(boolean param0) {
        ((gh) this).field_d = param0 ? true : false;
    }

    static {
    }
}
