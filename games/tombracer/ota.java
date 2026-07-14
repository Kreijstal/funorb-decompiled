/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ota {
    static cn field_b;
    static String[] field_a;
    static int field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
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
        int[] var39 = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var47 = TombRacer.field_G ? 1 : 0;
        var8 = 0;
        var9 = param1;
        var10 = 0;
        var11 = -param0 + param2;
        var12 = param1 - param0;
        var13 = param2 * param2;
        var14 = param1 * param1;
        if (param5 == -1923382751) {
          var15 = var11 * var11;
          var16 = var12 * var12;
          var17 = var14 << 453246881;
          var18 = var13 << -865266815;
          var19 = var16 << -881731839;
          var20 = var15 << -701983231;
          var21 = param1 << -1637823263;
          var22 = var12 << -1923382751;
          var23 = var17 + (-var21 + 1) * var13;
          var24 = -((var21 + -1) * var18) + var14;
          var25 = (-var22 + 1) * var15 - -var19;
          var26 = var16 + -(var20 * (-1 + var22));
          var27 = var13 << -1770773694;
          var28 = var14 << 401114786;
          var29 = var15 << 676459202;
          var30 = var16 << 2024441922;
          var31 = var17 * 3;
          var32 = (var21 + -3) * var18;
          var33 = 3 * var19;
          var34 = (-3 + var22) * var20;
          var35 = var28;
          var36 = var27 * (-1 + param1);
          var37 = var30;
          var38 = (-1 + var12) * var29;
          var51 = vaa.field_a[param7];
          var50 = var51;
          var49 = var50;
          var48 = var49;
          var39 = var48;
          nra.a((byte) -55, param3, param4 + -var11, var39, -param2 + param4);
          nra.a((byte) -55, param6, param4 + var11, var39, param4 + -var11);
          nra.a((byte) -55, param3, param2 + param4, var51, param4 + var11);
          L0: while (true) {
            if (-1 <= (var9 ^ -1)) {
              return;
            } else {
              L1: {
                if (var12 < var9) {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L1;
                } else {
                  stackOut_29_0 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L1;
                }
              }
              L2: {
                var40 = stackIn_31_0;
                if (0 <= var23) {
                  break L2;
                } else {
                  L3: while (true) {
                    if (0 <= var23) {
                      break L2;
                    } else {
                      var24 = var24 + var35;
                      var23 = var23 + var31;
                      var35 = var35 + var28;
                      var8++;
                      var31 = var31 + var28;
                      continue L3;
                    }
                  }
                }
              }
              L4: {
                if (var40 != 0) {
                  L5: {
                    if (-1 < (var25 ^ -1)) {
                      L6: while (true) {
                        if (var25 >= 0) {
                          break L5;
                        } else {
                          var26 = var26 + var37;
                          var25 = var25 + var33;
                          var33 = var33 + var30;
                          var37 = var37 + var30;
                          var10++;
                          continue L6;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (-1 < (var26 ^ -1)) {
                      var26 = var26 + var37;
                      var25 = var25 + var33;
                      var10++;
                      var37 = var37 + var30;
                      var33 = var33 + var30;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var25 = var25 + -var38;
                  var26 = var26 + -var34;
                  var38 = var38 - var29;
                  var34 = var34 - var29;
                  break L4;
                } else {
                  break L4;
                }
              }
              L8: {
                if ((var24 ^ -1) > -1) {
                  var23 = var23 + var31;
                  var24 = var24 + var35;
                  var31 = var31 + var28;
                  var35 = var35 + var28;
                  var8++;
                  break L8;
                } else {
                  break L8;
                }
              }
              var24 = var24 + -var32;
              var23 = var23 + -var36;
              var9--;
              var32 = var32 - var27;
              var36 = var36 - var27;
              var41 = -var9 + param7;
              var42 = var9 + param7;
              var43 = param4 + var8;
              var44 = -var8 + param4;
              if (var40 != 0) {
                var45 = param4 + var10;
                var46 = param4 + -var10;
                nra.a((byte) -55, param3, var46, vaa.field_a[var41], var44);
                nra.a((byte) -55, param6, var45, vaa.field_a[var41], var46);
                nra.a((byte) -55, param3, var43, vaa.field_a[var41], var45);
                nra.a((byte) -55, param3, var46, vaa.field_a[var42], var44);
                nra.a((byte) -55, param6, var45, vaa.field_a[var42], var46);
                nra.a((byte) -55, param3, var43, vaa.field_a[var42], var45);
                continue L0;
              } else {
                nra.a((byte) -55, param3, var43, vaa.field_a[var41], var44);
                nra.a((byte) -55, param3, var43, vaa.field_a[var42], var44);
                continue L0;
              }
            }
          }
        } else {
          field_b = null;
          var15 = var11 * var11;
          var16 = var12 * var12;
          var17 = var14 << 453246881;
          var18 = var13 << -865266815;
          var19 = var16 << -881731839;
          var20 = var15 << -701983231;
          var21 = param1 << -1637823263;
          var22 = var12 << -1923382751;
          var23 = var17 + (-var21 + 1) * var13;
          var24 = -((var21 + -1) * var18) + var14;
          var25 = (-var22 + 1) * var15 - -var19;
          var26 = var16 + -(var20 * (-1 + var22));
          var27 = var13 << -1770773694;
          var28 = var14 << 401114786;
          var29 = var15 << 676459202;
          var30 = var16 << 2024441922;
          var31 = var17 * 3;
          var32 = (var21 + -3) * var18;
          var33 = 3 * var19;
          var34 = (-3 + var22) * var20;
          var35 = var28;
          var36 = var27 * (-1 + param1);
          var37 = var30;
          var38 = (-1 + var12) * var29;
          var51 = vaa.field_a[param7];
          var50 = var51;
          var49 = var50;
          var48 = var49;
          var39 = var48;
          nra.a((byte) -55, param3, param4 + -var11, var39, -param2 + param4);
          nra.a((byte) -55, param6, param4 + var11, var39, param4 + -var11);
          nra.a((byte) -55, param3, param2 + param4, var51, param4 + var11);
          L9: while (true) {
            if (-1 <= (var9 ^ -1)) {
              return;
            } else {
              L10: {
                if (var12 < var9) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L10;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L10;
                }
              }
              L11: {
                var40 = stackIn_6_0;
                if (0 <= var23) {
                  break L11;
                } else {
                  L12: while (true) {
                    if (0 <= var23) {
                      break L11;
                    } else {
                      var24 = var24 + var35;
                      var23 = var23 + var31;
                      var35 = var35 + var28;
                      var8++;
                      var31 = var31 + var28;
                      continue L12;
                    }
                  }
                }
              }
              L13: {
                if (var40 != 0) {
                  L14: {
                    if (-1 < (var25 ^ -1)) {
                      L15: while (true) {
                        if (var25 >= 0) {
                          break L14;
                        } else {
                          var26 = var26 + var37;
                          var25 = var25 + var33;
                          var33 = var33 + var30;
                          var37 = var37 + var30;
                          var10++;
                          continue L15;
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                  L16: {
                    if (-1 < (var26 ^ -1)) {
                      var26 = var26 + var37;
                      var25 = var25 + var33;
                      var10++;
                      var37 = var37 + var30;
                      var33 = var33 + var30;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  var25 = var25 + -var38;
                  var26 = var26 + -var34;
                  var38 = var38 - var29;
                  var34 = var34 - var29;
                  break L13;
                } else {
                  break L13;
                }
              }
              L17: {
                if ((var24 ^ -1) > -1) {
                  var23 = var23 + var31;
                  var24 = var24 + var35;
                  var31 = var31 + var28;
                  var35 = var35 + var28;
                  var8++;
                  break L17;
                } else {
                  break L17;
                }
              }
              var24 = var24 + -var32;
              var23 = var23 + -var36;
              var9--;
              var32 = var32 - var27;
              var36 = var36 - var27;
              var41 = -var9 + param7;
              var42 = var9 + param7;
              var43 = param4 + var8;
              var44 = -var8 + param4;
              if (var40 != 0) {
                var45 = param4 + var10;
                var46 = param4 + -var10;
                nra.a((byte) -55, param3, var46, vaa.field_a[var41], var44);
                nra.a((byte) -55, param6, var45, vaa.field_a[var41], var46);
                nra.a((byte) -55, param3, var43, vaa.field_a[var41], var45);
                nra.a((byte) -55, param3, var46, vaa.field_a[var42], var44);
                nra.a((byte) -55, param6, var45, vaa.field_a[var42], var46);
                nra.a((byte) -55, param3, var43, vaa.field_a[var42], var45);
                continue L9;
              } else {
                nra.a((byte) -55, param3, var43, vaa.field_a[var41], var44);
                nra.a((byte) -55, param3, var43, vaa.field_a[var42], var44);
                continue L9;
              }
            }
          }
        }
    }

    protected ota() throws Throwable {
        throw new Error();
    }

    final static boolean a(long param0, byte param1, String param2) {
        mu var4 = null;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param1 == 13) {
          var4 = wp.a(126, param2);
          if (var4 != null) {
            if (null == var4.field_Cb) {
              L0: {
                L1: {
                  if (null == uu.field_a) {
                    break L1;
                  } else {
                    if (null == vba.a((byte) -40, param0)) {
                      break L1;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L0;
                    }
                  }
                }
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L0;
              }
              return stackIn_30_0 != 0;
            } else {
              return true;
            }
          } else {
            L2: {
              L3: {
                if (null == uu.field_a) {
                  break L3;
                } else {
                  if (null == vba.a((byte) -40, param0)) {
                    break L3;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L2;
                  }
                }
              }
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L2;
            }
            return stackIn_23_0 != 0;
          }
        } else {
          ota.a(-17, -67, 51, -71, -111, -94, -55, 8);
          var4 = wp.a(126, param2);
          if (var4 != null) {
            if (null != var4.field_Cb) {
              return true;
            } else {
              if (null == uu.field_a) {
                return false;
              } else {
                L4: {
                  if (null == vba.a((byte) -40, param0)) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L4;
                  }
                }
                return stackIn_15_0 != 0;
              }
            }
          } else {
            if (null != uu.field_a) {
              if (null == vba.a((byte) -40, param0)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            ota.a(1);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
