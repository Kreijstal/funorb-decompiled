/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class abb {
    static int field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, phb[] param4, int param5) {
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
        var22 = VoidHunters.field_G;
        if (param4 == null) {
          return;
        } else {
          L0: {
            if (0 >= param2) {
              break L0;
            } else {
              if (0 >= param1) {
                break L0;
              } else {
                L1: {
                  if (param4[param0] == null) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = param4[3].field_m;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_10_0;
                  if (null != param4[5]) {
                    stackOut_12_0 = param4[5].field_m;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_13_0;
                  if (param4[1] == null) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = param4[1].field_n;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_16_0;
                  if (param4[7] != null) {
                    stackOut_18_0 = param4[7].field_n;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_19_0;
                  var10 = param5 + param2;
                  var11 = param1 + param3;
                  var12 = param5 - -var6;
                  var13 = -var7 + var10;
                  var14 = param3 - -var8;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var16 <= var17) {
                    break L5;
                  } else {
                    var17 = param2 * var6 / (var6 + var7) + param5;
                    var16 = param2 * var6 / (var6 + var7) + param5;
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  if (var19 < var18) {
                    var19 = param1 * var8 / (var9 + var8) + param3;
                    var18 = param1 * var8 / (var9 + var8) + param3;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  dma.a(eja.field_o);
                  if (param4[0] != null) {
                    dma.g(param5, param3, var16, var18);
                    param4[0].a(param5, param3);
                    dma.b(eja.field_o);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param4[2] == null) {
                    break L8;
                  } else {
                    dma.g(var17, param3, var10, var18);
                    param4[2].a(var13, param3);
                    dma.b(eja.field_o);
                    break L8;
                  }
                }
                L9: {
                  if (null == param4[6]) {
                    break L9;
                  } else {
                    dma.g(param5, var19, var16, var11);
                    param4[6].a(param5, var15);
                    dma.b(eja.field_o);
                    break L9;
                  }
                }
                L10: {
                  if (null != param4[8]) {
                    dma.g(var17, var19, var10, var11);
                    param4[8].a(var13, var15);
                    dma.b(eja.field_o);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param4[1] == null) {
                    break L11;
                  } else {
                    if (0 == param4[1].field_m) {
                      break L11;
                    } else {
                      dma.g(var16, param3, var17, var18);
                      var20 = var12;
                      L12: while (true) {
                        L13: {
                          if (var20 >= var13) {
                            break L13;
                          } else {
                            param4[1].a(var20, param3);
                            var20 = var20 + param4[1].field_m;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        dma.b(eja.field_o);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (null == param4[7]) {
                    break L14;
                  } else {
                    if (param4[7].field_m != 0) {
                      dma.g(var16, var19, var17, var11);
                      var20 = var12;
                      L15: while (true) {
                        L16: {
                          if (var13 <= var20) {
                            break L16;
                          } else {
                            param4[7].a(var20, var15);
                            var20 = var20 + param4[7].field_m;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        dma.b(eja.field_o);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (param4[3] == null) {
                    break L17;
                  } else {
                    if (0 != param4[3].field_n) {
                      dma.g(param5, var18, var16, var19);
                      var20 = var14;
                      L18: while (true) {
                        L19: {
                          if (var15 <= var20) {
                            break L19;
                          } else {
                            param4[3].a(param5, var20);
                            var20 = var20 + param4[3].field_n;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        dma.b(eja.field_o);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L20: {
                  if (null == param4[5]) {
                    break L20;
                  } else {
                    if (-1 == (param4[5].field_n ^ -1)) {
                      break L20;
                    } else {
                      dma.g(var17, var18, var10, var19);
                      var20 = var14;
                      L21: while (true) {
                        L22: {
                          if (var15 <= var20) {
                            break L22;
                          } else {
                            param4[5].a(var13, var20);
                            var20 = var20 + param4[5].field_n;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        dma.b(eja.field_o);
                        break L20;
                      }
                    }
                  }
                }
                L23: {
                  if (null == param4[4]) {
                    break L23;
                  } else {
                    if (0 == param4[4].field_m) {
                      break L23;
                    } else {
                      if (param4[4].field_n == 0) {
                        break L23;
                      } else {
                        dma.g(var16, var18, var17, var19);
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
                                    param4[4].a(var21, var20);
                                    var21 = var21 + param4[4].field_m;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var20 = var20 + param4[4].field_n;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          dma.b(eja.field_o);
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

    public static void a(int param0) {
        field_b = null;
        if (param0 != 4) {
            field_b = null;
        }
    }

    abstract long a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Scrambler";
    }
}
