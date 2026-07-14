/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static cn[] field_c;
    static String[] field_a;
    static pp field_b;

    final static void a(int param0, String param1) {
        System.out.println("Error: " + eg.a(param1, "%0a", "\n", true));
        if (param0 != 11580) {
            field_c = null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 5) {
            Object var2 = null;
            sn.a(99, -43, (cn[]) null, -117, -42, 22);
        }
        field_a = null;
    }

    final static void a(int param0, int param1, cn[] param2, int param3, int param4, int param5) {
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
        int var23 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var23 = DungeonAssault.field_K;
        if (param2 == null) {
          return;
        } else {
          L0: {
            if (0 >= param5) {
              break L0;
            } else {
              if ((param1 ^ -1) >= -1) {
                break L0;
              } else {
                L1: {
                  var7 = 48 / ((34 - param0) / 62);
                  if (param2[3] == null) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = param2[3].field_E;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_10_0;
                  if (null == param2[5]) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = param2[5].field_E;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_13_0;
                  if (null == param2[1]) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = param2[1].field_G;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var9 = stackIn_16_0;
                  if (param2[7] != null) {
                    stackOut_18_0 = param2[7].field_G;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                L5: {
                  var10 = stackIn_19_0;
                  var11 = param3 + param5;
                  var12 = param4 + param1;
                  var13 = var6 + param3;
                  var14 = var11 + -var8;
                  var15 = var9 + param4;
                  var16 = var12 - var10;
                  var17 = var13;
                  var18 = var14;
                  if (var17 > var18) {
                    var18 = param3 + param5 * var6 / (var8 + var6);
                    var17 = param3 + param5 * var6 / (var8 + var6);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var19 = var15;
                  var20 = var16;
                  gf.a(fc.field_g);
                  if (var20 < var19) {
                    var20 = param4 - -(var9 * param1 / (var9 - -var10));
                    var19 = param4 - -(var9 * param1 / (var9 - -var10));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (null == param2[0]) {
                    break L7;
                  } else {
                    gf.a(param3, param4, var17, var19);
                    param2[0].h(param3, param4);
                    gf.b(fc.field_g);
                    break L7;
                  }
                }
                L8: {
                  if (null != param2[2]) {
                    gf.a(var18, param4, var11, var19);
                    param2[2].h(var14, param4);
                    gf.b(fc.field_g);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param2[6] == null) {
                    break L9;
                  } else {
                    gf.a(param3, var20, var17, var12);
                    param2[6].h(param3, var16);
                    gf.b(fc.field_g);
                    break L9;
                  }
                }
                L10: {
                  if (param2[8] != null) {
                    gf.a(var18, var20, var11, var12);
                    param2[8].h(var14, var16);
                    gf.b(fc.field_g);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param2[1] == null) {
                    break L11;
                  } else {
                    if (param2[1].field_E == 0) {
                      break L11;
                    } else {
                      gf.a(var17, param4, var18, var19);
                      var21 = var13;
                      L12: while (true) {
                        L13: {
                          if (var14 <= var21) {
                            break L13;
                          } else {
                            param2[1].h(var21, param4);
                            var21 = var21 + param2[1].field_E;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        gf.b(fc.field_g);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (null == param2[7]) {
                    break L14;
                  } else {
                    if (-1 != (param2[7].field_E ^ -1)) {
                      gf.a(var17, var20, var18, var12);
                      var21 = var13;
                      L15: while (true) {
                        L16: {
                          if (var14 <= var21) {
                            break L16;
                          } else {
                            param2[7].h(var21, var16);
                            var21 = var21 + param2[7].field_E;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        gf.b(fc.field_g);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (param2[3] == null) {
                    break L17;
                  } else {
                    if (0 == param2[3].field_G) {
                      break L17;
                    } else {
                      gf.a(param3, var19, var17, var20);
                      var21 = var15;
                      L18: while (true) {
                        L19: {
                          if (var16 <= var21) {
                            break L19;
                          } else {
                            param2[3].h(param3, var21);
                            var21 = var21 + param2[3].field_G;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        gf.b(fc.field_g);
                        break L17;
                      }
                    }
                  }
                }
                L20: {
                  if (null == param2[5]) {
                    break L20;
                  } else {
                    if (0 != param2[5].field_G) {
                      gf.a(var18, var19, var11, var20);
                      var21 = var15;
                      L21: while (true) {
                        L22: {
                          if (var21 >= var16) {
                            break L22;
                          } else {
                            param2[5].h(var14, var21);
                            var21 = var21 + param2[5].field_G;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        gf.b(fc.field_g);
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L23: {
                  if (param2[4] == null) {
                    break L23;
                  } else {
                    if (param2[4].field_E == 0) {
                      break L23;
                    } else {
                      if (0 == param2[4].field_G) {
                        break L23;
                      } else {
                        gf.a(var17, var19, var18, var20);
                        var21 = var15;
                        L24: while (true) {
                          L25: {
                            if (var21 >= var16) {
                              break L25;
                            } else {
                              var22 = var13;
                              L26: while (true) {
                                L27: {
                                  if (var14 <= var22) {
                                    break L27;
                                  } else {
                                    param2[4].h(var22, var21);
                                    var22 = var22 + param2[4].field_E;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var21 = var21 + param2[4].field_G;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          gf.b(fc.field_g);
                          break L23;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 <= 2) {
            return;
        }
        ki.field_f = param1;
    }

    static {
    }
}
