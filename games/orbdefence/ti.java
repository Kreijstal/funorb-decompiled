/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends sf {
    static el field_bb;
    String field_db;
    static int field_eb;
    int field_ab;
    String field_Z;
    static volatile boolean field_cb;

    final static void a(int param0, int param1, int param2, hj[] param3, int param4, int param5) {
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
        var22 = OrbDefence.field_D ? 1 : 0;
        if (param3 == null) {
          return;
        } else {
          L0: {
            if (0 >= param2) {
              break L0;
            } else {
              if (param0 <= 0) {
                break L0;
              } else {
                L1: {
                  if (null != param3[3]) {
                    stackOut_9_0 = param3[3].field_s;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_10_0;
                  if (null != param3[5]) {
                    stackOut_12_0 = param3[5].field_s;
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
                  if (param3[1] != null) {
                    stackOut_15_0 = param3[1].field_t;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_16_0;
                  if (null != param3[7]) {
                    stackOut_18_0 = param3[7].field_t;
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
                  var10 = param4 + param2;
                  var11 = param5 + param0;
                  var12 = param4 - -var6;
                  var13 = -var7 + var10;
                  var14 = var8 + param5;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var16 > var17) {
                    var17 = var6 * param2 / (var7 + var6) + param4;
                    var16 = var6 * param2 / (var7 + var6) + param4;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var18 = var14;
                var19 = var15;
                if (param1 == 6) {
                  L6: {
                    ul.a(sf.field_K);
                    if (var18 <= var19) {
                      break L6;
                    } else {
                      var19 = param0 * var8 / (var9 + var8) + param5;
                      var18 = param0 * var8 / (var9 + var8) + param5;
                      break L6;
                    }
                  }
                  L7: {
                    if (null == param3[0]) {
                      break L7;
                    } else {
                      ul.i(param4, param5, var16, var18);
                      param3[0].c(param4, param5);
                      ul.b(sf.field_K);
                      break L7;
                    }
                  }
                  L8: {
                    if (null == param3[2]) {
                      break L8;
                    } else {
                      ul.i(var17, param5, var10, var18);
                      param3[2].c(var13, param5);
                      ul.b(sf.field_K);
                      break L8;
                    }
                  }
                  L9: {
                    if (param3[6] == null) {
                      break L9;
                    } else {
                      ul.i(param4, var19, var16, var11);
                      param3[6].c(param4, var15);
                      ul.b(sf.field_K);
                      break L9;
                    }
                  }
                  L10: {
                    if (param3[8] == null) {
                      break L10;
                    } else {
                      ul.i(var17, var19, var10, var11);
                      param3[8].c(var13, var15);
                      ul.b(sf.field_K);
                      break L10;
                    }
                  }
                  L11: {
                    if (param3[1] == null) {
                      break L11;
                    } else {
                      if (0 != param3[1].field_s) {
                        ul.i(var16, param5, var17, var18);
                        var20 = var12;
                        L12: while (true) {
                          L13: {
                            if (var13 <= var20) {
                              break L13;
                            } else {
                              param3[1].c(var20, param5);
                              var20 = var20 + param3[1].field_s;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          ul.b(sf.field_K);
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (param3[7] == null) {
                      break L14;
                    } else {
                      if (param3[7].field_s == 0) {
                        break L14;
                      } else {
                        ul.i(var16, var19, var17, var11);
                        var20 = var12;
                        L15: while (true) {
                          L16: {
                            if (var13 <= var20) {
                              break L16;
                            } else {
                              param3[7].c(var20, var15);
                              var20 = var20 + param3[7].field_s;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          ul.b(sf.field_K);
                          break L14;
                        }
                      }
                    }
                  }
                  L17: {
                    if (null == param3[3]) {
                      break L17;
                    } else {
                      if (0 == param3[3].field_t) {
                        break L17;
                      } else {
                        ul.i(param4, var18, var16, var19);
                        var20 = var14;
                        L18: while (true) {
                          L19: {
                            if (var20 >= var15) {
                              break L19;
                            } else {
                              param3[3].c(param4, var20);
                              var20 = var20 + param3[3].field_t;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          ul.b(sf.field_K);
                          break L17;
                        }
                      }
                    }
                  }
                  L20: {
                    if (null == param3[5]) {
                      break L20;
                    } else {
                      if (param3[5].field_t != 0) {
                        ul.i(var17, var18, var10, var19);
                        var20 = var14;
                        L21: while (true) {
                          L22: {
                            if (var15 <= var20) {
                              break L22;
                            } else {
                              param3[5].c(var13, var20);
                              var20 = var20 + param3[5].field_t;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          ul.b(sf.field_K);
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L23: {
                    if (param3[4] == null) {
                      break L23;
                    } else {
                      if (0 == param3[4].field_s) {
                        break L23;
                      } else {
                        if (param3[4].field_t == 0) {
                          break L23;
                        } else {
                          ul.i(var16, var18, var17, var19);
                          var20 = var14;
                          L24: while (true) {
                            L25: {
                              if (var15 <= var20) {
                                break L25;
                              } else {
                                var21 = var12;
                                L26: while (true) {
                                  L27: {
                                    if (var13 <= var21) {
                                      break L27;
                                    } else {
                                      param3[4].c(var21, var20);
                                      var21 = var21 + param3[4].field_s;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var20 = var20 + param3[4].field_t;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            ul.b(sf.field_K);
                            break L23;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
          return;
        }
    }

    public static void e(int param0) {
        if (param0 < 49) {
            Object var2 = null;
            ti.a(-39, -56, -76, (hj[]) null, -29, -35);
        }
        field_bb = null;
    }

    ti() {
        super(0L, (sf) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = true;
    }
}
