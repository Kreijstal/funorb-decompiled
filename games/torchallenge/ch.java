/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int[] field_c;
    static int[] field_b;
    static String field_d;
    static boolean[][] field_a;

    final static void a(int param0) {
        hh.field_a = null;
        uf.field_i = null;
    }

    final static void b(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == hh.field_c) {
                break L1;
              } else {
                var1_int = 0;
                L2: while (true) {
                  if (var1_int >= hh.field_c.length) {
                    hh.field_c = null;
                    break L1;
                  } else {
                    L3: {
                      if (null == hh.field_c[var1_int]) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var1_int++;
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (am.field_b != null) {
                var1_int = 0;
                L5: while (true) {
                  if (am.field_b.length <= var1_int) {
                    am.field_b = null;
                    break L4;
                  } else {
                    L6: {
                      if (am.field_b[var1_int] == null) {
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var1_int++;
                    continue L5;
                  }
                }
              } else {
                break L4;
              }
            }
            L7: {
              na.field_f = false;
              lj.field_n = null;
              kd.field_m = null;
              if (!param0) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L7;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L7;
              }
            }
            L8: {
              vb.field_q = stackIn_19_0 != 0;
              if (null == lj.field_g) {
                break L8;
              } else {
                var1_int = 0;
                L9: while (true) {
                  if (var1_int >= lj.field_g.length) {
                    lj.field_g = null;
                    break L8;
                  } else {
                    L10: {
                      if (lj.field_g[var1_int] != null) {
                        var2 = 0;
                        L11: while (true) {
                          if (var2 >= lj.field_g[var1_int].length) {
                            lj.field_g[var1_int] = null;
                            break L10;
                          } else {
                            lj.field_g[var1_int][var2] = null;
                            var2++;
                            continue L11;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    var1_int++;
                    continue L9;
                  }
                }
              }
            }
            L12: {
              if (null == ba.field_j) {
                break L12;
              } else {
                var1_int = 0;
                L13: while (true) {
                  if (var1_int >= ba.field_j.length) {
                    ba.field_j = null;
                    break L12;
                  } else {
                    ba.field_j[var1_int] = null;
                    var1_int++;
                    continue L13;
                  }
                }
              }
            }
            L14: {
              if (jj.field_a == null) {
                break L14;
              } else {
                var1_int = 0;
                L15: while (true) {
                  if (jj.field_a.length <= var1_int) {
                    break L14;
                  } else {
                    jj.field_a[var1_int] = null;
                    var1_int++;
                    continue L15;
                  }
                }
              }
            }
            oj.field_d = null;
            fa.field_q = null;
            jj.field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "ch.D(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, ka[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var23 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param6 == null) {
              return;
            } else {
              L1: {
                if (param5 <= 0) {
                  break L1;
                } else {
                  if (0 >= param3) {
                    break L1;
                  } else {
                    if (param0 == 0) {
                      break L1;
                    } else {
                      L2: {
                        if (param6[3] != null) {
                          stackOut_11_0 = param6[3].field_q;
                          stackIn_12_0 = stackOut_11_0;
                          break L2;
                        } else {
                          stackOut_10_0 = 0;
                          stackIn_12_0 = stackOut_10_0;
                          break L2;
                        }
                      }
                      L3: {
                        var7_int = stackIn_12_0;
                        if (param6[5] != null) {
                          stackOut_14_0 = param6[5].field_q;
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
                        if (param6[1] != null) {
                          stackOut_17_0 = param6[1].field_v;
                          stackIn_18_0 = stackOut_17_0;
                          break L4;
                        } else {
                          stackOut_16_0 = 0;
                          stackIn_18_0 = stackOut_16_0;
                          break L4;
                        }
                      }
                      L5: {
                        var9 = stackIn_18_0;
                        if (null == param6[7]) {
                          stackOut_20_0 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          break L5;
                        } else {
                          stackOut_19_0 = param6[7].field_v;
                          stackIn_21_0 = stackOut_19_0;
                          break L5;
                        }
                      }
                      var10 = stackIn_21_0;
                      if (param4) {
                        L6: {
                          var11 = param1 - -param5;
                          var12 = param2 + param3;
                          var13 = var7_int + param1;
                          var14 = var11 + -var8;
                          var15 = var9 + param2;
                          var16 = -var10 + var12;
                          var17 = var13;
                          var18 = var14;
                          if (var18 >= var17) {
                            break L6;
                          } else {
                            var18 = param1 + param5 * var7_int / (var8 + var7_int);
                            var17 = param1 + param5 * var7_int / (var8 + var7_int);
                            break L6;
                          }
                        }
                        L7: {
                          var19 = var15;
                          var20 = var16;
                          if (var19 <= var20) {
                            break L7;
                          } else {
                            var20 = param3 * var9 / (var9 - -var10) + param2;
                            var19 = param3 * var9 / (var9 - -var10) + param2;
                            break L7;
                          }
                        }
                        L8: {
                          qg.a(hb.field_a);
                          if (param6[0] != null) {
                            qg.a(param1, param2, var17, var19);
                            param6[0].d(param1, param2, param0);
                            qg.b(hb.field_a);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (null != param6[2]) {
                            qg.a(var18, param2, var11, var19);
                            param6[2].d(var14, param2, param0);
                            qg.b(hb.field_a);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (param6[6] != null) {
                            qg.a(param1, var20, var17, var12);
                            param6[6].d(param1, var16, param0);
                            qg.b(hb.field_a);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (param6[8] != null) {
                            qg.a(var18, var20, var11, var12);
                            param6[8].d(var14, var16, param0);
                            qg.b(hb.field_a);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (param6[1] == null) {
                            break L12;
                          } else {
                            if (0 != param6[1].field_q) {
                              qg.a(var17, param2, var18, var19);
                              var21 = var13;
                              L13: while (true) {
                                if (var21 >= var14) {
                                  qg.b(hb.field_a);
                                  break L12;
                                } else {
                                  param6[1].d(var21, param2, param0);
                                  var21 = var21 + param6[1].field_q;
                                  continue L13;
                                }
                              }
                            } else {
                              break L12;
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
                                if (var14 <= var21) {
                                  qg.b(hb.field_a);
                                  break L14;
                                } else {
                                  param6[7].d(var21, var16, param0);
                                  var21 = var21 + param6[7].field_q;
                                  continue L15;
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        L16: {
                          if (param6[3] == null) {
                            break L16;
                          } else {
                            if (0 == param6[3].field_v) {
                              break L16;
                            } else {
                              qg.a(param1, var19, var17, var20);
                              var21 = var15;
                              L17: while (true) {
                                if (var21 >= var16) {
                                  qg.b(hb.field_a);
                                  break L16;
                                } else {
                                  param6[3].d(param1, var21, param0);
                                  var21 = var21 + param6[3].field_v;
                                  continue L17;
                                }
                              }
                            }
                          }
                        }
                        L18: {
                          if (null == param6[5]) {
                            break L18;
                          } else {
                            if (0 != param6[5].field_v) {
                              qg.a(var18, var19, var11, var20);
                              var21 = var15;
                              L19: while (true) {
                                if (var21 >= var16) {
                                  qg.b(hb.field_a);
                                  break L18;
                                } else {
                                  param6[5].d(var14, var21, param0);
                                  var21 = var21 + param6[5].field_v;
                                  continue L19;
                                }
                              }
                            } else {
                              break L18;
                            }
                          }
                        }
                        L20: {
                          if (param6[4] == null) {
                            break L20;
                          } else {
                            if (param6[4].field_q == 0) {
                              break L20;
                            } else {
                              if (param6[4].field_v != 0) {
                                qg.a(var17, var19, var18, var20);
                                var21 = var15;
                                L21: while (true) {
                                  if (var16 <= var21) {
                                    qg.b(hb.field_a);
                                    break L20;
                                  } else {
                                    var22 = var13;
                                    L22: while (true) {
                                      if (var14 <= var22) {
                                        var21 = var21 + param6[4].field_v;
                                        continue L21;
                                      } else {
                                        param6[4].d(var22, var21, param0);
                                        var22 = var22 + param6[4].field_q;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var7;
            stackOut_78_1 = new StringBuilder().append("ch.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param6 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L23;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L23;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int[] param0, int[] param1, int param2) {
        try {
            qh.a(0, param1, (byte) 75, param0, -1 + param0.length);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ch.E(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{343, 100, 231, 295};
        field_a = new boolean[][]{new boolean[7], new boolean[7], new boolean[7]};
    }
}
