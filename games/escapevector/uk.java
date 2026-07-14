/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static kk field_b;
    ga field_g;
    static String field_a;
    static hh field_j;
    ga field_e;
    ga field_k;
    ga field_c;
    ga field_d;
    ga field_i;
    ga field_f;
    static boolean field_h;

    final static void b(int param0) {
        if (!(bo.field_F == null)) {
            bo.field_F.p(0);
        }
        if (!(jb.field_r == null)) {
            jb.field_r.d(true);
        }
        if (param0 != 0) {
            Object var2 = null;
            uk.a(19, -90, 62, -122, 5, (ia) null, -13, -75);
        }
        dl.a(false);
    }

    final static void a(int param0, int[] param1, int[] param2) {
        gi.a(param0 + param1.length, param2, 1, 0, param1);
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_j = null;
        }
        field_j = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ia param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ui var21 = null;
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
        ia var45 = null;
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
        ui stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        ui stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var40 = EscapeVector.field_A;
        if (param1 == -16711760) {
          L0: {
            L1: {
              var45 = param5;
              if (var45.field_n == null) {
                break L1;
              } else {
                if ((var45.field_I ^ -1) >= -2) {
                  break L1;
                } else {
                  var62 = var45.field_n;
                  g.a(var62, 0, ul.field_I, 114, 0);
                  break L0;
                }
              }
            }
            od.f(46);
            break L0;
          }
          var66 = new int[param5.field_M];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var67 = new int[param5.field_M];
          var64 = oi.field_L;
          var65 = df.field_f;
          var63 = oe.field_xb;
          var13 = 0;
          L2: while (true) {
            if (param5.field_M <= var13) {
              var44 = 0;
              var13 = var44;
              L3: while (true) {
                if (var44 >= aj.field_d) {
                  return;
                } else {
                  L4: {
                    var14 = bc.field_f[var44];
                    var15 = param5.field_e[var14];
                    var16 = param5.field_o[var14];
                    var17 = param5.field_f[var14];
                    if (param5.field_h[var14] >= oi.field_L.length) {
                      stackOut_24_0 = -1;
                      stackIn_25_0 = stackOut_24_0;
                      break L4;
                    } else {
                      stackOut_23_0 = param5.field_h[var14];
                      stackIn_25_0 = stackOut_23_0;
                      break L4;
                    }
                  }
                  L5: {
                    var18 = stackIn_25_0;
                    if (param5.field_u[var14] >= oi.field_L.length) {
                      stackOut_27_0 = -1;
                      stackIn_28_0 = stackOut_27_0;
                      break L5;
                    } else {
                      stackOut_26_0 = param5.field_u[var14];
                      stackIn_28_0 = stackOut_26_0;
                      break L5;
                    }
                  }
                  L6: {
                    var19 = stackIn_28_0;
                    if (param5.field_j[var14] < oi.field_L.length) {
                      stackOut_30_0 = param5.field_j[var14];
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
                      if (tj.field_y == null) {
                        break L8;
                      } else {
                        if (param5.field_m == null) {
                          break L8;
                        } else {
                          if (var14 >= param5.field_m.length) {
                            break L8;
                          } else {
                            if (param5.field_m[var14] == -1) {
                              break L8;
                            } else {
                              if (param5.field_m[var14] < tj.field_y.length) {
                                stackOut_38_0 = tj.field_y[param5.field_m[var14]];
                                stackIn_39_0 = stackOut_38_0;
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_37_0 = null;
                    stackIn_39_0 = (ui) (Object) stackOut_37_0;
                    break L7;
                  }
                  L9: {
                    var21 = stackIn_39_0;
                    var22 = on.field_g[var15];
                    var23 = ni.field_D[var15];
                    var24 = on.field_g[var16];
                    var25 = ni.field_D[var16];
                    var26 = on.field_g[var17];
                    var27 = ni.field_D[var17];
                    if (var19 != var18) {
                      break L9;
                    } else {
                      if (var20 == var19) {
                        L10: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21 == null) {
                            stackOut_48_0 = 8355711;
                            stackIn_49_0 = stackOut_48_0;
                            break L10;
                          } else {
                            stackOut_47_0 = var21.field_c;
                            stackIn_49_0 = stackOut_47_0;
                            break L10;
                          }
                        }
                        var30 = stackIn_49_0;
                        var31 = var30 & 16711935;
                        var32 = var30 & 65280;
                        var33 = var32 * var28 >>> 598527016 & -805241088 | -2030108417 & var31 * var28 >>> -1694909368;
                        var33 = var33 + 65793 * var29;
                        rc.a(var26, var22, var27, var33 >> 176416481 & 8355711, true, var23, var24, var25);
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
                      stackOut_44_0 = 8355711;
                      stackIn_45_0 = stackOut_44_0;
                      break L11;
                    } else {
                      stackOut_43_0 = var21.field_c;
                      stackIn_45_0 = stackOut_43_0;
                      break L11;
                    }
                  }
                  var34 = stackIn_45_0;
                  var35 = var34 & 16711935;
                  var36 = var34 & 65280;
                  var37 = (var28 * var36 & 16711908) >>> 1566274664 | var28 * var35 >>> 277004296 & 1090453759;
                  var38 = (16711930 & var29 * var36) >>> -442202712 | -1778450177 & var35 * var29 >>> -52754904;
                  var37 = var37 + 65793 * var31;
                  var39 = (16711870 & var30 * var36) >>> -1219072504 | (var35 * var30 & -16711760) >>> 321200200;
                  var38 = var38 + 65793 * var32;
                  var39 = var39 + 65793 * var33;
                  ei.a(var24, var23, var22, 255 & var39 >> 1550883976, var38 >> -247082960, var27, var39 >> 169084592, var26, var25, -15733, 255 & var39, 255 & var37, var37 >> 1177211760, var38 & 255, (var37 & 65293) >> 848079624, 255 & var38 >> -733664248);
                  var44++;
                  continue L3;
                }
              }
            } else {
              L12: {
                var14 = param6 * var63[var13] + param2 * var64[var13] - -(param7 * var65[var13]) >> 1500968808;
                if (0 > var14) {
                  var14 = -var14;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (-1 < (var14 ^ -1)) {
                  stackOut_15_0 = 128;
                  stackIn_16_0 = stackOut_15_0;
                  break L13;
                } else {
                  if (128 <= var14) {
                    stackOut_14_0 = 256;
                    stackIn_16_0 = stackOut_14_0;
                    break L13;
                  } else {
                    stackOut_13_0 = 128 + var14;
                    stackIn_16_0 = stackOut_13_0;
                    break L13;
                  }
                }
              }
              L14: {
                var14 = stackIn_16_0;
                var15 = param4 * var63[var13] + var64[var13] * param3 - -(param0 * var65[var13]) >> -2045117944;
                stackOut_16_0 = pb.field_c;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (var15 < 0) {
                  stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                  stackOut_18_1 = -var15;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L14;
                } else {
                  stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                  stackOut_17_1 = var15;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L14;
                }
              }
              var15 = stackIn_19_0[stackIn_19_1];
              var14 = (256 + -var15) * var14 >>> -2108667064;
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

    uk() {
        ((uk) this).field_e = new ga(0, 0);
        ((uk) this).field_g = new ga(0, 0);
        ((uk) this).field_c = new ga(0, 0);
        ((uk) this).field_d = new ga(0, 0);
        ((uk) this).field_k = new ga(0, 0);
        ((uk) this).field_f = new ga(0, 0);
        ((uk) this).field_i = new ga(0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Score: ";
        field_h = false;
    }
}
