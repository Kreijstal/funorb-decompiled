/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends am {
    int field_m;
    int field_p;
    static bd field_l;
    int field_i;
    int field_j;
    int field_k;
    int field_h;
    static String field_n;
    static String field_o;

    public static void d(int param0) {
        if (param0 != 5) {
            return;
        }
        field_o = null;
        field_l = null;
        field_n = null;
    }

    final static boolean c(int param0) {
        if (param0 != 8) {
            return false;
        }
        return !c.field_a.d((byte) -102) ? true : false;
    }

    final static void a(int param0, bd[] param1, boolean param2, int param3, int param4, int param5) {
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
        var22 = HostileSpawn.field_I ? 1 : 0;
        if (param1 != null) {
          L0: {
            if (-1 <= (param0 ^ -1)) {
              break L0;
            } else {
              if (param3 > 0) {
                L1: {
                  if (param1[3] != null) {
                    stackOut_7_0 = param1[3].field_u;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_8_0;
                  if (null == param1[5]) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = param1[5].field_u;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_11_0;
                  if (null == param1[1]) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = param1[1].field_r;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_14_0;
                  if (param1[7] != null) {
                    stackOut_16_0 = param1[7].field_r;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_17_0;
                  var10 = param0 + param5;
                  var11 = param4 - -param3;
                  var12 = var6 + param5;
                  var13 = -var7 + var10;
                  var14 = param4 - -var8;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var17 < var16) {
                    var17 = var6 * param0 / (var7 + var6) + param5;
                    var16 = var6 * param0 / (var7 + var6) + param5;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  if (var18 > var19) {
                    var19 = param3 * var8 / (var9 + var8) + param4;
                    var18 = param3 * var8 / (var9 + var8) + param4;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  si.b(rj.field_M);
                  if (param1[0] == null) {
                    break L7;
                  } else {
                    si.f(param5, param4, var16, var18);
                    param1[0].e(param5, param4);
                    si.a(rj.field_M);
                    break L7;
                  }
                }
                L8: {
                  if (null != param1[2]) {
                    si.f(var17, param4, var10, var18);
                    param1[2].e(var13, param4);
                    si.a(rj.field_M);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (null != param1[6]) {
                    si.f(param5, var19, var16, var11);
                    param1[6].e(param5, var15);
                    si.a(rj.field_M);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param1[8] == null) {
                    break L10;
                  } else {
                    si.f(var17, var19, var10, var11);
                    param1[8].e(var13, var15);
                    si.a(rj.field_M);
                    break L10;
                  }
                }
                L11: {
                  if (param1[1] == null) {
                    break L11;
                  } else {
                    if (param1[1].field_u == 0) {
                      break L11;
                    } else {
                      si.f(var16, param4, var17, var18);
                      var20 = var12;
                      L12: while (true) {
                        L13: {
                          if (var20 >= var13) {
                            break L13;
                          } else {
                            param1[1].e(var20, param4);
                            var20 = var20 + param1[1].field_u;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        si.a(rj.field_M);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (null == param1[7]) {
                    break L14;
                  } else {
                    if (param1[7].field_u == 0) {
                      break L14;
                    } else {
                      si.f(var16, var19, var17, var11);
                      var20 = var12;
                      L15: while (true) {
                        L16: {
                          if (var13 <= var20) {
                            break L16;
                          } else {
                            param1[7].e(var20, var15);
                            var20 = var20 + param1[7].field_u;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        si.a(rj.field_M);
                        break L14;
                      }
                    }
                  }
                }
                L17: {
                  if (null == param1[3]) {
                    break L17;
                  } else {
                    if (0 != param1[3].field_r) {
                      si.f(param5, var18, var16, var19);
                      var20 = var14;
                      L18: while (true) {
                        L19: {
                          if (var15 <= var20) {
                            break L19;
                          } else {
                            param1[3].e(param5, var20);
                            var20 = var20 + param1[3].field_r;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        si.a(rj.field_M);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L20: {
                  if (!param2) {
                    break L20;
                  } else {
                    hm.d(79);
                    break L20;
                  }
                }
                L21: {
                  if (null == param1[5]) {
                    break L21;
                  } else {
                    if (param1[5].field_r == 0) {
                      break L21;
                    } else {
                      si.f(var17, var18, var10, var19);
                      var20 = var14;
                      L22: while (true) {
                        L23: {
                          if (var15 <= var20) {
                            break L23;
                          } else {
                            param1[5].e(var13, var20);
                            var20 = var20 + param1[5].field_r;
                            if (0 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        si.a(rj.field_M);
                        break L21;
                      }
                    }
                  }
                }
                L24: {
                  if (param1[4] == null) {
                    break L24;
                  } else {
                    if (param1[4].field_u == 0) {
                      break L24;
                    } else {
                      if (param1[4].field_r == 0) {
                        break L24;
                      } else {
                        si.f(var16, var18, var17, var19);
                        var20 = var14;
                        L25: while (true) {
                          L26: {
                            if (var15 <= var20) {
                              break L26;
                            } else {
                              var21 = var12;
                              L27: while (true) {
                                L28: {
                                  if (var13 <= var21) {
                                    break L28;
                                  } else {
                                    param1[4].e(var21, var20);
                                    var21 = var21 + param1[4].field_u;
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var20 = var20 + param1[4].field_r;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          si.a(rj.field_M);
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
        } else {
          return;
        }
    }

    hm(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((hm) this).field_j = param5;
        ((hm) this).field_k = param3;
        ((hm) this).field_p = param1;
        ((hm) this).field_i = param2;
        ((hm) this).field_h = param4;
        ((hm) this).field_m = param0;
    }

    final static void a(int param0, int param1, vi param2, int param3, int param4) {
        param2.d(param4 + -4023, 12);
        param2.a((byte) -113, 17);
        param2.a((byte) -110, param0);
        if (param4 != 4122) {
            Object var6 = null;
            hm.a(84, (bd[]) null, false, 109, 3, -79);
        }
        param2.a((byte) -128, param1);
        param2.d(122, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Please send me news and updates (I can unsubscribe at any time)";
        field_n = "Names should contain a maximum of 12 characters";
    }
}
