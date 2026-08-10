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
        if (param0 >= 48) {
          L0: {
            L1: {
              if (10 > a.field_b) {
                break L1;
              } else {
                if (og.field_N) {
                  break L1;
                } else {
                  if (vo.e(1)) {
                    break L1;
                  } else {
                    stackIn_7_0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_7_0 = 0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(md param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        af stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        af var21 = null;
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
        md var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        var40 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param0;
                if (var44.field_z == null) {
                  break L2;
                } else {
                  if ((var44.field_m ^ -1) < -2) {
                    var60 = var44.field_z;
                    si.a(0, 255, var60, nn.field_c, 0);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              pn.b(8);
              break L1;
            }
            L3: {
              if (param2 >= 44) {
                break L3;
              } else {
                gh.a(-93);
                break L3;
              }
            }
            var54 = new int[param0.field_o];
            var49 = var54;
            var41 = var49;
            var8 = var41;
            var64 = new int[param0.field_o];
            var62 = eb.field_J;
            var61 = bq.field_g;
            var63 = wp.field_i;
            var13 = 0;
            L4: while (true) {
              if (param0.field_o <= var13) {
                var13 = 0;
                L5: while (true) {
                  if (tf.field_Eb <= var13) {
                    break L0;
                  } else {
                    L6: {
                      var14 = ah.field_f[var13];
                      var15 = param0.field_y[var14];
                      var16 = param0.field_L[var14];
                      var17 = param0.field_H[var14];
                      if (param0.field_F[var14] < eb.field_J.length) {
                        stackIn_27_0 = param0.field_F[var14];
                        break L6;
                      } else {
                        stackIn_27_0 = -1;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_27_0;
                      if (param0.field_K[var14] >= eb.field_J.length) {
                        stackIn_30_0 = -1;
                        break L7;
                      } else {
                        stackIn_30_0 = param0.field_K[var14];
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_30_0;
                      if (eb.field_J.length > param0.field_x[var14]) {
                        stackIn_33_0 = param0.field_x[var14];
                        break L8;
                      } else {
                        stackIn_33_0 = -1;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_33_0;
                        if (qh.field_f == null) {
                          break L10;
                        } else {
                          if (null == param0.field_c) {
                            break L10;
                          } else {
                            if (param0.field_c.length <= var14) {
                              break L10;
                            } else {
                              if ((param0.field_c[var14] ^ -1) == 0) {
                                break L10;
                              } else {
                                if (param0.field_c[var14] >= qh.field_f.length) {
                                  break L10;
                                } else {
                                  stackIn_40_0 = qh.field_f[param0.field_c[var14]];
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_40_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_40_0;
                        var22 = lo.field_j[var15];
                        var23 = jk.field_k[var15];
                        var24 = lo.field_j[var16];
                        var25 = jk.field_k[var16];
                        var26 = lo.field_j[var17];
                        var27 = jk.field_k[var17];
                        if (var18 != var19) {
                          break L12;
                        } else {
                          if (var19 == var20) {
                            L13: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 == null) {
                                stackIn_50_0 = 8355711;
                                break L13;
                              } else {
                                stackIn_50_0 = var21.field_f;
                                break L13;
                              }
                            }
                            var30 = stackIn_50_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = (var28 * var31 & -16711894) >>> 1840684584 | (16711900 & var32 * var28) >>> 256767688;
                            var33 = var33 + var29 * 65793;
                            mo.a(var22, 8355711 & var33 >> 1033251745, var23, var24, var25, var26, var27, (byte) 58);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 == null) {
                          stackIn_46_0 = 8355711;
                          break L14;
                        } else {
                          stackIn_46_0 = var21.field_f;
                          break L14;
                        }
                      }
                      var34 = stackIn_46_0;
                      var35 = 16711935 & var34;
                      var36 = var34 & 65280;
                      var37 = (16711726 & var36 * var28) >>> 176816968 | -1962999553 & var35 * var28 >>> -1471903512;
                      var38 = 1258225919 & var35 * var29 >>> -718166392 | (16711826 & var36 * var29) >>> -578303544;
                      var37 = var37 + var31 * 65793;
                      var39 = (16711695 & var36 * var30) >>> -1948119384 | -1140915969 & var30 * var35 >>> -1606232920;
                      var38 = var38 + var32 * 65793;
                      var39 = var39 + var33 * 65793;
                      qe.a(var39 >> -1405369648, 255 & var37, var37 >> -1084372752, var37 >> 1010900008 & 255, 255 & var39, var27, 255 & var38, var26, var23, (var39 & 65366) >> -288412440, (65470 & var38) >> -85342808, var38 >> -292496848, var25, var24, var22, 121);
                      break L11;
                    }
                    var13++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var61[var13] * param7 + (var62[var13] * param1 + var63[var13] * param5) >> -1096849464;
                  if (0 > var14) {
                    var14 = -var14;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if ((var14 ^ -1) <= -1) {
                    if (var14 >= 128) {
                      stackIn_18_0 = 256;
                      break L16;
                    } else {
                      stackIn_18_0 = 128 - -var14;
                      break L16;
                    }
                  } else {
                    stackIn_18_0 = 128;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_18_0;
                  var15 = var61[var13] * param6 + (var62[var13] * param3 + param4 * var63[var13]) >> -1215445816;
                  stackIn_20_0 = na.field_K;

                  if (-1 >= (var15 ^ -1)) {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = var15;
                    break L17;
                  } else {
                    stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_21_1 = -var15;
                    break L17;
                  }
                }
                var15 = stackIn_21_0[stackIn_21_1];
                var14 = var14 * (256 - var15) >>> 373347976;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var8_ref);

            stackIn_55_1 = new StringBuilder().append("gh.C(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L18;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L18;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static double a(double param0, byte param1) {
        if (param1 <= 4) {
            field_a = -9;
        }
        return ah.field_a[(int)(32768.0 * param0 / 3.141592653589793) & 65535];
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 11653) {
            gh.a(-108, 3);
        }
        return 0 != (w.field_m & 1 << -param0) ? true : false;
    }

    public static void a(byte param0) {
        field_f = null;
        int var1 = 2 / ((param0 - -7) / 59);
    }

    gh(boolean param0) {
        this.field_d = param0 ? true : false;
    }

    static {
    }
}
