/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static int[] field_b;
    int field_a;
    int field_c;
    int field_d;
    int field_e;

    final static void a(float param0, String param1, boolean param2, byte param3) {
        if (pc.field_b == null) {
            pc.field_b = new lb(u.field_b, v.field_a);
            u.field_b.b((rc) (Object) pc.field_b, -49);
        }
        if (param3 != -77) {
            uj.a(-106);
        }
        pc.field_b.a(param1, param2, param0, 125);
        mi.a();
        uf.a(false, true);
    }

    final static void a(int param0, int param1, int param2, o[] param3, int param4, int param5) {
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
        var22 = SolKnight.field_L ? 1 : 0;
        if (param3 == null) {
          return;
        } else {
          L0: {
            if (-1 <= (param0 ^ -1)) {
              break L0;
            } else {
              if (0 >= param1) {
                break L0;
              } else {
                L1: {
                  if (param3[3] == null) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = param3[3].field_q;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_10_0;
                  if (null == param3[5]) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = param3[5].field_q;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_13_0;
                  if (null == param3[1]) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = param3[1].field_r;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_16_0;
                  if (null != param3[7]) {
                    stackOut_18_0 = param3[7].field_r;
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
                  var10 = param0 + param2;
                  var11 = param1 + param4;
                  var12 = param2 - -var6;
                  var13 = var10 - var7;
                  var14 = var8 + param4;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var16 > var17) {
                    var17 = param2 + param0 * var6 / (var7 + var6);
                    var16 = param2 + param0 * var6 / (var7 + var6);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  if (var19 < var18) {
                    var19 = param1 * var8 / (var9 + var8) + param4;
                    var18 = param1 * var8 / (var9 + var8) + param4;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  mi.b(SolKnight.field_E);
                  if (param3[0] != null) {
                    mi.d(param2, param4, var16, var18);
                    param3[0].d(param2, param4);
                    mi.a(SolKnight.field_E);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param3[param5] == null) {
                    break L8;
                  } else {
                    mi.d(var17, param4, var10, var18);
                    param3[2].d(var13, param4);
                    mi.a(SolKnight.field_E);
                    break L8;
                  }
                }
                L9: {
                  if (null == param3[6]) {
                    break L9;
                  } else {
                    mi.d(param2, var19, var16, var11);
                    param3[6].d(param2, var15);
                    mi.a(SolKnight.field_E);
                    break L9;
                  }
                }
                L10: {
                  if (null != param3[8]) {
                    mi.d(var17, var19, var10, var11);
                    param3[8].d(var13, var15);
                    mi.a(SolKnight.field_E);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (null == param3[1]) {
                    break L11;
                  } else {
                    if (param3[1].field_q != 0) {
                      mi.d(var16, param4, var17, var18);
                      var20 = var12;
                      L12: while (true) {
                        L13: {
                          if (var13 <= var20) {
                            break L13;
                          } else {
                            param3[1].d(var20, param4);
                            var20 = var20 + param3[1].field_q;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        mi.a(SolKnight.field_E);
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                L14: {
                  if (null == param3[7]) {
                    break L14;
                  } else {
                    if (0 != param3[7].field_q) {
                      mi.d(var16, var19, var17, var11);
                      var20 = var12;
                      L15: while (true) {
                        L16: {
                          if (var13 <= var20) {
                            break L16;
                          } else {
                            param3[7].d(var20, var15);
                            var20 = var20 + param3[7].field_q;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        mi.a(SolKnight.field_E);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (param3[3] == null) {
                    break L17;
                  } else {
                    if (-1 == (param3[3].field_r ^ -1)) {
                      break L17;
                    } else {
                      mi.d(param2, var18, var16, var19);
                      var20 = var14;
                      L18: while (true) {
                        L19: {
                          if (var15 <= var20) {
                            break L19;
                          } else {
                            param3[3].d(param2, var20);
                            var20 = var20 + param3[3].field_r;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        mi.a(SolKnight.field_E);
                        break L17;
                      }
                    }
                  }
                }
                L20: {
                  if (param3[5] == null) {
                    break L20;
                  } else {
                    if (param3[5].field_r != 0) {
                      mi.d(var17, var18, var10, var19);
                      var20 = var14;
                      L21: while (true) {
                        L22: {
                          if (var15 <= var20) {
                            break L22;
                          } else {
                            param3[5].d(var13, var20);
                            var20 = var20 + param3[5].field_r;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        mi.a(SolKnight.field_E);
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
                    if (0 == param3[4].field_q) {
                      break L23;
                    } else {
                      if (0 == param3[4].field_r) {
                        break L23;
                      } else {
                        mi.d(var16, var18, var17, var19);
                        var20 = var14;
                        L24: while (true) {
                          L25: {
                            if (var15 <= var20) {
                              break L25;
                            } else {
                              var21 = var12;
                              L26: while (true) {
                                L27: {
                                  if (var21 >= var13) {
                                    break L27;
                                  } else {
                                    param3[4].d(var21, var20);
                                    var21 = var21 + param3[4].field_q;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var20 = var20 + param3[4].field_r;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          mi.a(SolKnight.field_E);
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
        if (param0 != 1) {
            return;
        }
        field_b = null;
    }

    static {
    }
}
