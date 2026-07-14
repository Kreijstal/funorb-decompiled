/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static tf[][] field_a;
    static boolean field_b;
    static int field_d;
    static tf field_e;
    static boolean field_c;
    static String field_f;

    final static tf a(int param0, fm param1, int param2, int param3) {
        if (!rk.a(param0, false, param1, param2)) {
            return null;
        }
        if (param3 != -1) {
            return null;
        }
        return ca.a(0);
    }

    final static String a(String param0, int param1, String param2, fm param3) {
        if (!param3.b(-3)) {
            return param2;
        }
        if (param1 != 0) {
            Object var5 = null;
            tf discarded$0 = dk.a(-69, (fm) null, 92, 117);
        }
        return param0 + " - " + param3.c(0) + "%";
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        if (param0 >= -81) {
            Object var2 = null;
            String discarded$0 = dk.a((String) null, 119, (String) null, (fm) null);
        }
        field_a = null;
    }

    final static void a(boolean param0, fm param1) {
        int var3 = 0;
        int var4 = 0;
        rl var5 = null;
        int[] var6 = null;
        int var7 = 0;
        Object var8 = null;
        pc var9 = null;
        int var10 = 0;
        pc var11 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        var9 = new pc(param1.a((byte) 24, "", "logo.fo3d"));
        var11 = var9;
        var3 = var11.f(255);
        var11.n(-110);
        qn.field_q = pf.a(var11, (byte) 77);
        ck.field_b = new rl[var3];
        wc.field_p = new int[var3][];
        var4 = 0;
        L0: while (true) {
          if (var3 <= var4) {
            var11.o(7);
            var10 = 0;
            var4 = var10;
            L1: while (true) {
              if (var10 >= var3) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    var8 = null;
                    dk.a(53, -11, (byte) -74, -9, -26, (tf[]) null);
                    break L2;
                  }
                }
                return;
              } else {
                var5 = ck.field_b[var10];
                var5.a(6, 6, 6, true, 1);
                var5.a((byte) -17);
                var6 = new int[]{var5.field_b + var5.field_c >> 1770528897, var5.field_F + var5.field_t >> 509948609, var5.field_x + var5.field_g >> 1140018625};
                wc.field_p[var10] = var6;
                var5.a(-var6[0], -var6[2], -var6[1], (byte) -83);
                var10++;
                continue L1;
              }
            }
          } else {
            ck.field_b[var4] = pk.a(var9, -1);
            var4++;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, tf[] param5) {
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
        var22 = Pixelate.field_H ? 1 : 0;
        if (param5 == null) {
          return;
        } else {
          L0: {
            if (param0 <= 0) {
              break L0;
            } else {
              if ((param3 ^ -1) < -1) {
                L1: {
                  if (null == param5[3]) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param5[3].field_A;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (param5[5] != null) {
                    stackOut_11_0 = param5[5].field_A;
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
                  if (param5[1] != null) {
                    stackOut_14_0 = param5[1].field_B;
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
                  if (null == param5[7]) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = param5[7].field_B;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var10 = param0 + param1;
                  var11 = param3 + param4;
                  var12 = var6 + param1;
                  var13 = var10 - var7;
                  var14 = var8 + param4;
                  var15 = var11 + -var9;
                  var16 = var12;
                  var17 = var13;
                  if (var16 <= var17) {
                    break L5;
                  } else {
                    var17 = param1 + var6 * param0 / (var6 - -var7);
                    var16 = param1 + var6 * param0 / (var6 - -var7);
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  t.a(qk.field_c);
                  if (var18 <= var19) {
                    break L6;
                  } else {
                    var19 = param3 * var8 / (var9 + var8) + param4;
                    var18 = param3 * var8 / (var9 + var8) + param4;
                    break L6;
                  }
                }
                L7: {
                  if (null == param5[0]) {
                    break L7;
                  } else {
                    t.d(param1, param4, var16, var18);
                    param5[0].b(param1, param4);
                    t.b(qk.field_c);
                    break L7;
                  }
                }
                L8: {
                  if (param5[2] == null) {
                    break L8;
                  } else {
                    t.d(var17, param4, var10, var18);
                    param5[2].b(var13, param4);
                    t.b(qk.field_c);
                    break L8;
                  }
                }
                if (param2 == 75) {
                  L9: {
                    if (param5[6] != null) {
                      t.d(param1, var19, var16, var11);
                      param5[6].b(param1, var15);
                      t.b(qk.field_c);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (null != param5[8]) {
                      t.d(var17, var19, var10, var11);
                      param5[8].b(var13, var15);
                      t.b(qk.field_c);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param5[1] == null) {
                      break L11;
                    } else {
                      if (0 != param5[1].field_A) {
                        t.d(var16, param4, var17, var18);
                        var20 = var12;
                        L12: while (true) {
                          L13: {
                            if (var20 >= var13) {
                              break L13;
                            } else {
                              param5[1].b(var20, param4);
                              var20 = var20 + param5[1].field_A;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          t.b(qk.field_c);
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (null == param5[7]) {
                      break L14;
                    } else {
                      if (param5[7].field_A != 0) {
                        t.d(var16, var19, var17, var11);
                        var20 = var12;
                        L15: while (true) {
                          L16: {
                            if (var13 <= var20) {
                              break L16;
                            } else {
                              param5[7].b(var20, var15);
                              var20 = var20 + param5[7].field_A;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          t.b(qk.field_c);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  L17: {
                    if (param5[3] == null) {
                      break L17;
                    } else {
                      if (param5[3].field_B != 0) {
                        t.d(param1, var18, var16, var19);
                        var20 = var14;
                        L18: while (true) {
                          L19: {
                            if (var20 >= var15) {
                              break L19;
                            } else {
                              param5[3].b(param1, var20);
                              var20 = var20 + param5[3].field_B;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          t.b(qk.field_c);
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  L20: {
                    if (null == param5[5]) {
                      break L20;
                    } else {
                      if (-1 == (param5[5].field_B ^ -1)) {
                        break L20;
                      } else {
                        t.d(var17, var18, var10, var19);
                        var20 = var14;
                        L21: while (true) {
                          L22: {
                            if (var15 <= var20) {
                              break L22;
                            } else {
                              param5[5].b(var13, var20);
                              var20 = var20 + param5[5].field_B;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          t.b(qk.field_c);
                          break L20;
                        }
                      }
                    }
                  }
                  L23: {
                    if (param5[4] == null) {
                      break L23;
                    } else {
                      if (param5[4].field_A == 0) {
                        break L23;
                      } else {
                        if (0 == param5[4].field_B) {
                          break L23;
                        } else {
                          t.d(var16, var18, var17, var19);
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
                                      param5[4].b(var21, var20);
                                      var21 = var21 + param5[4].field_A;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var20 = var20 + param5[4].field_B;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            t.b(qk.field_c);
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
              } else {
                break L0;
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
        field_b = false;
        field_f = "(Including <%0>)";
        field_c = false;
    }
}
