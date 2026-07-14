/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf implements uk {
    static String field_c;
    static li field_a;
    static String field_d;
    static int[] field_b;

    final static void a(java.awt.Frame param0, int param1, ej param2) {
        re var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = stellarshard.field_B;
        L0: while (true) {
          var3 = param2.a(param0, (byte) -107);
          L1: while (true) {
            if (var3.field_f != 0) {
              if (-2 != (var3.field_f ^ -1)) {
                jj.a((byte) -128, 100L);
                continue L0;
              } else {
                L2: {
                  param0.setVisible(false);
                  param0.dispose();
                  if (param1 == 16711935) {
                    break L2;
                  } else {
                    var5 = null;
                    kf.a(-121, 1, -112, -24, -75, 3, (n) null, -21);
                    break L2;
                  }
                }
                return;
              }
            } else {
              jj.a((byte) -123, 10L);
              continue L1;
            }
          }
        }
    }

    final static int a(int param0) {
        if (param0 != 65280) {
            field_c = null;
        }
        return ce.field_e;
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 <= 36) {
            field_a = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, n param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        wh var21 = null;
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
        n var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        wh stackIn_36_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        short stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        wh stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          L1: {
            var40 = stellarshard.field_B;
            var45 = param6;
            if (var45.field_g == null) {
              break L1;
            } else {
              if (-2 <= (var45.field_N ^ -1)) {
                break L1;
              } else {
                var62 = var45.field_g;
                k.a(var62, 0, tg.field_a, false, 0);
                break L0;
              }
            }
          }
          vj.b((byte) 124);
          break L0;
        }
        var66 = new int[param6.field_D];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param6.field_D];
        var65 = hc.field_f;
        var64 = le.field_m;
        var63 = fl.field_d;
        var13 = 0;
        L2: while (true) {
          if (param6.field_D <= var13) {
            var14 = -37 / ((param0 - -16) / 33);
            var44 = 0;
            var13 = var44;
            L3: while (true) {
              if (var44 >= ld.field_A) {
                return;
              } else {
                L4: {
                  var14 = ki.field_z[var44];
                  var15 = param6.field_l[var14];
                  var16 = param6.field_z[var14];
                  var17 = param6.field_m[var14];
                  if (hc.field_f.length > param6.field_M[var14]) {
                    stackOut_22_0 = param6.field_M[var14];
                    stackIn_23_0 = stackOut_22_0;
                    break L4;
                  } else {
                    stackOut_21_0 = -1;
                    stackIn_23_0 = stackOut_21_0;
                    break L4;
                  }
                }
                L5: {
                  var18 = stackIn_23_0;
                  if (hc.field_f.length > param6.field_h[var14]) {
                    stackOut_25_0 = param6.field_h[var14];
                    stackIn_26_0 = stackOut_25_0;
                    break L5;
                  } else {
                    stackOut_24_0 = -1;
                    stackIn_26_0 = stackOut_24_0;
                    break L5;
                  }
                }
                L6: {
                  var19 = stackIn_26_0;
                  if (hc.field_f.length > param6.field_v[var14]) {
                    stackOut_28_0 = param6.field_v[var14];
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  } else {
                    stackOut_27_0 = -1;
                    stackIn_29_0 = stackOut_27_0;
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    var20 = stackIn_29_0;
                    if (e.field_d == null) {
                      break L8;
                    } else {
                      if (param6.field_c == null) {
                        break L8;
                      } else {
                        if (param6.field_c.length <= var14) {
                          break L8;
                        } else {
                          if (param6.field_c[var14] == -1) {
                            break L8;
                          } else {
                            if (param6.field_c[var14] >= e.field_d.length) {
                              break L8;
                            } else {
                              stackOut_34_0 = e.field_d[param6.field_c[var14]];
                              stackIn_36_0 = stackOut_34_0;
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_35_0 = null;
                  stackIn_36_0 = (wh) (Object) stackOut_35_0;
                  break L7;
                }
                L9: {
                  var21 = stackIn_36_0;
                  var22 = nh.field_d[var15];
                  var23 = od.field_s[var15];
                  var24 = nh.field_d[var16];
                  var25 = od.field_s[var16];
                  var26 = nh.field_d[var17];
                  var27 = od.field_s[var17];
                  if (var18 != var19) {
                    break L9;
                  } else {
                    if (var19 == var20) {
                      L10: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 == null) {
                          stackOut_45_0 = 8355711;
                          stackIn_46_0 = stackOut_45_0;
                          break L10;
                        } else {
                          stackOut_44_0 = var21.field_b;
                          stackIn_46_0 = stackOut_44_0;
                          break L10;
                        }
                      }
                      var30 = stackIn_46_0;
                      var31 = var30 & 16711935;
                      var32 = 65280 & var30;
                      var33 = var28 * var32 >>> -1230997720 & -2013200640 | var31 * var28 >>> 811325768 & -2130771713;
                      var33 = var33 + var29 * 65793;
                      dd.a(-31548, var26, (16711422 & var33) >> -847710143, var24, var22, var27, var23, var25);
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
                  if (var21 != null) {
                    stackOut_41_0 = var21.field_b;
                    stackIn_42_0 = stackOut_41_0;
                    break L11;
                  } else {
                    stackOut_40_0 = 8355711;
                    stackIn_42_0 = stackOut_40_0;
                    break L11;
                  }
                }
                var34 = stackIn_42_0;
                var35 = var34 & 16711935;
                var36 = 65280 & var34;
                var37 = -1677656320 & var28 * var36 >>> -2047540056 | var35 * var28 >>> 2112748680 & 1241448703;
                var38 = (-16711803 & var29 * var35) >>> 910681000 | var36 * var29 >>> 1917283592 & -1191117056;
                var39 = -838795520 & var36 * var30 >>> 1545521928 | (var30 * var35 & -16711794) >>> -1197269496;
                var38 = var38 + var32 * 65793;
                var37 = var37 + 65793 * var31;
                var39 = var39 + 65793 * var33;
                ke.a(255 & var38, var25, (var37 & 65430) >> -983845752, var38 >> -940626896, var26, 255 & var39, var39 >> -1658041072, 10, var27, var37 >> -758340016, 255 & var38 >> -30459544, var22, var23, var24, (65386 & var39) >> -1796689304, 255 & var37);
                var44++;
                continue L3;
              }
            }
          } else {
            L12: {
              var14 = param7 * var63[var13] + (var64[var13] * param1 + var65[var13] * param3) >> 198471976;
              if (0 > var14) {
                var14 = -var14;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (var14 >= 0) {
                if ((var14 ^ -1) <= -129) {
                  stackOut_13_0 = 256;
                  stackIn_14_0 = stackOut_13_0;
                  break L13;
                } else {
                  stackOut_12_0 = var14 + 128;
                  stackIn_14_0 = stackOut_12_0;
                  break L13;
                }
              } else {
                stackOut_10_0 = 128;
                stackIn_14_0 = stackOut_10_0;
                break L13;
              }
            }
            L14: {
              var14 = stackIn_14_0;
              var15 = param5 * var63[var13] + param4 * var65[var13] - -(param2 * var64[var13]) >> -191165080;
              stackOut_14_0 = ol.field_g;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (0 <= var15) {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = var15;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L14;
              } else {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = -var15;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L14;
              }
            }
            var15 = stackIn_17_0[stackIn_17_1];
            var14 = var14 * (256 + -var15) >>> -893742872;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        int var6 = param1 - -param3.field_w;
        int var7 = param2 - -param3.field_k;
        nd.a(param3.field_p, var7, param3.field_t, var6, (byte) -103);
        pb var8 = ah.field_p[1];
        if (param3 instanceof ig) {
            if (((ig) (Object) param3).field_z) {
                var8.d(1 + (var6 - -(-var8.field_w + param3.field_p >> -1459428383)), (-var8.field_x + param3.field_t >> -330493791) + 1 + var7, 256);
            }
        }
        if (param4 != 4549) {
            return;
        }
        if (!(!param3.e(0))) {
            og.a(2 + var6, (byte) 105, -4 + param3.field_p, -4 + param3.field_t, 2 + var7);
        }
    }

    final static String b(int param0) {
        if (param0 != -940626896) {
            field_c = null;
        }
        return kl.field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Start level ";
        field_a = new li(10, 2, 2, 0);
        field_b = new int[8192];
    }
}
