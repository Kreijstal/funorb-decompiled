/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static int[] field_b;
    int field_a;
    int field_c;
    int field_d;
    int field_e;

    final static void a(float param0, String param1, boolean param2) {
        try {
            if (pc.field_b == null) {
                pc.field_b = new lb(u.field_b, v.field_a);
                u.field_b.b((rc) (Object) pc.field_b, -49);
            }
            pc.field_b.a(param1, param2, param0, 125);
            mi.a();
            uf.a(false, true);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "uj.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + -77 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, o[] param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var22 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              return;
            } else {
              L1: {
                if (param0 <= 0) {
                  break L1;
                } else {
                  if (0 >= param1) {
                    break L1;
                  } else {
                    L2: {
                      if (param3[3] == null) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = param3[3].field_q;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (null == param3[5]) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = param3[5].field_q;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (null == param3[1]) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = param3[1].field_r;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      if (null != param3[7]) {
                        stackOut_19_0 = param3[7].field_r;
                        stackIn_20_0 = stackOut_19_0;
                        break L5;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_20_0;
                      var10 = param0 + param2;
                      var11 = param1 + param4;
                      var12 = param2 - -var6_int;
                      var13 = var10 - var7;
                      var14 = var8 + param4;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var16 > var17) {
                        var17 = param2 + param0 * var6_int / (var7 + var6_int);
                        var16 = param2 + param0 * var6_int / (var7 + var6_int);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      if (var19 < var18) {
                        var19 = param1 * var8 / (var9 + var8) + param4;
                        var18 = param1 * var8 / (var9 + var8) + param4;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      mi.b(SolKnight.field_E);
                      if (param3[0] != null) {
                        mi.d(param2, param4, var16, var18);
                        param3[0].d(param2, param4);
                        mi.a(SolKnight.field_E);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param3[2] == null) {
                        break L9;
                      } else {
                        mi.d(var17, param4, var10, var18);
                        param3[2].d(var13, param4);
                        mi.a(SolKnight.field_E);
                        break L9;
                      }
                    }
                    L10: {
                      if (null == param3[6]) {
                        break L10;
                      } else {
                        mi.d(param2, var19, var16, var11);
                        param3[6].d(param2, var15);
                        mi.a(SolKnight.field_E);
                        break L10;
                      }
                    }
                    L11: {
                      if (null != param3[8]) {
                        mi.d(var17, var19, var10, var11);
                        param3[8].d(var13, var15);
                        mi.a(SolKnight.field_E);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param3[1]) {
                        break L12;
                      } else {
                        if (param3[1].field_q != 0) {
                          mi.d(var16, param4, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var13 <= var20) {
                              mi.a(SolKnight.field_E);
                              break L12;
                            } else {
                              param3[1].d(var20, param4);
                              var20 = var20 + param3[1].field_q;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (null == param3[7]) {
                        break L14;
                      } else {
                        if (0 != param3[7].field_q) {
                          mi.d(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var13 <= var20) {
                              mi.a(SolKnight.field_E);
                              break L14;
                            } else {
                              param3[7].d(var20, var15);
                              var20 = var20 + param3[7].field_q;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (param3[3] == null) {
                        break L16;
                      } else {
                        if (param3[3].field_r == 0) {
                          break L16;
                        } else {
                          mi.d(param2, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var15 <= var20) {
                              mi.a(SolKnight.field_E);
                              break L16;
                            } else {
                              param3[3].d(param2, var20);
                              var20 = var20 + param3[3].field_r;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (param3[5] == null) {
                        break L18;
                      } else {
                        if (param3[5].field_r != 0) {
                          mi.d(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var15 <= var20) {
                              mi.a(SolKnight.field_E);
                              break L18;
                            } else {
                              param3[5].d(var13, var20);
                              var20 = var20 + param3[5].field_r;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (param3[4] == null) {
                        break L20;
                      } else {
                        if (0 == param3[4].field_q) {
                          break L20;
                        } else {
                          if (0 == param3[4].field_r) {
                            break L20;
                          } else {
                            mi.d(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                mi.a(SolKnight.field_E);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param3[4].field_r;
                                    continue L21;
                                  } else {
                                    param3[4].d(var21, var20);
                                    var21 = var21 + param3[4].field_q;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var6;
            stackOut_74_1 = new StringBuilder().append("uj.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L23;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L23;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 44 + param4 + 44 + 2 + 41);
        }
    }

    public static void a() {
        field_b = null;
    }

    static {
    }
}
