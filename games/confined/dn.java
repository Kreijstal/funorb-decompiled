/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static gj field_d;
    static nf[] field_c;
    static ef field_b;
    static String field_a;
    static String[] field_e;
    static ok field_f;

    public static void a(int param0) {
        field_b = null;
        int var1 = 88 % ((72 - param0) / 51);
        field_c = null;
        field_f = null;
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, nf[] param3, int param4, int param5, int param6) {
        int var7 = 0;
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
        Object var24 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var23 = Confined.field_J ? 1 : 0;
        if (param3 == null) {
          return;
        } else {
          L0: {
            if (param0 >= -1) {
              break L0;
            } else {
              if (-1 >= param6) {
                break L0;
              } else {
                if (param4 != 0) {
                  L1: {
                    if (null == param3[3]) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = param3[3].field_t;
                      stackIn_11_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                  L2: {
                    var7 = stackIn_11_0;
                    if (param3[5] != null) {
                      stackOut_13_0 = param3[5].field_t;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  L3: {
                    var8 = stackIn_14_0;
                    if (null == param3[1]) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L3;
                    } else {
                      stackOut_15_0 = param3[1].field_x;
                      stackIn_17_0 = stackOut_15_0;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = stackIn_17_0;
                    if (null != param3[7]) {
                      stackOut_19_0 = param3[7].field_x;
                      stackIn_20_0 = stackOut_19_0;
                      break L4;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_20_0 = stackOut_18_0;
                      break L4;
                    }
                  }
                  L5: {
                    var10 = stackIn_20_0;
                    var11 = param0 + param1;
                    var12 = param6 + param2;
                    var13 = var7 + param1;
                    var14 = -var8 + var11;
                    var15 = param2 + var9;
                    if (param5 == -7992) {
                      break L5;
                    } else {
                      var24 = null;
                      dn.a(100, 4, -112, (nf[]) null, 66, 93, 126);
                      break L5;
                    }
                  }
                  L6: {
                    var16 = var12 - var10;
                    var17 = var13;
                    var18 = var14;
                    if (var18 >= var17) {
                      break L6;
                    } else {
                      var18 = var7 * param0 / (var7 - -var8) + param1;
                      var17 = var7 * param0 / (var7 - -var8) + param1;
                      break L6;
                    }
                  }
                  L7: {
                    var19 = var15;
                    var20 = var16;
                    if (var19 > var20) {
                      var20 = var9 * param6 / (var9 + var10) + param2;
                      var19 = var9 * param6 / (var9 + var10) + param2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    fn.b(fj.field_E);
                    if (null != param3[0]) {
                      fn.f(param1, param2, var17, var19);
                      param3[0].a(param1, param2, param4);
                      fn.a(fj.field_E);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param3[2] == null) {
                      break L9;
                    } else {
                      fn.f(var18, param2, var11, var19);
                      param3[2].a(var14, param2, param4);
                      fn.a(fj.field_E);
                      break L9;
                    }
                  }
                  L10: {
                    if (param3[6] != null) {
                      fn.f(param1, var20, var17, var12);
                      param3[6].a(param1, var16, param4);
                      fn.a(fj.field_E);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param3[8] != null) {
                      fn.f(var18, var20, var11, var12);
                      param3[8].a(var14, var16, param4);
                      fn.a(fj.field_E);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (null == param3[1]) {
                      break L12;
                    } else {
                      if (param3[1].field_t != 0) {
                        fn.f(var17, param2, var18, var19);
                        var21 = var13;
                        L13: while (true) {
                          L14: {
                            if (var14 <= var21) {
                              break L14;
                            } else {
                              param3[1].a(var21, param2, param4);
                              var21 = var21 + param3[1].field_t;
                              if (0 == 0) {
                                continue L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          fn.a(fj.field_E);
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  L15: {
                    if (param3[7] == null) {
                      break L15;
                    } else {
                      if (0 != param3[7].field_t) {
                        fn.f(var17, var20, var18, var12);
                        var21 = var13;
                        L16: while (true) {
                          L17: {
                            if (var14 <= var21) {
                              break L17;
                            } else {
                              param3[7].a(var21, var16, param4);
                              var21 = var21 + param3[7].field_t;
                              if (0 == 0) {
                                continue L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          fn.a(fj.field_E);
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                  }
                  L18: {
                    if (param3[3] == null) {
                      break L18;
                    } else {
                      if (-1 != (param3[3].field_x ^ -1)) {
                        fn.f(param1, var19, var17, var20);
                        var21 = var15;
                        L19: while (true) {
                          L20: {
                            if (var16 <= var21) {
                              break L20;
                            } else {
                              param3[3].a(param1, var21, param4);
                              var21 = var21 + param3[3].field_x;
                              if (0 == 0) {
                                continue L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          fn.a(fj.field_E);
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                  }
                  L21: {
                    if (param3[5] == null) {
                      break L21;
                    } else {
                      if (param3[5].field_x == 0) {
                        break L21;
                      } else {
                        fn.f(var18, var19, var11, var20);
                        var21 = var15;
                        L22: while (true) {
                          L23: {
                            if (var21 >= var16) {
                              break L23;
                            } else {
                              param3[5].a(var14, var21, param4);
                              var21 = var21 + param3[5].field_x;
                              if (0 == 0) {
                                continue L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          fn.a(fj.field_E);
                          break L21;
                        }
                      }
                    }
                  }
                  L24: {
                    if (param3[4] == null) {
                      break L24;
                    } else {
                      if (0 == param3[4].field_t) {
                        break L24;
                      } else {
                        if (-1 == (param3[4].field_x ^ -1)) {
                          break L24;
                        } else {
                          fn.f(var17, var19, var18, var20);
                          var21 = var15;
                          L25: while (true) {
                            L26: {
                              if (var16 <= var21) {
                                break L26;
                              } else {
                                var22 = var13;
                                L27: while (true) {
                                  L28: {
                                    if (var22 >= var14) {
                                      break L28;
                                    } else {
                                      param3[4].a(var22, var21, param4);
                                      var22 = var22 + param3[4].field_t;
                                      if (0 == 0) {
                                        continue L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  var21 = var21 + param3[4].field_x;
                                  if (0 == 0) {
                                    continue L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            fn.a(fj.field_E);
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"All scores", "My scores", "Best each"};
        field_a = "You already have five wing pods";
    }
}
