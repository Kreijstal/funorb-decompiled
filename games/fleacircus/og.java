/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends gj implements dc, da {
    private ja field_H;
    private bb field_G;
    private ua field_F;

    private final String j(int param0) {
        if (param0 != 0) {
            String discarded$0 = this.j(113);
        }
        return "</col></u>";
    }

    private final String a(int param0) {
        if (param0 > -78) {
            ((og) this).field_H = null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        if (param3 != 248) {
            return;
        }
        if (param4 == ((og) this).field_G) {
            ih.l(255);
            ((og) this).field_F.n(-22645);
        }
    }

    final static void a(int param0, dd[] param1, int param2, int param3, int param4, int param5) {
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
        int var23 = 0;
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
        var23 = fleas.field_A ? 1 : 0;
        if (param1 != null) {
          L0: {
            if (0 >= param5) {
              break L0;
            } else {
              if ((param4 ^ -1) < -1) {
                L1: {
                  if (null == param1[3]) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = param1[3].field_x;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_8_0;
                  if (param1[5] != null) {
                    stackOut_10_0 = param1[5].field_x;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = 0;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_11_0;
                  if (param1[1] != null) {
                    stackOut_13_0 = param1[1].field_r;
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
                  if (null != param1[7]) {
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
                  var10 = param3 - -param5;
                  var11 = param0 + param4;
                  var13 = -77 % ((22 - param2) / 54);
                  var12 = param3 + var6;
                  var14 = var10 + -var7;
                  var15 = param0 - -var8;
                  var16 = var11 + -var9;
                  var17 = var12;
                  var18 = var14;
                  if (var17 <= var18) {
                    break L5;
                  } else {
                    var18 = param5 * var6 / (var6 - -var7) + param3;
                    var17 = param5 * var6 / (var6 - -var7) + param3;
                    break L5;
                  }
                }
                L6: {
                  var19 = var15;
                  var20 = var16;
                  if (var20 >= var19) {
                    break L6;
                  } else {
                    var20 = param4 * var8 / (var8 - -var9) + param0;
                    var19 = param4 * var8 / (var8 - -var9) + param0;
                    break L6;
                  }
                }
                L7: {
                  gb.a(il.field_f);
                  if (null == param1[0]) {
                    break L7;
                  } else {
                    gb.g(param3, param0, var17, var19);
                    param1[0].d(param3, param0);
                    gb.b(il.field_f);
                    break L7;
                  }
                }
                L8: {
                  if (null == param1[2]) {
                    break L8;
                  } else {
                    gb.g(var18, param0, var10, var19);
                    param1[2].d(var14, param0);
                    gb.b(il.field_f);
                    break L8;
                  }
                }
                L9: {
                  if (param1[6] != null) {
                    gb.g(param3, var20, var17, var11);
                    param1[6].d(param3, var16);
                    gb.b(il.field_f);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (null == param1[8]) {
                    break L10;
                  } else {
                    gb.g(var18, var20, var10, var11);
                    param1[8].d(var14, var16);
                    gb.b(il.field_f);
                    break L10;
                  }
                }
                L11: {
                  if (null == param1[1]) {
                    break L11;
                  } else {
                    if (param1[1].field_x != 0) {
                      gb.g(var17, param0, var18, var19);
                      var21 = var12;
                      L12: while (true) {
                        L13: {
                          if (var21 >= var14) {
                            break L13;
                          } else {
                            param1[1].d(var21, param0);
                            var21 = var21 + param1[1].field_x;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        gb.b(il.field_f);
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                L14: {
                  if (param1[7] == null) {
                    break L14;
                  } else {
                    if (-1 == (param1[7].field_x ^ -1)) {
                      break L14;
                    } else {
                      gb.g(var17, var20, var18, var11);
                      var21 = var12;
                      L15: while (true) {
                        L16: {
                          if (var14 <= var21) {
                            break L16;
                          } else {
                            param1[7].d(var21, var16);
                            var21 = var21 + param1[7].field_x;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        gb.b(il.field_f);
                        break L14;
                      }
                    }
                  }
                }
                L17: {
                  if (null == param1[3]) {
                    break L17;
                  } else {
                    if (param1[3].field_r != 0) {
                      gb.g(param3, var19, var17, var20);
                      var21 = var15;
                      L18: while (true) {
                        L19: {
                          if (var21 >= var16) {
                            break L19;
                          } else {
                            param1[3].d(param3, var21);
                            var21 = var21 + param1[3].field_r;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        gb.b(il.field_f);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L20: {
                  if (param1[5] == null) {
                    break L20;
                  } else {
                    if (param1[5].field_r != 0) {
                      gb.g(var18, var19, var10, var20);
                      var21 = var15;
                      L21: while (true) {
                        L22: {
                          if (var21 >= var16) {
                            break L22;
                          } else {
                            param1[5].d(var14, var21);
                            var21 = var21 + param1[5].field_r;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        gb.b(il.field_f);
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L23: {
                  if (null == param1[4]) {
                    break L23;
                  } else {
                    if (-1 == (param1[4].field_x ^ -1)) {
                      break L23;
                    } else {
                      if (param1[4].field_r != 0) {
                        gb.g(var17, var19, var18, var20);
                        var21 = var15;
                        L24: while (true) {
                          L25: {
                            if (var16 <= var21) {
                              break L25;
                            } else {
                              var22 = var12;
                              L26: while (true) {
                                L27: {
                                  if (var22 >= var14) {
                                    break L27;
                                  } else {
                                    param1[4].d(var22, var21);
                                    var22 = var22 + param1[4].field_x;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var21 = var21 + param1[4].field_r;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          gb.b(il.field_f);
                          break L23;
                        }
                      } else {
                        break L23;
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

    final boolean a(int param0, int param1, qa param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param1) {
            return ((og) this).b(param2, -28533);
          } else {
            if (99 == param1) {
              return ((og) this).a(32, param2);
            } else {
              return false;
            }
          }
        }
    }

    og(ua param0) {
        super(0, 0, 288, 0, (ch) null);
        ((og) this).field_F = param0;
        ((og) this).field_G = new bb(ee.field_k, (kd) null);
        ((og) this).field_G.field_p = (ch) (Object) new ri();
        String var7 = db.a(oh.field_jb, new String[2], true);
        int var3 = 20;
        e var4 = new e(ug.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ug.field_e.field_H, -1, 2147483647, true);
        ((og) this).field_H = new ja(var7, (ch) (Object) var4);
        ((og) this).field_H.field_m = "";
        ((og) this).field_H.a(0, pi.field_f, 0);
        ((og) this).field_H.a(0, pi.field_f, 1);
        ((og) this).field_H.field_u = -40 + ((og) this).field_u;
        ((og) this).field_H.field_s = (kd) this;
        ((og) this).field_H.b(((og) this).field_u - 40, 26, var3, -9);
        var3 = var3 + (15 + ((og) this).field_H.field_j);
        ((og) this).a((qa) (Object) ((og) this).field_H, (byte) -55);
        int var5 = 4;
        int var6 = 200;
        ((og) this).field_G.a(-var6 + 300 >> -766781471, var6, var3, 40, 80);
        ((og) this).field_G.field_s = (kd) this;
        ((og) this).a((qa) (Object) ((og) this).field_G, (byte) -70);
        ((og) this).a(0, 300, 0, var3 - (-55 - var5), 80);
    }

    public final void a(int param0, ja param1, int param2, int param3) {
        int var6 = fleas.field_A ? 1 : 0;
        int var5 = -79 % ((param3 - -36) / 61);
        if (0 == param0) {
            lk.a(-15493, "terms.ws");
        } else {
            if (param0 == 1) {
                lk.a(-15493, "privacy.ws");
            } else {
                if (param0 == 2) {
                    lk.a(-15493, "conduct.ws");
                }
            }
        }
    }

    static {
    }
}
