/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_b;
    static int field_c;
    static String field_a;

    final static void a(int param0, int param1, byte param2, er[] param3, int param4, int param5) {
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
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var22 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param3 == null) {
              return;
            } else {
              if (param2 > 68) {
                L1: {
                  if (param4 <= 0) {
                    break L1;
                  } else {
                    if (param0 > 0) {
                      L2: {
                        if (param3[3] != null) {
                          stackOut_11_0 = param3[3].field_x;
                          stackIn_12_0 = stackOut_11_0;
                          break L2;
                        } else {
                          stackOut_10_0 = 0;
                          stackIn_12_0 = stackOut_10_0;
                          break L2;
                        }
                      }
                      L3: {
                        var6_int = stackIn_12_0;
                        if (param3[5] != null) {
                          stackOut_14_0 = param3[5].field_x;
                          stackIn_15_0 = stackOut_14_0;
                          break L3;
                        } else {
                          stackOut_13_0 = 0;
                          stackIn_15_0 = stackOut_13_0;
                          break L3;
                        }
                      }
                      L4: {
                        var7 = stackIn_15_0;
                        if (null != param3[1]) {
                          stackOut_17_0 = param3[1].field_B;
                          stackIn_18_0 = stackOut_17_0;
                          break L4;
                        } else {
                          stackOut_16_0 = 0;
                          stackIn_18_0 = stackOut_16_0;
                          break L4;
                        }
                      }
                      L5: {
                        var8 = stackIn_18_0;
                        if (param3[7] != null) {
                          stackOut_20_0 = param3[7].field_B;
                          stackIn_21_0 = stackOut_20_0;
                          break L5;
                        } else {
                          stackOut_19_0 = 0;
                          stackIn_21_0 = stackOut_19_0;
                          break L5;
                        }
                      }
                      L6: {
                        var9 = stackIn_21_0;
                        var10 = param4 + param5;
                        var11 = param1 - -param0;
                        var12 = var6_int + param5;
                        var13 = var10 - var7;
                        var14 = var8 + param1;
                        var15 = var11 - var9;
                        var16 = var12;
                        var17 = var13;
                        if (var17 < var16) {
                          var17 = param4 * var6_int / (var7 + var6_int) + param5;
                          var16 = param4 * var6_int / (var7 + var6_int) + param5;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var18 = var14;
                        var19 = var15;
                        if (var19 < var18) {
                          var19 = param0 * var8 / (var9 + var8) + param1;
                          var18 = param0 * var8 / (var9 + var8) + param1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        bi.a(l.field_h);
                        if (null == param3[0]) {
                          break L8;
                        } else {
                          bi.c(param5, param1, var16, var18);
                          param3[0].e(param5, param1);
                          bi.b(l.field_h);
                          break L8;
                        }
                      }
                      L9: {
                        if (param3[2] == null) {
                          break L9;
                        } else {
                          bi.c(var17, param1, var10, var18);
                          param3[2].e(var13, param1);
                          bi.b(l.field_h);
                          break L9;
                        }
                      }
                      L10: {
                        if (null != param3[6]) {
                          bi.c(param5, var19, var16, var11);
                          param3[6].e(param5, var15);
                          bi.b(l.field_h);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (null == param3[8]) {
                          break L11;
                        } else {
                          bi.c(var17, var19, var10, var11);
                          param3[8].e(var13, var15);
                          bi.b(l.field_h);
                          break L11;
                        }
                      }
                      L12: {
                        if (null == param3[1]) {
                          break L12;
                        } else {
                          if (param3[1].field_x == 0) {
                            break L12;
                          } else {
                            bi.c(var16, param1, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var20 >= var13) {
                                bi.b(l.field_h);
                                break L12;
                              } else {
                                param3[1].e(var20, param1);
                                var20 = var20 + param3[1].field_x;
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if (param3[7] == null) {
                          break L14;
                        } else {
                          if (param3[7].field_x == 0) {
                            break L14;
                          } else {
                            bi.c(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var13 <= var20) {
                                bi.b(l.field_h);
                                break L14;
                              } else {
                                param3[7].e(var20, var15);
                                var20 = var20 + param3[7].field_x;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (param3[3] == null) {
                          break L16;
                        } else {
                          if (param3[3].field_B != 0) {
                            bi.c(param5, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var15 <= var20) {
                                bi.b(l.field_h);
                                break L16;
                              } else {
                                param3[3].e(param5, var20);
                                var20 = var20 + param3[3].field_B;
                                continue L17;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        if (null == param3[5]) {
                          break L18;
                        } else {
                          if (param3[5].field_B != 0) {
                            bi.c(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var15 <= var20) {
                                bi.b(l.field_h);
                                break L18;
                              } else {
                                param3[5].e(var13, var20);
                                var20 = var20 + param3[5].field_B;
                                continue L19;
                              }
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        if (null == param3[4]) {
                          break L20;
                        } else {
                          if (0 == param3[4].field_x) {
                            break L20;
                          } else {
                            if (0 == param3[4].field_B) {
                              break L20;
                            } else {
                              bi.c(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var20 >= var15) {
                                  bi.b(l.field_h);
                                  break L20;
                                } else {
                                  var21 = var12;
                                  L22: while (true) {
                                    if (var13 <= var21) {
                                      var20 = var20 + param3[4].field_B;
                                      continue L21;
                                    } else {
                                      param3[4].e(var21, var20);
                                      var21 = var21 + param3[4].field_x;
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
                    } else {
                      break L1;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var6;
            stackOut_73_1 = new StringBuilder().append("bc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param3 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L23;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L23;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 71;
        field_a = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
