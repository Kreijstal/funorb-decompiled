/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static double field_c;
    static ml field_d;
    static pb[] field_a;
    static int field_b;

    final static void a(int param0, int param1, int param2, pb[] param3, int param4, int param5) {
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var22 = stellarshard.field_B;
        try {
          L0: {
            if (param3 != null) {
              L1: {
                if (0 >= param4) {
                  break L1;
                } else {
                  if (param5 > 0) {
                    L2: {
                      if (null == param3[3]) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = param3[3].field_w;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (null == param3[5]) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = param3[5].field_w;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (param3[1] != null) {
                        stackOut_14_0 = param3[1].field_x;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (param3[7] == null) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = param3[7].field_x;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      if (param0 == -6313) {
                        break L6;
                      } else {
                        field_c = -1.021068867535498;
                        break L6;
                      }
                    }
                    L7: {
                      var10 = param4 + param1;
                      var11 = param5 + param2;
                      var12 = var6_int + param1;
                      var13 = var10 - var7;
                      var14 = param2 + var8;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 < var16) {
                        var17 = param4 * var6_int / (var6_int - -var7) + param1;
                        var16 = param4 * var6_int / (var6_int - -var7) + param1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var18 = var14;
                      var19 = var15;
                      if (var19 >= var18) {
                        break L8;
                      } else {
                        var19 = var8 * param5 / (var9 + var8) + param2;
                        var18 = var8 * param5 / (var9 + var8) + param2;
                        break L8;
                      }
                    }
                    L9: {
                      ti.a(de.field_b);
                      if (param3[0] == null) {
                        break L9;
                      } else {
                        ti.a(param1, param2, var16, var18);
                        param3[0].e(param1, param2);
                        ti.b(de.field_b);
                        break L9;
                      }
                    }
                    L10: {
                      if (param3[2] == null) {
                        break L10;
                      } else {
                        ti.a(var17, param2, var10, var18);
                        param3[2].e(var13, param2);
                        ti.b(de.field_b);
                        break L10;
                      }
                    }
                    L11: {
                      if (null != param3[6]) {
                        ti.a(param1, var19, var16, var11);
                        param3[6].e(param1, var15);
                        ti.b(de.field_b);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (null != param3[8]) {
                        ti.a(var17, var19, var10, var11);
                        param3[8].e(var13, var15);
                        ti.b(de.field_b);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (param3[1] == null) {
                        break L13;
                      } else {
                        if (param3[1].field_w == 0) {
                          break L13;
                        } else {
                          ti.a(var16, param2, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var13 <= var20) {
                              ti.b(de.field_b);
                              break L13;
                            } else {
                              param3[1].e(var20, param2);
                              var20 = var20 + param3[1].field_w;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      if (null == param3[7]) {
                        break L15;
                      } else {
                        if (param3[7].field_w != 0) {
                          ti.a(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var13 <= var20) {
                              ti.b(de.field_b);
                              break L15;
                            } else {
                              param3[7].e(var20, var15);
                              var20 = var20 + param3[7].field_w;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      if (null == param3[3]) {
                        break L17;
                      } else {
                        if (param3[3].field_x == 0) {
                          break L17;
                        } else {
                          ti.a(param1, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var20 >= var15) {
                              ti.b(de.field_b);
                              break L17;
                            } else {
                              param3[3].e(param1, var20);
                              var20 = var20 + param3[3].field_x;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (param3[5] == null) {
                        break L19;
                      } else {
                        if (param3[5].field_x != 0) {
                          ti.a(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var15 <= var20) {
                              ti.b(de.field_b);
                              break L19;
                            } else {
                              param3[5].e(var13, var20);
                              var20 = var20 + param3[5].field_x;
                              continue L20;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    L21: {
                      if (param3[4] == null) {
                        break L21;
                      } else {
                        if (param3[4].field_w == 0) {
                          break L21;
                        } else {
                          if (param3[4].field_x != 0) {
                            ti.a(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                ti.b(de.field_b);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param3[4].field_x;
                                    continue L22;
                                  } else {
                                    param3[4].e(var21, var20);
                                    var21 = var21 + param3[4].field_w;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          } else {
                            break L21;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var6;
            stackOut_73_1 = new StringBuilder().append("ed.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L24;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L24;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > -24) {
            field_a = null;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0.0;
        field_b = 0;
    }
}
