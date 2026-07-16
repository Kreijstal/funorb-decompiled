/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static String field_g;
    String field_d;
    String field_i;
    String field_c;
    static String[] field_e;
    int field_f;
    static int[] field_b;
    rh field_a;
    static int field_h;

    final static dj a(rh param0, String param1, rh param2, byte param3, String param4) {
        if (param3 <= 88) {
            tc.a((byte) 1);
        }
        int var5 = param2.a(param4, (byte) -100);
        int var6 = param2.a(param1, (byte) -15, var5);
        return ni.a(var6, -2974, param0, param2, var5);
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        if (param0 != -75) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, si param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        re var21_ref = null;
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
        si var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        re stackIn_37_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_22_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        short stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        re stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          L1: {
            var40 = fleas.field_A ? 1 : 0;
            var45 = param7;
            if (var45.field_J == null) {
              break L1;
            } else {
              if (1 >= var45.field_h) {
                break L1;
              } else {
                var62 = var45.field_J;
                qj.a(0, 0, var62, ge.field_e, 0);
                break L0;
              }
            }
          }
          pb.b((byte) 124);
          break L0;
        }
        L2: {
          var66 = new int[param7.field_p];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var67 = new int[param7.field_p];
          if (param4 == 30675) {
            break L2;
          } else {
            field_b = null;
            break L2;
          }
        }
        var64 = field_b;
        var65 = lj.field_j;
        var63 = nb.field_d;
        var13 = 0;
        L3: while (true) {
          if (var13 >= param7.field_p) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= vc.field_d) {
                return;
              } else {
                L5: {
                  var14 = pk.field_J[var44];
                  var15 = param7.field_Q[var14];
                  var16 = param7.field_M[var14];
                  var17 = param7.field_N[var14];
                  if (param7.field_D[var14] >= field_b.length) {
                    stackOut_23_0 = -1;
                    stackIn_24_0 = stackOut_23_0;
                    break L5;
                  } else {
                    stackOut_22_0 = param7.field_D[var14];
                    stackIn_24_0 = stackOut_22_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_24_0;
                  if (param7.field_F[var14] < field_b.length) {
                    stackOut_26_0 = param7.field_F[var14];
                    stackIn_27_0 = stackOut_26_0;
                    break L6;
                  } else {
                    stackOut_25_0 = -1;
                    stackIn_27_0 = stackOut_25_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_27_0;
                  if (param7.field_u[var14] < field_b.length) {
                    stackOut_29_0 = param7.field_u[var14];
                    stackIn_30_0 = stackOut_29_0;
                    break L7;
                  } else {
                    stackOut_28_0 = -1;
                    stackIn_30_0 = stackOut_28_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_30_0;
                    if (null == fc.field_a) {
                      break L9;
                    } else {
                      if (null == param7.field_s) {
                        break L9;
                      } else {
                        if (var14 >= param7.field_s.length) {
                          break L9;
                        } else {
                          if (param7.field_s[var14] == -1) {
                            break L9;
                          } else {
                            if (param7.field_s[var14] >= fc.field_a.length) {
                              break L9;
                            } else {
                              stackOut_35_0 = fc.field_a[param7.field_s[var14]];
                              stackIn_37_0 = stackOut_35_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_36_0 = null;
                  stackIn_37_0 = (re) (Object) stackOut_36_0;
                  break L8;
                }
                L10: {
                  var21_ref = stackIn_37_0;
                  var22 = kb.field_o[var15];
                  var23 = il.field_c[var15];
                  var24 = kb.field_o[var16];
                  var25 = il.field_c[var16];
                  var26 = kb.field_o[var17];
                  var27 = il.field_c[var17];
                  if (var19 != var18) {
                    break L10;
                  } else {
                    if (var20 != var19) {
                      break L10;
                    } else {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21_ref == null) {
                          stackOut_41_0 = 8355711;
                          stackIn_42_0 = stackOut_41_0;
                          break L11;
                        } else {
                          stackOut_40_0 = var21_ref.field_a;
                          stackIn_42_0 = stackOut_40_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_42_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = var28 * var32 >>> 2087189608 & 1157693184 | -117505793 & var31 * var28 >>> 559768840;
                      var33 = var33 + 65793 * var29;
                      wb.a(var26, var25, var27, (byte) -39, (16711422 & var33) >> 1937374913, var23, var22, var24);
                      var44++;
                      continue L4;
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
                  if (var21_ref != null) {
                    stackOut_45_0 = var21_ref.field_a;
                    stackIn_46_0 = stackOut_45_0;
                    break L12;
                  } else {
                    stackOut_44_0 = 8355711;
                    stackIn_46_0 = stackOut_44_0;
                    break L12;
                  }
                }
                var34 = stackIn_46_0;
                var35 = var34 & 16711935;
                var36 = 65280 & var34;
                var37 = var35 * var28 >>> -665232408 & 671023359 | (var36 * var28 & 16711700) >>> -890855480;
                var38 = (var36 * var29 & 16711890) >>> 2066697608 | -654376705 & var29 * var35 >>> -912166008;
                var38 = var38 + var32 * 65793;
                var37 = var37 + 65793 * var31;
                var39 = (var35 * var30 & -16711845) >>> 1591545288 | (16711734 & var36 * var30) >>> -2109765400;
                var39 = var39 + 65793 * var33;
                oh.a(var27, 255 & var39, var22, (65365 & var37) >> -1752078744, var26, 0, 255 & var38, var38 >> 1305515184, var23, var37 & 255, var39 >> -811291344, var25, (var38 & 65423) >> 889888520, var37 >> -616283376, var24, 255 & var39 >> 663244424);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param1 * var63[var13] + param6 * var64[var13] - -(var65[var13] * param5) >> 27638280;
              if (0 <= var14) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (0 <= var14) {
                if (128 > var14) {
                  stackOut_14_0 = var14 + 128;
                  stackIn_15_0 = stackOut_14_0;
                  break L14;
                } else {
                  stackOut_13_0 = 256;
                  stackIn_15_0 = stackOut_13_0;
                  break L14;
                }
              } else {
                stackOut_11_0 = 128;
                stackIn_15_0 = stackOut_11_0;
                break L14;
              }
            }
            L15: {
              var14 = stackIn_15_0;
              var15 = param3 * var63[var13] + (var64[var13] * param0 + param2 * var65[var13]) >> -47248056;
              stackOut_15_0 = h.field_b;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if ((var15 ^ -1) <= -1) {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = var15;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L15;
              } else {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = -var15;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L15;
              }
            }
            var15 = stackIn_18_0[stackIn_18_1];
            var14 = var14 * (256 + -var15) >>> 1278459016;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        if (!bh.a((byte) 109, param2, param1)) {
            return false;
        }
        for (var3 = 0; param1.length() > var3; var3++) {
            if (!(gi.a(45, param1.charAt(var3)))) {
                return false;
            }
        }
        if (param0 != 82) {
            field_g = null;
            return true;
        }
        return true;
    }

    private tc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Just play";
        field_b = new int[8192];
        field_h = 0;
    }
}
