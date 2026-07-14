/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ig extends rk {
    int field_p;
    static cd field_q;

    abstract Object e(int param0);

    final static void a(o[] param0, int param1, byte param2, int param3, int param4, int param5) {
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
        var22 = wizardrun.field_H;
        if (param0 == null) {
          return;
        } else {
          L0: {
            if ((param4 ^ -1) >= -1) {
              break L0;
            } else {
              if ((param3 ^ -1) < -1) {
                L1: {
                  if (null == param0[3]) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param0[3].field_x;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (param0[5] != null) {
                    stackOut_11_0 = param0[5].field_x;
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
                    stackOut_14_0 = param0[1].field_s;
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
                  if (null == param0[7]) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = param0[7].field_s;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var10 = param1 - -param4;
                  var11 = param5 + param3;
                  var12 = var6 + param1;
                  var13 = -var7 + var10;
                  var14 = param5 - -var8;
                  if (param2 == -110) {
                    break L5;
                  } else {
                    ig.a((byte) -10);
                    break L5;
                  }
                }
                L6: {
                  var15 = var11 + -var9;
                  var16 = var12;
                  var17 = var13;
                  if (var17 < var16) {
                    var17 = var6 * param4 / (var6 + var7) + param1;
                    var16 = var6 * param4 / (var6 + var7) + param1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var18 = var14;
                  var19 = var15;
                  ed.b(td.field_a);
                  if (var18 <= var19) {
                    break L7;
                  } else {
                    var19 = param3 * var8 / (var9 + var8) + param5;
                    var18 = param3 * var8 / (var9 + var8) + param5;
                    break L7;
                  }
                }
                L8: {
                  if (null == param0[0]) {
                    break L8;
                  } else {
                    ed.b(param1, param5, var16, var18);
                    param0[0].e(param1, param5);
                    ed.a(td.field_a);
                    break L8;
                  }
                }
                L9: {
                  if (param0[2] == null) {
                    break L9;
                  } else {
                    ed.b(var17, param5, var10, var18);
                    param0[2].e(var13, param5);
                    ed.a(td.field_a);
                    break L9;
                  }
                }
                L10: {
                  if (param0[6] != null) {
                    ed.b(param1, var19, var16, var11);
                    param0[6].e(param1, var15);
                    ed.a(td.field_a);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param0[8] != null) {
                    ed.b(var17, var19, var10, var11);
                    param0[8].e(var13, var15);
                    ed.a(td.field_a);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param0[1] == null) {
                    break L12;
                  } else {
                    if (param0[1].field_x != 0) {
                      ed.b(var16, param5, var17, var18);
                      var20 = var12;
                      L13: while (true) {
                        L14: {
                          if (var20 >= var13) {
                            break L14;
                          } else {
                            param0[1].e(var20, param5);
                            var20 = var20 + param0[1].field_x;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        ed.a(td.field_a);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                L15: {
                  if (param0[7] == null) {
                    break L15;
                  } else {
                    if (param0[7].field_x == 0) {
                      break L15;
                    } else {
                      ed.b(var16, var19, var17, var11);
                      var20 = var12;
                      L16: while (true) {
                        L17: {
                          if (var13 <= var20) {
                            break L17;
                          } else {
                            param0[7].e(var20, var15);
                            var20 = var20 + param0[7].field_x;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ed.a(td.field_a);
                        break L15;
                      }
                    }
                  }
                }
                L18: {
                  if (param0[3] == null) {
                    break L18;
                  } else {
                    if (0 == param0[3].field_s) {
                      break L18;
                    } else {
                      ed.b(param1, var18, var16, var19);
                      var20 = var14;
                      L19: while (true) {
                        L20: {
                          if (var20 >= var15) {
                            break L20;
                          } else {
                            param0[3].e(param1, var20);
                            var20 = var20 + param0[3].field_s;
                            if (0 == 0) {
                              continue L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        ed.a(td.field_a);
                        break L18;
                      }
                    }
                  }
                }
                L21: {
                  if (null == param0[5]) {
                    break L21;
                  } else {
                    if (-1 != (param0[5].field_s ^ -1)) {
                      ed.b(var17, var18, var10, var19);
                      var20 = var14;
                      L22: while (true) {
                        L23: {
                          if (var20 >= var15) {
                            break L23;
                          } else {
                            param0[5].e(var13, var20);
                            var20 = var20 + param0[5].field_s;
                            if (0 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        ed.a(td.field_a);
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
                    if (0 == param0[4].field_x) {
                      break L24;
                    } else {
                      if (0 == param0[4].field_s) {
                        break L24;
                      } else {
                        ed.b(var16, var18, var17, var19);
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
                                    param0[4].e(var21, var20);
                                    var21 = var21 + param0[4].field_x;
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var20 = var20 + param0[4].field_s;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          ed.a(td.field_a);
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
          return;
        }
    }

    public static void a(byte param0) {
        field_q = null;
        if (param0 >= -82) {
            field_q = null;
        }
    }

    abstract boolean d(int param0);

    ig(int param0) {
        ((ig) this).field_p = param0;
    }

    static {
    }
}
