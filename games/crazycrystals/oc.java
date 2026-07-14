/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int field_b;
    static byte[][] field_a;

    final static void a(dl[] param0, int param1, int param2, int param3, int param4, int param5) {
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var22 = CrazyCrystals.field_B;
        if (param0 != null) {
          L0: {
            if (0 >= param4) {
              break L0;
            } else {
              if (-1 <= (param1 ^ -1)) {
                break L0;
              } else {
                L1: {
                  if (param0[3] == null) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param0[3].field_n;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (null != param0[5]) {
                    stackOut_11_0 = param0[5].field_n;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (null != param0[1]) {
                    stackOut_14_0 = param0[1].field_o;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (param0[7] != null) {
                    stackOut_17_0 = param0[7].field_o;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var10 = param4 + param3;
                  var11 = param2 - -param1;
                  var12 = var6 + param3;
                  var13 = -var7 + var10;
                  var14 = param2 - -var8;
                  var15 = var11 + -var9;
                  var16 = var12;
                  var17 = var13;
                  if (var17 >= var16) {
                    break L5;
                  } else {
                    var17 = param4 * var6 / (var6 - -var7) + param3;
                    var16 = param4 * var6 / (var6 - -var7) + param3;
                    break L5;
                  }
                }
                L6: {
                  if (param5 < -45) {
                    break L6;
                  } else {
                    field_a = null;
                    break L6;
                  }
                }
                L7: {
                  var18 = var14;
                  var19 = var15;
                  if (var18 <= var19) {
                    break L7;
                  } else {
                    var19 = param1 * var8 / (var9 + var8) + param2;
                    var18 = param1 * var8 / (var9 + var8) + param2;
                    break L7;
                  }
                }
                L8: {
                  kh.b(ec.field_i);
                  if (null == param0[0]) {
                    break L8;
                  } else {
                    kh.a(param3, param2, var16, var18);
                    param0[0].a(param3, param2);
                    kh.a(ec.field_i);
                    break L8;
                  }
                }
                L9: {
                  if (param0[2] == null) {
                    break L9;
                  } else {
                    kh.a(var17, param2, var10, var18);
                    param0[2].a(var13, param2);
                    kh.a(ec.field_i);
                    break L9;
                  }
                }
                L10: {
                  if (null == param0[6]) {
                    break L10;
                  } else {
                    kh.a(param3, var19, var16, var11);
                    param0[6].a(param3, var15);
                    kh.a(ec.field_i);
                    break L10;
                  }
                }
                L11: {
                  if (null == param0[8]) {
                    break L11;
                  } else {
                    kh.a(var17, var19, var10, var11);
                    param0[8].a(var13, var15);
                    kh.a(ec.field_i);
                    break L11;
                  }
                }
                L12: {
                  if (null == param0[1]) {
                    break L12;
                  } else {
                    if (-1 != (param0[1].field_n ^ -1)) {
                      kh.a(var16, param2, var17, var18);
                      var20 = var12;
                      L13: while (true) {
                        L14: {
                          if (var20 >= var13) {
                            break L14;
                          } else {
                            param0[1].a(var20, param2);
                            var20 = var20 + param0[1].field_n;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        kh.a(ec.field_i);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                L15: {
                  if (null == param0[7]) {
                    break L15;
                  } else {
                    if (0 != param0[7].field_n) {
                      kh.a(var16, var19, var17, var11);
                      var20 = var12;
                      L16: while (true) {
                        L17: {
                          if (var13 <= var20) {
                            break L17;
                          } else {
                            param0[7].a(var20, var15);
                            var20 = var20 + param0[7].field_n;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        kh.a(ec.field_i);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                L18: {
                  if (null == param0[3]) {
                    break L18;
                  } else {
                    if (-1 != (param0[3].field_o ^ -1)) {
                      kh.a(param3, var18, var16, var19);
                      var20 = var14;
                      L19: while (true) {
                        L20: {
                          if (var20 >= var15) {
                            break L20;
                          } else {
                            param0[3].a(param3, var20);
                            var20 = var20 + param0[3].field_o;
                            if (0 == 0) {
                              continue L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        kh.a(ec.field_i);
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                }
                L21: {
                  if (null == param0[5]) {
                    break L21;
                  } else {
                    if (param0[5].field_o != 0) {
                      kh.a(var17, var18, var10, var19);
                      var20 = var14;
                      L22: while (true) {
                        L23: {
                          if (var15 <= var20) {
                            break L23;
                          } else {
                            param0[5].a(var13, var20);
                            var20 = var20 + param0[5].field_o;
                            if (0 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        kh.a(ec.field_i);
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                }
                L24: {
                  if (param0[4] == null) {
                    break L24;
                  } else {
                    if (param0[4].field_n == 0) {
                      break L24;
                    } else {
                      if (param0[4].field_o == 0) {
                        break L24;
                      } else {
                        kh.a(var16, var18, var17, var19);
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
                                    param0[4].a(var21, var20);
                                    var21 = var21 + param0[4].field_n;
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var20 = var20 + param0[4].field_o;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          kh.a(ec.field_i);
                          break L24;
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
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -121) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[50][];
    }
}
