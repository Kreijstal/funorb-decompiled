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
            field_b = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, pk param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        nj var21 = null;
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
        pk var45 = null;
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
        nj stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        nj stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var40 = Lexicominos.field_L ? 1 : 0;
        if (param6 <= -98) {
          L0: {
            L1: {
              var45 = param7;
              if (null == var45.field_J) {
                break L1;
              } else {
                if (1 < var45.field_N) {
                  var62 = var45.field_J;
                  td.a(0, bd.field_l, 0, var62, 0);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            mb.a(0);
            break L0;
          }
          var66 = new int[param7.field_A];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var67 = new int[param7.field_A];
          var64 = qf.field_q;
          var63 = ee.field_b;
          var65 = wh.field_e;
          var13 = 0;
          L2: while (true) {
            if (var13 >= param7.field_A) {
              var44 = 0;
              var13 = var44;
              L3: while (true) {
                if (wb.field_i <= var44) {
                  return;
                } else {
                  L4: {
                    var14 = bf.field_a[var44];
                    var15 = param7.field_a[var14];
                    var16 = param7.field_k[var14];
                    var17 = param7.field_B[var14];
                    if (param7.field_j[var14] < qf.field_q.length) {
                      stackOut_24_0 = param7.field_j[var14];
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
                    if (param7.field_K[var14] >= qf.field_q.length) {
                      stackOut_27_0 = -1;
                      stackIn_28_0 = stackOut_27_0;
                      break L5;
                    } else {
                      stackOut_26_0 = param7.field_K[var14];
                      stackIn_28_0 = stackOut_26_0;
                      break L5;
                    }
                  }
                  L6: {
                    var19 = stackIn_28_0;
                    if (qf.field_q.length > param7.field_E[var14]) {
                      stackOut_30_0 = param7.field_E[var14];
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
                      if (sh.field_d == null) {
                        break L8;
                      } else {
                        if (param7.field_q == null) {
                          break L8;
                        } else {
                          if (param7.field_q.length <= var14) {
                            break L8;
                          } else {
                            if (-1 == param7.field_q[var14]) {
                              break L8;
                            } else {
                              if (param7.field_q[var14] >= sh.field_d.length) {
                                break L8;
                              } else {
                                stackOut_36_0 = sh.field_d[param7.field_q[var14]];
                                stackIn_38_0 = stackOut_36_0;
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_37_0 = null;
                    stackIn_38_0 = (nj) (Object) stackOut_37_0;
                    break L7;
                  }
                  L9: {
                    var21 = stackIn_38_0;
                    var22 = ej.field_c[var15];
                    var23 = fk.field_d[var15];
                    var24 = ej.field_c[var16];
                    var25 = fk.field_d[var16];
                    var26 = ej.field_c[var17];
                    var27 = fk.field_d[var17];
                    if (var18 != var19) {
                      break L9;
                    } else {
                      if (var20 != var19) {
                        break L9;
                      } else {
                        L10: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21 != null) {
                            stackOut_42_0 = var21.field_c;
                            stackIn_43_0 = stackOut_42_0;
                            break L10;
                          } else {
                            stackOut_41_0 = 8355711;
                            stackIn_43_0 = stackOut_41_0;
                            break L10;
                          }
                        }
                        var30 = stackIn_43_0;
                        var31 = 16711935 & var30;
                        var32 = var30 & 65280;
                        var33 = (16711773 & var32 * var28) >>> -1452152120 | (-16711764 & var31 * var28) >>> 2132277768;
                        var33 = var33 + 65793 * var29;
                        qg.a((var33 & 16711422) >> 812298529, var22, var25, var24, var27, -74, var26, var23);
                        var44++;
                        continue L3;
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
                      stackOut_46_0 = 8355711;
                      stackIn_47_0 = stackOut_46_0;
                      break L11;
                    } else {
                      stackOut_45_0 = var21.field_c;
                      stackIn_47_0 = stackOut_45_0;
                      break L11;
                    }
                  }
                  var34 = stackIn_47_0;
                  var35 = var34 & 16711935;
                  var36 = 65280 & var34;
                  var37 = -1946091776 & var36 * var28 >>> 480720744 | 1207894271 & var28 * var35 >>> -783188952;
                  var38 = (var35 * var29 & -16711819) >>> -962721624 | var36 * var29 >>> 1530568296 & 838926080;
                  var39 = var35 * var30 >>> -276576792 & 201261311 | (var36 * var30 & 16711788) >>> -923410008;
                  var37 = var37 + var31 * 65793;
                  var38 = var38 + 65793 * var32;
                  var39 = var39 + var33 * 65793;
                  uf.a((65474 & var39) >> -1489419768, var22, var39 >> -153559824, (byte) -28, var26, var38 & 255, var25, var38 >> -110227280, var24, var23, var37 & 255, var37 >> -1656301104, 255 & var37 >> 742984872, var38 >> 1255840936 & 255, 255 & var39, var27);
                  var44++;
                  continue L3;
                }
              }
            } else {
              L12: {
                var14 = param2 * var63[var13] + (var64[var13] * param1 + var65[var13] * param5) >> 1062890696;
                if (var14 >= 0) {
                  break L12;
                } else {
                  var14 = -var14;
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
                var15 = param0 * var63[var13] + param3 * var64[var13] + param4 * var65[var13] >> -489925112;
                stackOut_16_0 = gl.field_e;
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
              var14 = (-var15 + 256) * var14 >>> -1937084568;
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

    static {
    }
}
