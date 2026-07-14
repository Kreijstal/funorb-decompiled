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
                  if (vo.e(1)) {
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
        int[] var8 = null;
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
        int stackIn_17_0 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        af stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        short stackOut_27_0 = 0;
        short stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        af stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_17_0 = null;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          L1: {
            var40 = ZombieDawnMulti.field_E ? 1 : 0;
            var45 = param0;
            if (var45.field_z == null) {
              break L1;
            } else {
              if ((var45.field_m ^ -1) < -2) {
                var62 = var45.field_z;
                si.a(0, 255, var62, nn.field_c, 0);
                break L0;
              } else {
                break L1;
              }
            }
          }
          pn.b(8);
          break L0;
        }
        L2: {
          if (param2 >= 44) {
            break L2;
          } else {
            boolean discarded$1 = gh.a(-93);
            break L2;
          }
        }
        var66 = new int[param0.field_o];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
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
                return;
              } else {
                L5: {
                  var14 = ah.field_f[var44];
                  var15 = param0.field_y[var14];
                  var16 = param0.field_L[var14];
                  var17 = param0.field_H[var14];
                  if (param0.field_F[var14] < eb.field_J.length) {
                    stackOut_25_0 = param0.field_F[var14];
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
                  if (param0.field_K[var14] >= eb.field_J.length) {
                    stackOut_28_0 = -1;
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  } else {
                    stackOut_27_0 = param0.field_K[var14];
                    stackIn_29_0 = stackOut_27_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_29_0;
                  if (eb.field_J.length > param0.field_x[var14]) {
                    stackOut_31_0 = param0.field_x[var14];
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
                    if (qh.field_f == null) {
                      break L9;
                    } else {
                      if (null == param0.field_c) {
                        break L9;
                      } else {
                        if (param0.field_c.length <= var14) {
                          break L9;
                        } else {
                          if ((param0.field_c[var14] ^ -1) == 0) {
                            break L9;
                          } else {
                            if (param0.field_c[var14] >= qh.field_f.length) {
                              break L9;
                            } else {
                              stackOut_37_0 = qh.field_f[param0.field_c[var14]];
                              stackIn_39_0 = stackOut_37_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_38_0 = null;
                  stackIn_39_0 = (af) (Object) stackOut_38_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_39_0;
                  var22 = lo.field_j[var15];
                  var23 = jk.field_k[var15];
                  var24 = lo.field_j[var16];
                  var25 = jk.field_k[var16];
                  var26 = lo.field_j[var17];
                  var27 = jk.field_k[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var19 == var20) {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 == null) {
                          stackOut_48_0 = 8355711;
                          stackIn_49_0 = stackOut_48_0;
                          break L11;
                        } else {
                          stackOut_47_0 = var21.field_f;
                          stackIn_49_0 = stackOut_47_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_49_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = (var28 * var31 & -16711894) >>> 1840684584 | (16711900 & var32 * var28) >>> 256767688;
                      var33 = var33 + var29 * 65793;
                      mo.a(var22, 8355711 & var33 >> 1033251745, var23, var24, var25, var26, var27, (byte) 58);
                      var44++;
                      continue L4;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21 == null) {
                    stackOut_44_0 = 8355711;
                    stackIn_45_0 = stackOut_44_0;
                    break L12;
                  } else {
                    stackOut_43_0 = var21.field_f;
                    stackIn_45_0 = stackOut_43_0;
                    break L12;
                  }
                }
                var34 = stackIn_45_0;
                var35 = 16711935 & var34;
                var36 = var34 & 65280;
                var37 = (16711726 & var36 * var28) >>> 176816968 | -1962999553 & var35 * var28 >>> -1471903512;
                var38 = 1258225919 & var35 * var29 >>> -718166392 | (16711826 & var36 * var29) >>> -578303544;
                var37 = var37 + var31 * 65793;
                var39 = (16711695 & var36 * var30) >>> -1948119384 | -1140915969 & var30 * var35 >>> -1606232920;
                var38 = var38 + var32 * 65793;
                var39 = var39 + var33 * 65793;
                qe.a(var39 >> -1405369648, 255 & var37, var37 >> -1084372752, var37 >> 1010900008 & 255, 255 & var39, var27, 255 & var38, var26, var23, (var39 & 65366) >> -288412440, (65470 & var38) >> -85342808, var38 >> -292496848, var25, var24, var22, 121);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = var63[var13] * param7 + (var64[var13] * param1 + var65[var13] * param5) >> -1096849464;
              if (0 > var14) {
                var14 = -var14;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if ((var14 ^ -1) <= -1) {
                if (var14 >= 128) {
                  stackOut_16_0 = 256;
                  stackIn_17_0 = stackOut_16_0;
                  break L14;
                } else {
                  stackOut_15_0 = 128 - -var14;
                  stackIn_17_0 = stackOut_15_0;
                  break L14;
                }
              } else {
                stackOut_13_0 = 128;
                stackIn_17_0 = stackOut_13_0;
                break L14;
              }
            }
            L15: {
              var14 = stackIn_17_0;
              var15 = var63[var13] * param6 + (var64[var13] * param3 + param4 * var65[var13]) >> -1215445816;
              stackOut_17_0 = na.field_K;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (-1 >= (var15 ^ -1)) {
                stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                stackOut_19_1 = var15;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L15;
              } else {
                stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                stackOut_18_1 = -var15;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L15;
              }
            }
            var15 = stackIn_20_0[stackIn_20_1];
            var14 = var14 * (256 - var15) >>> 373347976;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
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
            boolean discarded$0 = gh.a(-108, 3);
        }
        return 0 != (w.field_m & 1 << -param0) ? true : false;
    }

    public static void a(byte param0) {
        field_f = null;
        int var1 = 2 / ((param0 - -7) / 59);
    }

    gh(boolean param0) {
        ((gh) this).field_d = param0 ? true : false;
    }

    static {
    }
}
