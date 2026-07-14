/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int[] field_c;
    static int[] field_b;
    static String field_d;
    static boolean[][] field_a;

    final static void a(int param0) {
        if (param0 < 57) {
            ch.b(true);
        }
        hh.field_a = null;
        uf.field_i = null;
    }

    final static void b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          if (null == hh.field_c) {
            break L0;
          } else {
            var1 = 0;
            L1: while (true) {
              if (var1 >= hh.field_c.length) {
                hh.field_c = null;
                break L0;
              } else {
                if (null != hh.field_c[var1]) {
                  var2 = 0;
                  L2: while (true) {
                    if (var2 >= hh.field_c[var1].length) {
                      hh.field_c[var1] = null;
                      var1++;
                      continue L1;
                    } else {
                      hh.field_c[var1][var2] = null;
                      var2++;
                      continue L2;
                    }
                  }
                } else {
                  var1++;
                  continue L1;
                }
              }
            }
          }
        }
        L3: {
          if (am.field_b != null) {
            var1 = 0;
            L4: while (true) {
              if (am.field_b.length <= var1) {
                am.field_b = null;
                break L3;
              } else {
                if (am.field_b[var1] != null) {
                  var2 = 0;
                  L5: while (true) {
                    if (var2 >= am.field_b[var1].length) {
                      am.field_b[var1] = null;
                      var1++;
                      continue L4;
                    } else {
                      am.field_b[var1][var2] = null;
                      var2++;
                      continue L5;
                    }
                  }
                } else {
                  var1++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        L6: {
          na.field_f = false;
          lj.field_n = null;
          kd.field_m = null;
          if (!param0) {
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L6;
          } else {
            stackOut_22_0 = 1;
            stackIn_24_0 = stackOut_22_0;
            break L6;
          }
        }
        L7: {
          vb.field_q = stackIn_24_0 != 0;
          if (null == lj.field_g) {
            break L7;
          } else {
            var1 = 0;
            L8: while (true) {
              if (var1 >= lj.field_g.length) {
                lj.field_g = null;
                break L7;
              } else {
                if (lj.field_g[var1] != null) {
                  var2 = 0;
                  L9: while (true) {
                    if (var2 >= lj.field_g[var1].length) {
                      lj.field_g[var1] = null;
                      var1++;
                      continue L8;
                    } else {
                      lj.field_g[var1][var2] = null;
                      var2++;
                      continue L9;
                    }
                  }
                } else {
                  var1++;
                  continue L8;
                }
              }
            }
          }
        }
        L10: {
          if (null == ba.field_j) {
            break L10;
          } else {
            var1 = 0;
            L11: while (true) {
              if (var1 >= ba.field_j.length) {
                ba.field_j = null;
                break L10;
              } else {
                ba.field_j[var1] = null;
                var1++;
                continue L11;
              }
            }
          }
        }
        L12: {
          if (jj.field_a == null) {
            break L12;
          } else {
            var1 = 0;
            L13: while (true) {
              if (jj.field_a.length <= var1) {
                break L12;
              } else {
                jj.field_a[var1] = null;
                var1++;
                continue L13;
              }
            }
          }
        }
        oj.field_d = null;
        fa.field_q = null;
        jj.field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, ka[] param6) {
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
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var23 = TorChallenge.field_F ? 1 : 0;
        if (param6 == null) {
          return;
        } else {
          L0: {
            if (-1 <= (param5 ^ -1)) {
              break L0;
            } else {
              if (0 >= param3) {
                break L0;
              } else {
                if (param0 == 0) {
                  break L0;
                } else {
                  L1: {
                    if (param6[3] != null) {
                      stackOut_10_0 = param6[3].field_q;
                      stackIn_11_0 = stackOut_10_0;
                      break L1;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_11_0 = stackOut_9_0;
                      break L1;
                    }
                  }
                  L2: {
                    var7 = stackIn_11_0;
                    if (param6[5] != null) {
                      stackOut_13_0 = param6[5].field_q;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  L3: {
                    var8 = stackIn_14_0;
                    if (param6[1] != null) {
                      stackOut_16_0 = param6[1].field_v;
                      stackIn_17_0 = stackOut_16_0;
                      break L3;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_17_0 = stackOut_15_0;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = stackIn_17_0;
                    if (null == param6[7]) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L4;
                    } else {
                      stackOut_18_0 = param6[7].field_v;
                      stackIn_20_0 = stackOut_18_0;
                      break L4;
                    }
                  }
                  var10 = stackIn_20_0;
                  if (param4) {
                    L5: {
                      var11 = param1 - -param5;
                      var12 = param2 + param3;
                      var13 = var7 + param1;
                      var14 = var11 + -var8;
                      var15 = var9 + param2;
                      var16 = -var10 + var12;
                      var17 = var13;
                      var18 = var14;
                      if (var18 >= var17) {
                        break L5;
                      } else {
                        var18 = param1 + param5 * var7 / (var8 + var7);
                        var17 = param1 + param5 * var7 / (var8 + var7);
                        break L5;
                      }
                    }
                    L6: {
                      var19 = var15;
                      var20 = var16;
                      if (var19 <= var20) {
                        break L6;
                      } else {
                        var20 = param3 * var9 / (var9 - -var10) + param2;
                        var19 = param3 * var9 / (var9 - -var10) + param2;
                        break L6;
                      }
                    }
                    L7: {
                      qg.a(hb.field_a);
                      if (param6[0] != null) {
                        qg.a(param1, param2, var17, var19);
                        param6[0].d(param1, param2, param0);
                        qg.b(hb.field_a);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (null != param6[2]) {
                        qg.a(var18, param2, var11, var19);
                        param6[2].d(var14, param2, param0);
                        qg.b(hb.field_a);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param6[6] != null) {
                        qg.a(param1, var20, var17, var12);
                        param6[6].d(param1, var16, param0);
                        qg.b(hb.field_a);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param6[8] != null) {
                        qg.a(var18, var20, var11, var12);
                        param6[8].d(var14, var16, param0);
                        qg.b(hb.field_a);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param6[1] == null) {
                        break L11;
                      } else {
                        if (0 != param6[1].field_q) {
                          qg.a(var17, param2, var18, var19);
                          var21 = var13;
                          L12: while (true) {
                            L13: {
                              if (var21 >= var14) {
                                break L13;
                              } else {
                                param6[1].d(var21, param2, param0);
                                var21 = var21 + param6[1].field_q;
                                if (0 == 0) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            qg.b(hb.field_a);
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    L14: {
                      if (null == param6[7]) {
                        break L14;
                      } else {
                        if (param6[7].field_q != 0) {
                          qg.a(var17, var20, var18, var12);
                          var21 = var13;
                          L15: while (true) {
                            L16: {
                              if (var14 <= var21) {
                                break L16;
                              } else {
                                param6[7].d(var21, var16, param0);
                                var21 = var21 + param6[7].field_q;
                                if (0 == 0) {
                                  continue L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            qg.b(hb.field_a);
                            break L14;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L17: {
                      if (param6[3] == null) {
                        break L17;
                      } else {
                        if (0 == param6[3].field_v) {
                          break L17;
                        } else {
                          qg.a(param1, var19, var17, var20);
                          var21 = var15;
                          L18: while (true) {
                            L19: {
                              if (var21 >= var16) {
                                break L19;
                              } else {
                                param6[3].d(param1, var21, param0);
                                var21 = var21 + param6[3].field_v;
                                if (0 == 0) {
                                  continue L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            qg.b(hb.field_a);
                            break L17;
                          }
                        }
                      }
                    }
                    L20: {
                      if (null == param6[5]) {
                        break L20;
                      } else {
                        if (0 != param6[5].field_v) {
                          qg.a(var18, var19, var11, var20);
                          var21 = var15;
                          L21: while (true) {
                            L22: {
                              if (var21 >= var16) {
                                break L22;
                              } else {
                                param6[5].d(var14, var21, param0);
                                var21 = var21 + param6[5].field_v;
                                if (0 == 0) {
                                  continue L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            qg.b(hb.field_a);
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                    }
                    L23: {
                      if (param6[4] == null) {
                        break L23;
                      } else {
                        if (param6[4].field_q == 0) {
                          break L23;
                        } else {
                          if (param6[4].field_v != 0) {
                            qg.a(var17, var19, var18, var20);
                            var21 = var15;
                            L24: while (true) {
                              L25: {
                                if (var16 <= var21) {
                                  break L25;
                                } else {
                                  var22 = var13;
                                  L26: while (true) {
                                    L27: {
                                      if (var14 <= var22) {
                                        break L27;
                                      } else {
                                        param6[4].d(var22, var21, param0);
                                        var22 = var22 + param6[4].field_q;
                                        if (0 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var21 = var21 + param6[4].field_v;
                                    if (0 == 0) {
                                      continue L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              qg.b(hb.field_a);
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
                    return;
                  }
                }
              }
            }
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0) {
            field_a = null;
        }
    }

    final static void a(int[] param0, int[] param1, int param2) {
        qh.a(param2, param1, (byte) 75, param0, -1 + param0.length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{343, 100, 231, 295};
        field_a = new boolean[][]{new boolean[7], new boolean[7], new boolean[7]};
    }
}
