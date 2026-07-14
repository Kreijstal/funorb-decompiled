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
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        uca var21 = null;
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
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        uca stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        uca stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          L1: {
            var40 = TombRacer.field_G ? 1 : 0;
            var45 = param3;
            if (null == var45.field_q) {
              break L1;
            } else {
              if ((var45.field_K ^ -1) >= -2) {
                break L1;
              } else {
                var62 = var45.field_q;
                uu.a(0, 2507, var62, 0, ow.field_q);
                break L0;
              }
            }
          }
          ne.a((byte) -124);
          break L0;
        }
        var66 = new int[param3.field_A];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param3.field_A];
        var65 = ada.field_y;
        var64 = ie.field_i;
        var63 = dd.field_d;
        if (param7 == -23) {
          var13 = 0;
          L2: while (true) {
            if (param3.field_A <= var13) {
              var44 = 0;
              var13 = var44;
              L3: while (true) {
                if (var44 >= pq.field_f) {
                  return;
                } else {
                  L4: {
                    var14 = aia.field_t[var44];
                    var15 = param3.field_B[var14];
                    var16 = param3.field_w[var14];
                    var17 = param3.field_f[var14];
                    if (ada.field_y.length > param3.field_C[var14]) {
                      stackOut_24_0 = param3.field_C[var14];
                      stackIn_25_0 = stackOut_24_0;
                      break L4;
                    } else {
                      stackOut_23_0 = -1;
                      stackIn_25_0 = stackOut_23_0;
                      break L4;
                    }
                  }
                  L5: {
                    var18 = stackIn_25_0;
                    if (ada.field_y.length <= param3.field_s[var14]) {
                      stackOut_27_0 = -1;
                      stackIn_28_0 = stackOut_27_0;
                      break L5;
                    } else {
                      stackOut_26_0 = param3.field_s[var14];
                      stackIn_28_0 = stackOut_26_0;
                      break L5;
                    }
                  }
                  L6: {
                    var19 = stackIn_28_0;
                    if (param3.field_y[var14] < ada.field_y.length) {
                      stackOut_30_0 = param3.field_y[var14];
                      stackIn_31_0 = stackOut_30_0;
                      break L6;
                    } else {
                      stackOut_29_0 = -1;
                      stackIn_31_0 = stackOut_29_0;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var20 = stackIn_31_0;
                      if (ej.field_d == null) {
                        break L8;
                      } else {
                        if (null == param3.field_M) {
                          break L8;
                        } else {
                          if (var14 >= param3.field_M.length) {
                            break L8;
                          } else {
                            if (0 == (param3.field_M[var14] ^ -1)) {
                              break L8;
                            } else {
                              if (ej.field_d.length <= param3.field_M[var14]) {
                                break L8;
                              } else {
                                stackOut_36_0 = ej.field_d[param3.field_M[var14]];
                                stackIn_38_0 = stackOut_36_0;
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_37_0 = null;
                    stackIn_38_0 = (uca) (Object) stackOut_37_0;
                    break L7;
                  }
                  L9: {
                    var21 = stackIn_38_0;
                    var22 = ds.field_f[var15];
                    var23 = mg.field_e[var15];
                    var24 = ds.field_f[var16];
                    var25 = mg.field_e[var16];
                    var26 = ds.field_f[var17];
                    var27 = mg.field_e[var17];
                    if (var19 != var18) {
                      break L9;
                    } else {
                      if (var19 == var20) {
                        L10: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21 == null) {
                            stackOut_47_0 = 8355711;
                            stackIn_48_0 = stackOut_47_0;
                            break L10;
                          } else {
                            stackOut_46_0 = var21.field_e;
                            stackIn_48_0 = stackOut_46_0;
                            break L10;
                          }
                        }
                        var30 = stackIn_48_0;
                        var31 = var30 & 16711935;
                        var32 = 65280 & var30;
                        var33 = (var32 * var28 & 16711789) >>> 1275341896 | (var28 * var31 & -16711744) >>> 1107163048;
                        var33 = var33 + var29 * 65793;
                        oea.a(var25, -8543, var26, var23, var27, var22, (var33 & 16711422) >> 417457761, var24);
                        var44++;
                        continue L3;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    var28 = var66[var18];
                    var29 = var66[var19];
                    var30 = var66[var20];
                    var31 = var67[var18];
                    var32 = var67[var19];
                    var33 = var67[var20];
                    if (var21 == null) {
                      stackOut_43_0 = 8355711;
                      stackIn_44_0 = stackOut_43_0;
                      break L11;
                    } else {
                      stackOut_42_0 = var21.field_e;
                      stackIn_44_0 = stackOut_42_0;
                      break L11;
                    }
                  }
                  var34 = stackIn_44_0;
                  var35 = 16711935 & var34;
                  var36 = var34 & 65280;
                  var37 = (var28 * var36 & 16711823) >>> -2121140824 | (var28 * var35 & -16711692) >>> -928617080;
                  var38 = (16711869 & var36 * var29) >>> 1837446120 | (var35 * var29 & -16711781) >>> 700831304;
                  var37 = var37 + 65793 * var31;
                  var38 = var38 + 65793 * var32;
                  var39 = var30 * var35 >>> 547425576 & 1140785407 | (16711738 & var36 * var30) >>> -699064728;
                  var39 = var39 + var33 * 65793;
                  cm.a(var25, (65365 & var39) >> 723341064, var37 >> 631380528, var38 >> 1454207504, var24, var38 >> -1147318584 & 255, var26, 117, var22, var39 & 255, var39 >> 1647718928, var37 >> 1882400200 & 255, var23, 255 & var38, var27, 255 & var37);
                  var44++;
                  continue L3;
                }
              }
            } else {
              L12: {
                var14 = param0 * var63[var13] + (var64[var13] * param1 + param4 * var65[var13]) >> -878188408;
                if (-1 < (var14 ^ -1)) {
                  var14 = -var14;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if ((var14 ^ -1) > -1) {
                  stackOut_15_0 = 128;
                  stackIn_16_0 = stackOut_15_0;
                  break L13;
                } else {
                  if (var14 < 128) {
                    stackOut_14_0 = var14 + 128;
                    stackIn_16_0 = stackOut_14_0;
                    break L13;
                  } else {
                    stackOut_13_0 = 256;
                    stackIn_16_0 = stackOut_13_0;
                    break L13;
                  }
                }
              }
              L14: {
                var14 = stackIn_16_0;
                var15 = param5 * var63[var13] + var64[var13] * param2 + var65[var13] * param6 >> 562363016;
                stackOut_16_0 = gta.field_g;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (-1 >= (var15 ^ -1)) {
                  stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                  stackOut_18_1 = var15;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L14;
                } else {
                  stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                  stackOut_17_1 = -var15;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L14;
                }
              }
              var15 = stackIn_19_0[stackIn_19_1];
              var14 = (256 + -var15) * var14 >>> 756666824;
              var66[var13] = var14;
              var67[var13] = var15;
              var13++;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -6) {
            field_e = null;
        }
        field_e = null;
    }

    final static int a(da param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, String param12) {
        if (param9 != 29870) {
            field_e = null;
        }
        return param0.a((aa) null, param11, param3, 0, param7, jg.a(param1, (byte) -90, param8), (int[]) null, param2, jg.a(param1, (byte) -45, param6), param12, (byte) -118, param5, 0, (nh[]) null, param4, param10);
    }

    static {
    }
}
