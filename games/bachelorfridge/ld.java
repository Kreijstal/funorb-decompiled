/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends pu {
    static int field_n;
    static String field_m;
    static int field_p;
    static ai[] field_o;
    static ee[] field_l;
    static int field_q;

    final static void a(kv param0, kv param1, kv param2, ee param3, int param4, kv param5, byte param6) {
        int[] var7 = null;
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
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var30 = BachelorFridge.field_y;
          var34 = nla.field_a;
          var33 = var34;
          var32 = var33;
          var31 = var32;
          var7 = var31;
          var8 = -6;
          var9 = 0;
          if (-41 < (param4 ^ -1)) {
            stackOut_2_0 = param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 40;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = stackIn_3_0;
          if ((param4 ^ -1) > -256) {
            stackOut_5_0 = param4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 255;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var11 = stackIn_6_0;
          stackOut_6_0 = 255;
          stackIn_11_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (param4 < 45) {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L2;
          } else {
            L3: {
              stackOut_7_0 = stackIn_7_0;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (param4 <= 445) {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = param4 - 45;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 400;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = stackIn_10_1 * 255 / 400;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L2;
          }
        }
        L4: {
          var12 = stackIn_12_0 ^ stackIn_12_1;
          var13 = 0;
          if (param3.field_f >= -var8) {
            break L4;
          } else {
            var13 = -(param3.field_f + var8);
            break L4;
          }
        }
        L5: {
          var14 = var13;
          var15 = var8;
          var16 = var9;
          stackOut_14_0 = param5.field_q * var16;
          stackIn_16_0 = stackOut_14_0;
          stackIn_15_0 = stackOut_14_0;
          if (-1 >= (var15 ^ -1)) {
            stackOut_16_0 = stackIn_16_0;
            stackOut_16_1 = var15;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            break L5;
          } else {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = 0;
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            break L5;
          }
        }
        L6: {
          var17 = stackIn_17_0 + stackIn_17_1;
          stackOut_17_0 = -param3.field_a;
          stackOut_17_1 = param5.field_q;
          stackIn_19_0 = stackOut_17_0;
          stackIn_19_1 = stackOut_17_1;
          stackIn_18_0 = stackOut_17_0;
          stackIn_18_1 = stackOut_17_1;
          if (var15 >= 0) {
            stackOut_19_0 = stackIn_19_0;
            stackOut_19_1 = stackIn_19_1;
            stackOut_19_2 = 0;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            stackIn_20_2 = stackOut_19_2;
            break L6;
          } else {
            stackOut_18_0 = stackIn_18_0;
            stackOut_18_1 = stackIn_18_1;
            stackOut_18_2 = var15;
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_20_2 = stackOut_18_2;
            break L6;
          }
        }
        var18 = stackIn_20_0 + (stackIn_20_1 + -stackIn_20_2);
        var19 = 0;
        L7: while (true) {
          if (param3.field_b <= var19) {
            L8: {
              var14 = 0;
              var16 = param2.field_u + var9;
              var15 = param2.field_t + var8;
              if (0 > var15) {
                var14 = -var15;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = var14;
              if (0 > var15) {
                stackOut_47_0 = 0;
                stackIn_48_0 = stackOut_47_0;
                break L9;
              } else {
                stackOut_46_0 = var15;
                stackIn_48_0 = stackOut_46_0;
                break L9;
              }
            }
            var17 = stackIn_48_0 + param2.field_t + (param2.field_u + var16) * param5.field_q;
            var18 = -param2.field_q + param5.field_q - -var13;
            var19 = 0;
            L10: while (true) {
              if (param2.field_p <= var19) {
                L11: {
                  var15 = param1.field_t + var8;
                  if (param6 == 27) {
                    break L11;
                  } else {
                    field_m = null;
                    break L11;
                  }
                }
                var19 = 0;
                L12: while (true) {
                  if (var19 >= eq.field_c.length) {
                    return;
                  } else {
                    L13: {
                      var16 = var9 - -eq.field_c[var19];
                      var20 = ce.field_u[var19] + -var10;
                      if (-1 < (var20 ^ -1)) {
                        var20 = 0;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var18 = -param1.field_q + param5.field_q;
                    var17 = var15 + var16 * param0.field_q;
                    var14 = param1.field_q * (-var9 + eq.field_c[var19] + var20);
                    var21 = 0;
                    L14: while (true) {
                      if (var21 < ce.field_u[var19]) {
                        if (var21 < var10) {
                          var22 = 0;
                          L15: while (true) {
                            if (var22 >= param1.field_q) {
                              var17 = var17 + var18;
                              var21++;
                              continue L14;
                            } else {
                              var14++;
                              var23 = param1.field_v[var14];
                              var24 = param0.field_v[var17];
                              var25 = var23 >>> 82049528;
                              if (-1 > (var25 ^ -1)) {
                                var26 = var25 ^ 255;
                                param0.field_v[var17] = mp.a(dda.a(16711935, var26 * dda.a(16711935, var24) + dda.a(16711935, var23) * var25 >> 1037699080), dda.a(var25 * dda.a(var23, 65280) + dda.a(65280, var24) * var26 >> 1849117128, 65280));
                                var17++;
                                var22++;
                                continue L15;
                              } else {
                                var17++;
                                var22++;
                                continue L15;
                              }
                            }
                          }
                        } else {
                          var19++;
                          continue L12;
                        }
                      } else {
                        var19++;
                        continue L12;
                      }
                    }
                  }
                }
              } else {
                var20 = var13;
                L16: while (true) {
                  if (var20 >= param2.field_q) {
                    var14 = var14 + var13;
                    var17 = var17 + var18;
                    var19++;
                    continue L10;
                  } else {
                    var14++;
                    var21 = param2.field_v[var14];
                    var22 = param0.field_v[var17];
                    var23 = var11 * (var21 >>> -123452680) >> 1326666472;
                    if (0 < var23) {
                      var24 = 255 ^ var23;
                      param0.field_v[var17] = mp.a(dda.a(16711935, dda.a(16711935, var22) * var24 + var23 * dda.a(var21, 16711935) >> -954582232), dda.a(dda.a(var21, 65280) * var23 - -(dda.a(65280, var22) * var24) >> 1581236520, 65280));
                      var17++;
                      var20++;
                      continue L16;
                    } else {
                      var17++;
                      var20++;
                      continue L16;
                    }
                  }
                }
              }
            }
          } else {
            L17: {
              if (var15 < 0) {
                stackOut_24_0 = -var15;
                stackIn_25_0 = stackOut_24_0;
                break L17;
              } else {
                stackOut_23_0 = 0;
                stackIn_25_0 = stackOut_23_0;
                break L17;
              }
            }
            var20 = stackIn_25_0;
            L18: while (true) {
              if (param3.field_a <= var20) {
                var17 = var17 + var18;
                var14 = var14 + var13;
                var19++;
                continue L7;
              } else {
                L19: {
                  if (var19 < param3.field_c) {
                    break L19;
                  } else {
                    if (var19 >= param3.field_e + param3.field_c) {
                      break L19;
                    } else {
                      if (var20 < param3.field_f) {
                        break L19;
                      } else {
                        if (var20 < param3.field_d - -param3.field_f) {
                          var14++;
                          var21 = param3.field_g[var14];
                          if (-1 > (var21 ^ -1)) {
                            var21 = 255 & param3.field_h[var21];
                            if (var12 < var21) {
                              L20: {
                                var34 = var33;
                                var22 = var34.length * (-var12 + var21) >> -1249564088;
                                var23 = var34[var22];
                                var24 = (var23 & 16711680) >> -1167630352;
                                var25 = var23 >> 1577203912 & 255;
                                var26 = var23 & 255;
                                if (var22 < -1 + var34.length) {
                                  var27 = 255 & var34.length * (-var12 + var21);
                                  var28 = var27 ^ 255;
                                  var29 = var7[var22 - -1];
                                  var25 = (var29 >> 672885896 & 255) * var27 + var28 * var25 >> -648672536;
                                  var26 = var27 * (var29 & 255) + var26 * var28 >> 90634024;
                                  var24 = var27 * (var29 >> 1674559088 & 255) + var24 * var28 >> -1025680376;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              var25 = (255 & param5.field_v[var17] >> -1603725016) * var25 >> -1789920120;
                              var26 = var26 * (param5.field_v[var17] & 255) >> 243833192;
                              var24 = (255 & param5.field_v[var17] >> 2113699728) * var24 >> -681924632;
                              param0.field_v[var17] = mp.a(mp.a(var24 << -1678496016, var25 << -169407480), var26);
                              var17++;
                              var20++;
                              continue L18;
                            } else {
                              param0.field_v[var17] = param5.field_v[var17];
                              var17++;
                              var20++;
                              continue L18;
                            }
                          } else {
                            param0.field_v[var17] = param5.field_v[var17];
                            var17++;
                            var20++;
                            continue L18;
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                }
                param0.field_v[var17] = param5.field_v[var17];
                var17++;
                var20++;
                continue L18;
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            field_q = -18;
        }
        field_l = null;
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gma.field_e[param1] = new si(param1, param0, param0);
        if (param2 != 45) {
            ld.b(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = -1;
        field_m = "Select a creature to bring up your actions again.";
    }
}
