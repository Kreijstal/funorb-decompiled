/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends oh {
    static si field_i;
    static String[] field_g;
    static String field_h;
    static dl[] field_f;

    final static void a(boolean param0, int param1) {
        if (ph.field_E == null) {
            dq.a(-32056, param0);
        } else {
            q.a(false);
        }
        if (param1 != 0) {
            Object var3 = null;
            qc.a(9, -14, -108, (dl[]) null, -100, -14, -83);
        }
    }

    public static void c(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 <= 114) {
            return;
        }
        field_g = null;
        field_f = null;
    }

    qc() {
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        int var2 = param0.charAt(0);
        if (param1 >= -78) {
            field_h = null;
        }
        for (var3 = 1; var3 < param0.length(); var3++) {
            if (!(param0.charAt(var3) == var2)) {
                return false;
            }
        }
        return true;
    }

    final int a(int param0, int param1) {
        if (param0 != 1843275042) {
            field_g = null;
        }
        return q.field_a[ma.field_n[param1]].field_g;
    }

    int a(byte param0, boolean param1) {
        if (param0 > -53) {
            field_i = null;
        }
        return param1 ? 16 : 2;
    }

    final static void a(int param0, int param1, int param2, dl[] param3, int param4, int param5, int param6) {
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
        var23 = CrazyCrystals.field_B;
        if (param3 != null) {
          L0: {
            if (0 >= param5) {
              break L0;
            } else {
              if (-1 <= (param2 ^ -1)) {
                break L0;
              } else {
                if (param0 == 0) {
                  break L0;
                } else {
                  L1: {
                    if (param3[3] != null) {
                      stackOut_9_0 = param3[3].field_n;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_10_0 = stackOut_8_0;
                      break L1;
                    }
                  }
                  L2: {
                    var7 = stackIn_10_0;
                    if (param3[5] == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L2;
                    } else {
                      stackOut_11_0 = param3[5].field_n;
                      stackIn_13_0 = stackOut_11_0;
                      break L2;
                    }
                  }
                  L3: {
                    var8 = stackIn_13_0;
                    if (null == param3[1]) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L3;
                    } else {
                      stackOut_14_0 = param3[1].field_o;
                      stackIn_16_0 = stackOut_14_0;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = stackIn_16_0;
                    if (null == param3[7]) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L4;
                    } else {
                      stackOut_17_0 = param3[7].field_o;
                      stackIn_19_0 = stackOut_17_0;
                      break L4;
                    }
                  }
                  L5: {
                    var10 = stackIn_19_0;
                    var11 = param4 + param5;
                    var12 = param1 - -param2;
                    var13 = param4 - -var7;
                    var14 = -var8 + var11;
                    var15 = var9 + param1;
                    var16 = var12 - var10;
                    var17 = var13;
                    var18 = var14;
                    if (var18 < var17) {
                      var18 = param4 - -(var7 * param5 / (var8 + var7));
                      var17 = param4 - -(var7 * param5 / (var8 + var7));
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var19 = var15;
                    var20 = var16;
                    kh.b(ec.field_i);
                    if (var20 < var19) {
                      var20 = param1 + var9 * param2 / (var9 + var10);
                      var19 = param1 + var9 * param2 / (var9 + var10);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (param3[0] != null) {
                      kh.a(param4, param1, var17, var19);
                      param3[0].f(param4, param1, param0);
                      kh.a(ec.field_i);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (null == param3[param6]) {
                      break L8;
                    } else {
                      kh.a(var18, param1, var11, var19);
                      param3[2].f(var14, param1, param0);
                      kh.a(ec.field_i);
                      break L8;
                    }
                  }
                  L9: {
                    if (param3[6] != null) {
                      kh.a(param4, var20, var17, var12);
                      param3[6].f(param4, var16, param0);
                      kh.a(ec.field_i);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (null != param3[8]) {
                      kh.a(var18, var20, var11, var12);
                      param3[8].f(var14, var16, param0);
                      kh.a(ec.field_i);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (null == param3[1]) {
                      break L11;
                    } else {
                      if (param3[1].field_n != 0) {
                        kh.a(var17, param1, var18, var19);
                        var21 = var13;
                        L12: while (true) {
                          L13: {
                            if (var14 <= var21) {
                              break L13;
                            } else {
                              param3[1].f(var21, param1, param0);
                              var21 = var21 + param3[1].field_n;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          kh.a(ec.field_i);
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
                      if (param3[7].field_n != 0) {
                        kh.a(var17, var20, var18, var12);
                        var21 = var13;
                        L15: while (true) {
                          L16: {
                            if (var14 <= var21) {
                              break L16;
                            } else {
                              param3[7].f(var21, var16, param0);
                              var21 = var21 + param3[7].field_n;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          kh.a(ec.field_i);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  L17: {
                    if (null == param3[3]) {
                      break L17;
                    } else {
                      if (0 != param3[3].field_o) {
                        kh.a(param4, var19, var17, var20);
                        var21 = var15;
                        L18: while (true) {
                          L19: {
                            if (var16 <= var21) {
                              break L19;
                            } else {
                              param3[3].f(param4, var21, param0);
                              var21 = var21 + param3[3].field_o;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          kh.a(ec.field_i);
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  L20: {
                    if (param3[5] == null) {
                      break L20;
                    } else {
                      if (param3[5].field_o != 0) {
                        kh.a(var18, var19, var11, var20);
                        var21 = var15;
                        L21: while (true) {
                          L22: {
                            if (var21 >= var16) {
                              break L22;
                            } else {
                              param3[5].f(var14, var21, param0);
                              var21 = var21 + param3[5].field_o;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          kh.a(ec.field_i);
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L23: {
                    if (null == param3[4]) {
                      break L23;
                    } else {
                      if (0 == param3[4].field_n) {
                        break L23;
                      } else {
                        if (param3[4].field_o == 0) {
                          break L23;
                        } else {
                          kh.a(var17, var19, var18, var20);
                          var21 = var15;
                          L24: while (true) {
                            L25: {
                              if (var21 >= var16) {
                                break L25;
                              } else {
                                var22 = var13;
                                L26: while (true) {
                                  L27: {
                                    if (var22 >= var14) {
                                      break L27;
                                    } else {
                                      param3[4].f(var22, var21, param0);
                                      var22 = var22 + param3[4].field_n;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var21 = var21 + param3[4].field_o;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            kh.a(ec.field_i);
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
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_h = "Accept";
        field_f = new dl[4];
    }
}
