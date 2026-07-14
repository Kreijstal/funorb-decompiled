/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static boolean field_a;

    final static boolean a(ue param0, ue param1, byte param2, ue param3) {
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        var4 = -50 % ((param2 - 3) / 33);
        if (!param3.b((byte) 126)) {
          return false;
        } else {
          if (param3.a("commonui", -9883)) {
            L0: {
              if (!param1.b((byte) 121)) {
                break L0;
              } else {
                if (param1.a("commonui", -9883)) {
                  L1: {
                    L2: {
                      if (!param0.b((byte) 100)) {
                        break L2;
                      } else {
                        if (!param0.a("button.gif", -9883)) {
                          break L2;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L1;
                        }
                      }
                    }
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L1;
                  }
                  return stackIn_12_0 != 0;
                } else {
                  break L0;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        int var2 = param1 & 255;
        if (!(0 != var2)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128) {
            if (!(160 <= var2)) {
                var3 = ee.field_c[var2 + -128];
                if (!(var3 != 0)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        if (param0 >= -6) {
            field_a = false;
        }
        return (char)var2;
    }

    final static void a(int param0, int param1, int param2, lb param3, int param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        kl var21 = null;
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
        lb var45 = null;
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
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        kl stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        kl stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
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
            var40 = StarCannon.field_A;
            var45 = param3;
            if (null == var45.field_u) {
              break L1;
            } else {
              if (var45.field_O <= 1) {
                break L1;
              } else {
                var62 = var45.field_u;
                fd.a(0, 0, var62, jb.field_h, param1 ^ -65912);
                break L0;
              }
            }
          }
          ng.j(1);
          break L0;
        }
        var66 = new int[param3.field_s];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param3.field_s];
        var65 = rc.field_a;
        var64 = fb.field_m;
        var63 = p.field_f;
        var13 = 0;
        L2: while (true) {
          if (var13 >= param3.field_s) {
            if (param1 == 65793) {
              var44 = 0;
              var13 = var44;
              L3: while (true) {
                if (var44 >= wj.field_e) {
                  return;
                } else {
                  L4: {
                    var14 = ih.field_d[var44];
                    var15 = param3.field_z[var14];
                    var16 = param3.field_c[var14];
                    var17 = param3.field_y[var14];
                    if (param3.field_Q[var14] >= rc.field_a.length) {
                      stackOut_24_0 = -1;
                      stackIn_25_0 = stackOut_24_0;
                      break L4;
                    } else {
                      stackOut_23_0 = param3.field_Q[var14];
                      stackIn_25_0 = stackOut_23_0;
                      break L4;
                    }
                  }
                  L5: {
                    var18 = stackIn_25_0;
                    if (rc.field_a.length <= param3.field_e[var14]) {
                      stackOut_27_0 = -1;
                      stackIn_28_0 = stackOut_27_0;
                      break L5;
                    } else {
                      stackOut_26_0 = param3.field_e[var14];
                      stackIn_28_0 = stackOut_26_0;
                      break L5;
                    }
                  }
                  L6: {
                    var19 = stackIn_28_0;
                    if (param3.field_m[var14] >= rc.field_a.length) {
                      stackOut_30_0 = -1;
                      stackIn_31_0 = stackOut_30_0;
                      break L6;
                    } else {
                      stackOut_29_0 = param3.field_m[var14];
                      stackIn_31_0 = stackOut_29_0;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var20 = stackIn_31_0;
                      if (uc.field_d == null) {
                        break L8;
                      } else {
                        if (null == param3.field_K) {
                          break L8;
                        } else {
                          if (param3.field_K.length <= var14) {
                            break L8;
                          } else {
                            if (param3.field_K[var14] == -1) {
                              break L8;
                            } else {
                              if (param3.field_K[var14] < uc.field_d.length) {
                                stackOut_38_0 = uc.field_d[param3.field_K[var14]];
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
                    stackIn_39_0 = (kl) (Object) stackOut_37_0;
                    break L7;
                  }
                  L9: {
                    var21 = stackIn_39_0;
                    var22 = bh.field_c[var15];
                    var23 = ri.field_a[var15];
                    var24 = bh.field_c[var16];
                    var25 = ri.field_a[var16];
                    var26 = bh.field_c[var17];
                    var27 = ri.field_a[var17];
                    if (var18 != var19) {
                      break L9;
                    } else {
                      if (var19 == var20) {
                        L10: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21 == null) {
                            stackOut_48_0 = 8355711;
                            stackIn_49_0 = stackOut_48_0;
                            break L10;
                          } else {
                            stackOut_47_0 = var21.field_e;
                            stackIn_49_0 = stackOut_47_0;
                            break L10;
                          }
                        }
                        var30 = stackIn_49_0;
                        var31 = 16711935 & var30;
                        var32 = var30 & 65280;
                        var33 = -1895760128 & var28 * var32 >>> 419298920 | -402718465 & var31 * var28 >>> -1082204376;
                        var33 = var33 + var29 * 65793;
                        m.a(var25, var26, var23, (16711422 & var33) >> 794719745, var22, var27, (byte) 48, var24);
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
                      stackOut_43_0 = var21.field_e;
                      stackIn_45_0 = stackOut_43_0;
                      break L11;
                    }
                  }
                  var34 = stackIn_45_0;
                  var35 = 16711935 & var34;
                  var36 = var34 & 65280;
                  var37 = 1644232448 & var28 * var36 >>> 1937546344 | var28 * var35 >>> 246234664 & -1023475457;
                  var38 = (-16711770 & var35 * var29) >>> -192465976 | (16711709 & var29 * var36) >>> 549274312;
                  var38 = var38 + var32 * 65793;
                  var37 = var37 + 65793 * var31;
                  var39 = 1778450176 & var36 * var30 >>> 81495304 | var35 * var30 >>> 169956456 & 1258225919;
                  var39 = var39 + var33 * 65793;
                  nb.a((byte) 24, var37 >> -1881505712, var38 & 255, var24, var23, var27, 255 & var38 >> -494307032, (65348 & var39) >> -1630528216, var37 >> -1270387928 & 255, var22, var26, var25, var39 >> 117114288, 255 & var39, var38 >> 575390256, 255 & var37);
                  var44++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          } else {
            L12: {
              var14 = var63[var13] * param0 + (var64[var13] * param5 + param6 * var65[var13]) >> 2025658760;
              if (-1 < (var14 ^ -1)) {
                var14 = -var14;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (0 <= var14) {
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
              var15 = var63[var13] * param4 + param7 * var64[var13] + param2 * var65[var13] >> -988366072;
              stackOut_14_0 = sd.field_e;
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
            var14 = var14 * (256 + -var15) >>> -88234488;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        if (la.a((byte) 96, param1)) {
            return false;
        }
        if (nc.a(-100, param1)) {
            return false;
        }
        if (param2 != -28169) {
            return true;
        }
        if (!(!md.a(-1, param1))) {
            return false;
        }
        if (!(0 != param0.length())) {
            return true;
        }
        if (k.a(param2 ^ -9537, param1, param0)) {
            return false;
        }
        if (ia.a(param1, (byte) -113, param0)) {
            return false;
        }
        if (bj.a(param1, param0, true)) {
            return false;
        }
        return true;
    }

    static {
    }
}
