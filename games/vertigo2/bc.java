/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_b;
    static int field_c;
    static String field_a;

    final static void a(int param0, int param1, byte param2, er[] param3, int param4, int param5) {
        int var6 = 0;
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
        var22 = Vertigo2.field_L ? 1 : 0;
        if (param3 == null) {
          return;
        } else {
          if (param2 > 68) {
            L0: {
              if (-1 <= (param4 ^ -1)) {
                break L0;
              } else {
                if ((param0 ^ -1) < -1) {
                  L1: {
                    if (param3[3] != null) {
                      stackOut_10_0 = param3[3].field_x;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_11_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                  L2: {
                    var6 = stackIn_11_0;
                    if (param3[5] != null) {
                      stackOut_13_0 = param3[5].field_x;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  L3: {
                    var7 = stackIn_14_0;
                    if (null != param3[1]) {
                      stackOut_16_0 = param3[1].field_B;
                      stackIn_17_0 = stackOut_16_0;
                      break L3;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_17_0 = stackOut_15_0;
                      break L3;
                    }
                  }
                  L4: {
                    var8 = stackIn_17_0;
                    if (param3[7] != null) {
                      stackOut_19_0 = param3[7].field_B;
                      stackIn_20_0 = stackOut_19_0;
                      break L4;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_20_0 = stackOut_18_0;
                      break L4;
                    }
                  }
                  L5: {
                    var9 = stackIn_20_0;
                    var10 = param4 + param5;
                    var11 = param1 - -param0;
                    var12 = var6 + param5;
                    var13 = var10 - var7;
                    var14 = var8 + param1;
                    var15 = var11 - var9;
                    var16 = var12;
                    var17 = var13;
                    if (var17 < var16) {
                      var17 = param4 * var6 / (var7 + var6) + param5;
                      var16 = param4 * var6 / (var7 + var6) + param5;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var18 = var14;
                    var19 = var15;
                    if (var19 < var18) {
                      var19 = param0 * var8 / (var9 + var8) + param1;
                      var18 = param0 * var8 / (var9 + var8) + param1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    bi.a(l.field_h);
                    if (null == param3[0]) {
                      break L7;
                    } else {
                      bi.c(param5, param1, var16, var18);
                      param3[0].e(param5, param1);
                      bi.b(l.field_h);
                      break L7;
                    }
                  }
                  L8: {
                    if (param3[2] == null) {
                      break L8;
                    } else {
                      bi.c(var17, param1, var10, var18);
                      param3[2].e(var13, param1);
                      bi.b(l.field_h);
                      break L8;
                    }
                  }
                  L9: {
                    if (null != param3[6]) {
                      bi.c(param5, var19, var16, var11);
                      param3[6].e(param5, var15);
                      bi.b(l.field_h);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (null == param3[8]) {
                      break L10;
                    } else {
                      bi.c(var17, var19, var10, var11);
                      param3[8].e(var13, var15);
                      bi.b(l.field_h);
                      break L10;
                    }
                  }
                  L11: {
                    if (null == param3[1]) {
                      break L11;
                    } else {
                      if (-1 == (param3[1].field_x ^ -1)) {
                        break L11;
                      } else {
                        bi.c(var16, param1, var17, var18);
                        var20 = var12;
                        L12: while (true) {
                          L13: {
                            if (var20 >= var13) {
                              break L13;
                            } else {
                              param3[1].e(var20, param1);
                              var20 = var20 + param3[1].field_x;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          bi.b(l.field_h);
                          break L11;
                        }
                      }
                    }
                  }
                  L14: {
                    if (param3[7] == null) {
                      break L14;
                    } else {
                      if (-1 == (param3[7].field_x ^ -1)) {
                        break L14;
                      } else {
                        bi.c(var16, var19, var17, var11);
                        var20 = var12;
                        L15: while (true) {
                          L16: {
                            if (var13 <= var20) {
                              break L16;
                            } else {
                              param3[7].e(var20, var15);
                              var20 = var20 + param3[7].field_x;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          bi.b(l.field_h);
                          break L14;
                        }
                      }
                    }
                  }
                  L17: {
                    if (param3[3] == null) {
                      break L17;
                    } else {
                      if (param3[3].field_B != 0) {
                        bi.c(param5, var18, var16, var19);
                        var20 = var14;
                        L18: while (true) {
                          L19: {
                            if (var15 <= var20) {
                              break L19;
                            } else {
                              param3[3].e(param5, var20);
                              var20 = var20 + param3[3].field_B;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          bi.b(l.field_h);
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  L20: {
                    if (null == param3[5]) {
                      break L20;
                    } else {
                      if (param3[5].field_B != 0) {
                        bi.c(var17, var18, var10, var19);
                        var20 = var14;
                        L21: while (true) {
                          L22: {
                            if (var15 <= var20) {
                              break L22;
                            } else {
                              param3[5].e(var13, var20);
                              var20 = var20 + param3[5].field_B;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          bi.b(l.field_h);
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L23: {
                    if (null == param3[4]) {
                      break L23;
                    } else {
                      if (0 == param3[4].field_x) {
                        break L23;
                      } else {
                        if (0 == param3[4].field_B) {
                          break L23;
                        } else {
                          bi.c(var16, var18, var17, var19);
                          var20 = var14;
                          L24: while (true) {
                            L25: {
                              if (var20 >= var15) {
                                break L25;
                              } else {
                                var21 = var12;
                                L26: while (true) {
                                  L27: {
                                    if (var13 <= var21) {
                                      break L27;
                                    } else {
                                      param3[4].e(var21, var20);
                                      var21 = var21 + param3[4].field_x;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var20 = var20 + param3[4].field_B;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            bi.b(l.field_h);
                            break L23;
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
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 7) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 71;
        field_a = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
