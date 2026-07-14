/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static String field_g;
    static boolean field_d;
    static String field_b;
    static String field_e;
    private String field_h;
    static char field_c;
    static String field_a;
    static int field_f;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(String param0, int param1) {
        if (param1 != 8) {
            Object var4 = null;
            ((de) this).a(-91, (java.applet.Applet) null);
        }
        return ((de) this).field_h.equals((Object) (Object) param0);
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != 7) {
            return;
        }
        field_g = null;
        field_a = null;
    }

    final static void a(int param0, int param1, wk[] param2, int param3, int param4, byte param5, int param6) {
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
        var23 = SteelSentinels.field_G;
        if (param2 != null) {
          L0: {
            if (-1 <= (param3 ^ -1)) {
              break L0;
            } else {
              if (0 >= param6) {
                break L0;
              } else {
                if (param4 == 0) {
                  break L0;
                } else {
                  L1: {
                    if (param2[3] == null) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      stackOut_8_0 = param2[3].field_z;
                      stackIn_10_0 = stackOut_8_0;
                      break L1;
                    }
                  }
                  L2: {
                    var7 = stackIn_10_0;
                    if (param2[5] != null) {
                      stackOut_12_0 = param2[5].field_z;
                      stackIn_13_0 = stackOut_12_0;
                      break L2;
                    } else {
                      stackOut_11_0 = 0;
                      stackIn_13_0 = stackOut_11_0;
                      break L2;
                    }
                  }
                  L3: {
                    var8 = stackIn_13_0;
                    if (null != param2[1]) {
                      stackOut_15_0 = param2[1].field_B;
                      stackIn_16_0 = stackOut_15_0;
                      break L3;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_16_0 = stackOut_14_0;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = stackIn_16_0;
                    if (null == param2[7]) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L4;
                    } else {
                      stackOut_17_0 = param2[7].field_B;
                      stackIn_19_0 = stackOut_17_0;
                      break L4;
                    }
                  }
                  L5: {
                    var10 = stackIn_19_0;
                    var11 = param3 + param0;
                    var12 = param1 + param6;
                    var13 = var7 + param0;
                    var14 = var11 - var8;
                    var15 = var9 + param1;
                    var16 = -var10 + var12;
                    var17 = var13;
                    var18 = var14;
                    if (var18 >= var17) {
                      break L5;
                    } else {
                      var18 = param0 - -(var7 * param3 / (var8 + var7));
                      var17 = param0 - -(var7 * param3 / (var8 + var7));
                      break L5;
                    }
                  }
                  L6: {
                    var19 = var15;
                    if (param5 == -31) {
                      break L6;
                    } else {
                      de.a(true, 28);
                      break L6;
                    }
                  }
                  L7: {
                    var20 = var16;
                    if (var20 < var19) {
                      var20 = var9 * param6 / (var9 - -var10) + param1;
                      var19 = var9 * param6 / (var9 - -var10) + param1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    pb.b(me.field_g);
                    if (null != param2[0]) {
                      pb.h(param0, param1, var17, var19);
                      param2[0].b(param0, param1, param4);
                      pb.a(me.field_g);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (null == param2[2]) {
                      break L9;
                    } else {
                      pb.h(var18, param1, var11, var19);
                      param2[2].b(var14, param1, param4);
                      pb.a(me.field_g);
                      break L9;
                    }
                  }
                  L10: {
                    if (null != param2[6]) {
                      pb.h(param0, var20, var17, var12);
                      param2[6].b(param0, var16, param4);
                      pb.a(me.field_g);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param2[8] != null) {
                      pb.h(var18, var20, var11, var12);
                      param2[8].b(var14, var16, param4);
                      pb.a(me.field_g);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (null == param2[1]) {
                      break L12;
                    } else {
                      if (param2[1].field_z != 0) {
                        pb.h(var17, param1, var18, var19);
                        var21 = var13;
                        L13: while (true) {
                          L14: {
                            if (var14 <= var21) {
                              break L14;
                            } else {
                              param2[1].b(var21, param1, param4);
                              var21 = var21 + param2[1].field_z;
                              if (0 == 0) {
                                continue L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          pb.a(me.field_g);
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  L15: {
                    if (null == param2[7]) {
                      break L15;
                    } else {
                      if (-1 != (param2[7].field_z ^ -1)) {
                        pb.h(var17, var20, var18, var12);
                        var21 = var13;
                        L16: while (true) {
                          L17: {
                            if (var14 <= var21) {
                              break L17;
                            } else {
                              param2[7].b(var21, var16, param4);
                              var21 = var21 + param2[7].field_z;
                              if (0 == 0) {
                                continue L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          pb.a(me.field_g);
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                  }
                  L18: {
                    if (param2[3] == null) {
                      break L18;
                    } else {
                      if (param2[3].field_B == 0) {
                        break L18;
                      } else {
                        pb.h(param0, var19, var17, var20);
                        var21 = var15;
                        L19: while (true) {
                          L20: {
                            if (var21 >= var16) {
                              break L20;
                            } else {
                              param2[3].b(param0, var21, param4);
                              var21 = var21 + param2[3].field_B;
                              if (0 == 0) {
                                continue L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          pb.a(me.field_g);
                          break L18;
                        }
                      }
                    }
                  }
                  L21: {
                    if (null == param2[5]) {
                      break L21;
                    } else {
                      if (0 == param2[5].field_B) {
                        break L21;
                      } else {
                        pb.h(var18, var19, var11, var20);
                        var21 = var15;
                        L22: while (true) {
                          L23: {
                            if (var21 >= var16) {
                              break L23;
                            } else {
                              param2[5].b(var14, var21, param4);
                              var21 = var21 + param2[5].field_B;
                              if (0 == 0) {
                                continue L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          pb.a(me.field_g);
                          break L21;
                        }
                      }
                    }
                  }
                  L24: {
                    if (param2[4] == null) {
                      break L24;
                    } else {
                      if (-1 == (param2[4].field_z ^ -1)) {
                        break L24;
                      } else {
                        if (param2[4].field_B == 0) {
                          break L24;
                        } else {
                          pb.h(var17, var19, var18, var20);
                          var21 = var15;
                          L25: while (true) {
                            L26: {
                              if (var16 <= var21) {
                                break L26;
                              } else {
                                var22 = var13;
                                L27: while (true) {
                                  L28: {
                                    if (var14 <= var22) {
                                      break L28;
                                    } else {
                                      param2[4].b(var22, var21, param4);
                                      var22 = var22 + param2[4].field_z;
                                      if (0 == 0) {
                                        continue L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  var21 = var21 + param2[4].field_B;
                                  if (0 == 0) {
                                    continue L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            pb.a(me.field_g);
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
          }
          return;
        } else {
          return;
        }
    }

    de(String param0) {
        ((de) this).field_h = param0;
    }

    final void a(int param0, java.applet.Applet param1) {
        if (param0 > -22) {
            return;
        }
        mm.a("jagex-last-login-method", (byte) 122, ((de) this).field_h, param1, 31536000L);
    }

    final static void a(boolean param0, int param1) {
        nd.a(param0, 230827172);
        if (param1 > -121) {
            field_b = null;
        }
    }

    final static boolean a(int param0, byte param1) {
        if (param1 >= -70) {
            return false;
        }
        return param0 == (param0 & -param0) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "SOLARITE EARNED: <img=24><col=<%1>><%0></col>";
        field_e = "<%0>.<%1> m";
        field_b = "Co-op Game";
        field_a = "You are invited to <%0>'s game.";
        field_f = 2;
    }
}
