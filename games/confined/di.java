/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String[] field_g;
    static String field_e;
    static bi field_a;
    static String field_c;
    static String field_b;
    static od field_d;
    static String field_f;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 0) {
            Object var2 = null;
            di.a(100, (nf[]) null, (byte) 46, 121, -125, -36);
        }
        field_g = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_e = null;
    }

    final static void a(int param0, nf[] param1, byte param2, int param3, int param4, int param5) {
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
        Object var23 = null;
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
        var22 = Confined.field_J ? 1 : 0;
        if (param1 != null) {
          L0: {
            if (0 >= param4) {
              break L0;
            } else {
              if ((param0 ^ -1) >= -1) {
                break L0;
              } else {
                L1: {
                  if (param1[3] == null) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param1[3].field_t;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (null == param1[5]) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = param1[5].field_t;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (null != param1[1]) {
                    stackOut_14_0 = param1[1].field_x;
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
                  if (param1[7] == null) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = param1[7].field_x;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var10 = param3 - -param4;
                  var11 = param0 + param5;
                  var12 = var6 + param3;
                  if (param2 < -23) {
                    break L5;
                  } else {
                    var23 = null;
                    di.a(-48, (nf[]) null, (byte) 113, -19, 53, -112);
                    break L5;
                  }
                }
                L6: {
                  var13 = var10 + -var7;
                  var14 = var8 + param5;
                  var15 = var11 - var9;
                  var16 = var12;
                  var17 = var13;
                  if (var16 <= var17) {
                    break L6;
                  } else {
                    var17 = param3 + var6 * param4 / (var6 - -var7);
                    var16 = param3 + var6 * param4 / (var6 - -var7);
                    break L6;
                  }
                }
                L7: {
                  var18 = var14;
                  var19 = var15;
                  fn.b(fj.field_E);
                  if (var18 <= var19) {
                    break L7;
                  } else {
                    var19 = var8 * param0 / (var9 + var8) + param5;
                    var18 = var8 * param0 / (var9 + var8) + param5;
                    break L7;
                  }
                }
                L8: {
                  if (null == param1[0]) {
                    break L8;
                  } else {
                    fn.f(param3, param5, var16, var18);
                    param1[0].d(param3, param5);
                    fn.a(fj.field_E);
                    break L8;
                  }
                }
                L9: {
                  if (param1[2] == null) {
                    break L9;
                  } else {
                    fn.f(var17, param5, var10, var18);
                    param1[2].d(var13, param5);
                    fn.a(fj.field_E);
                    break L9;
                  }
                }
                L10: {
                  if (param1[6] == null) {
                    break L10;
                  } else {
                    fn.f(param3, var19, var16, var11);
                    param1[6].d(param3, var15);
                    fn.a(fj.field_E);
                    break L10;
                  }
                }
                L11: {
                  if (null == param1[8]) {
                    break L11;
                  } else {
                    fn.f(var17, var19, var10, var11);
                    param1[8].d(var13, var15);
                    fn.a(fj.field_E);
                    break L11;
                  }
                }
                L12: {
                  if (param1[1] == null) {
                    break L12;
                  } else {
                    if (0 == param1[1].field_t) {
                      break L12;
                    } else {
                      fn.f(var16, param5, var17, var18);
                      var20 = var12;
                      L13: while (true) {
                        L14: {
                          if (var13 <= var20) {
                            break L14;
                          } else {
                            param1[1].d(var20, param5);
                            var20 = var20 + param1[1].field_t;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        fn.a(fj.field_E);
                        break L12;
                      }
                    }
                  }
                }
                L15: {
                  if (null == param1[7]) {
                    break L15;
                  } else {
                    if (-1 != (param1[7].field_t ^ -1)) {
                      fn.f(var16, var19, var17, var11);
                      var20 = var12;
                      L16: while (true) {
                        L17: {
                          if (var20 >= var13) {
                            break L17;
                          } else {
                            param1[7].d(var20, var15);
                            var20 = var20 + param1[7].field_t;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        fn.a(fj.field_E);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                L18: {
                  if (null == param1[3]) {
                    break L18;
                  } else {
                    if (param1[3].field_x != 0) {
                      fn.f(param3, var18, var16, var19);
                      var20 = var14;
                      L19: while (true) {
                        L20: {
                          if (var15 <= var20) {
                            break L20;
                          } else {
                            param1[3].d(param3, var20);
                            var20 = var20 + param1[3].field_x;
                            if (0 == 0) {
                              continue L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        fn.a(fj.field_E);
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                }
                L21: {
                  if (null == param1[5]) {
                    break L21;
                  } else {
                    if (0 == param1[5].field_x) {
                      break L21;
                    } else {
                      fn.f(var17, var18, var10, var19);
                      var20 = var14;
                      L22: while (true) {
                        L23: {
                          if (var20 >= var15) {
                            break L23;
                          } else {
                            param1[5].d(var13, var20);
                            var20 = var20 + param1[5].field_x;
                            if (0 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        fn.a(fj.field_E);
                        break L21;
                      }
                    }
                  }
                }
                L24: {
                  if (param1[4] == null) {
                    break L24;
                  } else {
                    if (param1[4].field_t == 0) {
                      break L24;
                    } else {
                      if (0 != param1[4].field_x) {
                        fn.f(var16, var18, var17, var19);
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
                                    param1[4].d(var21, var20);
                                    var21 = var21 + param1[4].field_t;
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var20 = var20 + param1[4].field_x;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          fn.a(fj.field_E);
                          break L24;
                        }
                      } else {
                        break L24;
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

    final static String a(boolean param0) {
        if (!(null != qc.field_m)) {
            return "";
        }
        if (!param0) {
            di.a(88);
        }
        return qc.field_m;
    }

    final static void a(int param0, int param1, int param2) {
        if (!(-1 == (1 << param2 & i.field_o ^ -1))) {
            return;
        }
        i.field_o = i.field_o | 1 << param2;
        if (param0 != -30867) {
            field_a = null;
        }
        oj.field_B = oj.field_B | 1 << param2;
        qn.field_v.field_u.a((rk) (Object) new an(param2), (byte) -110);
        ra.field_c.a((rk) (Object) new sf(param2, param1, qn.field_v.field_B.field_yb + bd.field_h, we.field_g + qn.field_v.field_J.field_o, d.field_a + -qn.field_v.field_h, rc.field_i), (byte) 73);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_e = "<col=FFFFFF>Power-up attractor:</col> collect this and your ship will attempt to pull power-ups in automatically for 30 seconds, enabling you to concentrate more on dodging enemy fire and aiming your weapons.";
        field_b = "<col=FFFFFF>Mine:</col> the aliens start dropping these from Level 7 onwards. They are hard to see, but will explode and damage your shields if you hit them. Try not to!";
        field_c = "No";
        field_f = "Collision course";
    }
}
