/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static double field_c;
    static ml field_d;
    static pb[] field_a;
    static int field_b;

    final static void a(int param0, int param1, int param2, pb[] param3, int param4, int param5) {
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
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var22 = stellarshard.field_B;
        if (param3 != null) {
          L0: {
            if (0 >= param4) {
              break L0;
            } else {
              if (-1 > (param5 ^ -1)) {
                L1: {
                  if (null == param3[3]) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = param3[3].field_w;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_8_0;
                  if (null == param3[5]) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = param3[5].field_w;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_11_0;
                  if (param3[1] != null) {
                    stackOut_13_0 = param3[1].field_x;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_14_0;
                  if (param3[7] == null) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = param3[7].field_x;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_17_0;
                  if (param0 == -6313) {
                    break L5;
                  } else {
                    field_c = -1.021068867535498;
                    break L5;
                  }
                }
                L6: {
                  var10 = param4 + param1;
                  var11 = param5 + param2;
                  var12 = var6 + param1;
                  var13 = var10 - var7;
                  var14 = param2 + var8;
                  var15 = var11 - var9;
                  var16 = var12;
                  var17 = var13;
                  if (var17 < var16) {
                    var17 = param4 * var6 / (var6 - -var7) + param1;
                    var16 = param4 * var6 / (var6 - -var7) + param1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var18 = var14;
                  var19 = var15;
                  if (var19 >= var18) {
                    break L7;
                  } else {
                    var19 = var8 * param5 / (var9 + var8) + param2;
                    var18 = var8 * param5 / (var9 + var8) + param2;
                    break L7;
                  }
                }
                L8: {
                  ti.a(de.field_b);
                  if (param3[0] == null) {
                    break L8;
                  } else {
                    ti.a(param1, param2, var16, var18);
                    param3[0].e(param1, param2);
                    ti.b(de.field_b);
                    break L8;
                  }
                }
                L9: {
                  if (param3[2] == null) {
                    break L9;
                  } else {
                    ti.a(var17, param2, var10, var18);
                    param3[2].e(var13, param2);
                    ti.b(de.field_b);
                    break L9;
                  }
                }
                L10: {
                  if (null != param3[6]) {
                    ti.a(param1, var19, var16, var11);
                    param3[6].e(param1, var15);
                    ti.b(de.field_b);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (null != param3[8]) {
                    ti.a(var17, var19, var10, var11);
                    param3[8].e(var13, var15);
                    ti.b(de.field_b);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param3[1] == null) {
                    break L12;
                  } else {
                    if (param3[1].field_w == 0) {
                      break L12;
                    } else {
                      ti.a(var16, param2, var17, var18);
                      var20 = var12;
                      L13: while (true) {
                        L14: {
                          if (var13 <= var20) {
                            break L14;
                          } else {
                            param3[1].e(var20, param2);
                            var20 = var20 + param3[1].field_w;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        ti.b(de.field_b);
                        break L12;
                      }
                    }
                  }
                }
                L15: {
                  if (null == param3[7]) {
                    break L15;
                  } else {
                    if (param3[7].field_w != 0) {
                      ti.a(var16, var19, var17, var11);
                      var20 = var12;
                      L16: while (true) {
                        L17: {
                          if (var13 <= var20) {
                            break L17;
                          } else {
                            param3[7].e(var20, var15);
                            var20 = var20 + param3[7].field_w;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ti.b(de.field_b);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                L18: {
                  if (null == param3[3]) {
                    break L18;
                  } else {
                    if (param3[3].field_x == 0) {
                      break L18;
                    } else {
                      ti.a(param1, var18, var16, var19);
                      var20 = var14;
                      L19: while (true) {
                        L20: {
                          if (var20 >= var15) {
                            break L20;
                          } else {
                            param3[3].e(param1, var20);
                            var20 = var20 + param3[3].field_x;
                            if (0 == 0) {
                              continue L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        ti.b(de.field_b);
                        break L18;
                      }
                    }
                  }
                }
                L21: {
                  if (param3[5] == null) {
                    break L21;
                  } else {
                    if (param3[5].field_x != 0) {
                      ti.a(var17, var18, var10, var19);
                      var20 = var14;
                      L22: while (true) {
                        L23: {
                          if (var15 <= var20) {
                            break L23;
                          } else {
                            param3[5].e(var13, var20);
                            var20 = var20 + param3[5].field_x;
                            if (0 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        ti.b(de.field_b);
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                }
                L24: {
                  if (param3[4] == null) {
                    break L24;
                  } else {
                    if (param3[4].field_w == 0) {
                      break L24;
                    } else {
                      if (param3[4].field_x != 0) {
                        ti.a(var16, var18, var17, var19);
                        var20 = var14;
                        L25: while (true) {
                          L26: {
                            if (var15 <= var20) {
                              break L26;
                            } else {
                              var21 = var12;
                              L27: while (true) {
                                L28: {
                                  if (var21 >= var13) {
                                    break L28;
                                  } else {
                                    param3[4].e(var21, var20);
                                    var21 = var21 + param3[4].field_w;
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var20 = var20 + param3[4].field_x;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          ti.b(de.field_b);
                          break L24;
                        }
                      } else {
                        break L24;
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

    public static void a(int param0) {
        field_a = null;
        if (param0 > -24) {
            field_a = null;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0.0;
        field_b = 0;
    }
}
