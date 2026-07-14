/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em implements jk {
    qk[] field_i;
    static String field_b;
    static int field_j;
    static int[] field_c;
    static String field_a;
    static int field_k;
    static int field_h;
    static String field_g;
    lh field_e;
    jh[] field_d;
    lp[] field_f;

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 > 113) {
            break L0;
          } else {
            field_j = 43;
            break L0;
          }
        }
        var3 = 1;
        L1: while (true) {
          if (-2 <= (param2 ^ -1)) {
            if (param2 == 1) {
              return var3 * param0;
            } else {
              return var3;
            }
          } else {
            L2: {
              if ((param2 & 1) != 0) {
                var3 = var3 * param0;
                break L2;
              } else {
                break L2;
              }
            }
            param2 = param2 >> 1;
            param0 = param0 * param0;
            continue L1;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_c = null;
        field_b = null;
        if (param0 != 3) {
            em.a(-116);
        }
    }

    final static void a(va param0, int param1) {
        fj.field_t = param0;
        if (2 != fj.field_t.field_c) {
            if (1 == fj.field_t.field_c) {
            }
        }
        if (param1 != 1) {
            field_g = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, bi[] param4, int param5) {
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
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param4 == null) {
          return;
        } else {
          L0: {
            if (0 >= param1) {
              break L0;
            } else {
              if (param0 <= 0) {
                break L0;
              } else {
                L1: {
                  if (param4[3] == null) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = param4[3].field_o;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_10_0;
                  if (null == param4[5]) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = param4[5].field_o;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_13_0;
                  if (param4[1] != null) {
                    stackOut_15_0 = param4[1].field_p;
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
                  if (param4[param2] != null) {
                    stackOut_18_0 = param4[7].field_p;
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
                  var10 = param5 + param1;
                  var11 = param0 + param3;
                  var12 = param5 + var6;
                  var13 = -var7 + var10;
                  var14 = param3 - -var8;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var16 > var17) {
                    var17 = param5 + param1 * var6 / (var7 + var6);
                    var16 = param5 + param1 * var6 / (var7 + var6);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  if (var18 > var19) {
                    var19 = param3 + var8 * param0 / (var8 - -var9);
                    var18 = param3 + var8 * param0 / (var8 - -var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  gf.a(ph.field_b);
                  if (null != param4[0]) {
                    gf.i(param5, param3, var16, var18);
                    param4[0].f(param5, param3);
                    gf.b(ph.field_b);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param4[2] == null) {
                    break L8;
                  } else {
                    gf.i(var17, param3, var10, var18);
                    param4[2].f(var13, param3);
                    gf.b(ph.field_b);
                    break L8;
                  }
                }
                L9: {
                  if (param4[6] != null) {
                    gf.i(param5, var19, var16, var11);
                    param4[6].f(param5, var15);
                    gf.b(ph.field_b);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (null == param4[8]) {
                    break L10;
                  } else {
                    gf.i(var17, var19, var10, var11);
                    param4[8].f(var13, var15);
                    gf.b(ph.field_b);
                    break L10;
                  }
                }
                L11: {
                  if (null == param4[1]) {
                    break L11;
                  } else {
                    if (param4[1].field_o == 0) {
                      break L11;
                    } else {
                      gf.i(var16, param3, var17, var18);
                      var20 = var12;
                      L12: while (true) {
                        L13: {
                          if (var13 <= var20) {
                            break L13;
                          } else {
                            param4[1].f(var20, param3);
                            var20 = var20 + param4[1].field_o;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        gf.b(ph.field_b);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (param4[7] == null) {
                    break L14;
                  } else {
                    if (-1 == (param4[7].field_o ^ -1)) {
                      break L14;
                    } else {
                      gf.i(var16, var19, var17, var11);
                      var20 = var12;
                      L15: while (true) {
                        L16: {
                          if (var20 >= var13) {
                            break L16;
                          } else {
                            param4[7].f(var20, var15);
                            var20 = var20 + param4[7].field_o;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        gf.b(ph.field_b);
                        break L14;
                      }
                    }
                  }
                }
                L17: {
                  if (null == param4[3]) {
                    break L17;
                  } else {
                    if (param4[3].field_p == 0) {
                      break L17;
                    } else {
                      gf.i(param5, var18, var16, var19);
                      var20 = var14;
                      L18: while (true) {
                        L19: {
                          if (var15 <= var20) {
                            break L19;
                          } else {
                            param4[3].f(param5, var20);
                            var20 = var20 + param4[3].field_p;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        gf.b(ph.field_b);
                        break L17;
                      }
                    }
                  }
                }
                L20: {
                  if (param4[5] == null) {
                    break L20;
                  } else {
                    if (param4[5].field_p == 0) {
                      break L20;
                    } else {
                      gf.i(var17, var18, var10, var19);
                      var20 = var14;
                      L21: while (true) {
                        L22: {
                          if (var20 >= var15) {
                            break L22;
                          } else {
                            param4[5].f(var13, var20);
                            var20 = var20 + param4[5].field_p;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        gf.b(ph.field_b);
                        break L20;
                      }
                    }
                  }
                }
                L23: {
                  if (null == param4[4]) {
                    break L23;
                  } else {
                    if (-1 == (param4[4].field_o ^ -1)) {
                      break L23;
                    } else {
                      if (0 != param4[4].field_p) {
                        gf.i(var16, var18, var17, var19);
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
                                    param4[4].f(var21, var20);
                                    var21 = var21 + param4[4].field_o;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var20 = var20 + param4[4].field_p;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          gf.b(ph.field_b);
                          break L23;
                        }
                      } else {
                        break L23;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[4];
        field_b = "<%0> must play <%1> more rated games before playing with the current options.";
        field_h = 0;
        field_g = "Quit to website";
    }
}
