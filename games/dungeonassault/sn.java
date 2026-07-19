/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static cn[] field_c;
    static String[] field_a;
    static pp field_b;

    final static void a(int param0, String param1) {
        System.out.println("Error: " + eg.a(param1, "%0a", "\n", true));
        if (param0 != 11580) {
            field_c = (cn[]) null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 5) {
            cn[] var2 = (cn[]) null;
            sn.a(99, -43, (cn[]) null, -117, -42, 22);
        }
        field_a = null;
    }

    final static void a(int param0, int param1, cn[] param2, int param3, int param4, int param5) {
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
        int var23 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var23 = DungeonAssault.field_K;
        try {
          L0: {
            if (param2 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 >= param5) {
                  break L1;
                } else {
                  if ((param1 ^ -1) >= -1) {
                    break L1;
                  } else {
                    L2: {
                      var7 = 48 / ((34 - param0) / 62);
                      if (param2[3] == null) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = param2[3].field_E;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (null == param2[5]) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = param2[5].field_E;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var8 = stackIn_14_0;
                      if (null == param2[1]) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = param2[1].field_G;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var9 = stackIn_17_0;
                      if (param2[7] != null) {
                        stackOut_19_0 = param2[7].field_G;
                        stackIn_20_0 = stackOut_19_0;
                        break L5;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_20_0 = stackOut_18_0;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = stackIn_20_0;
                      var11 = param3 + param5;
                      var12 = param4 + param1;
                      var13 = var6_int + param3;
                      var14 = var11 + -var8;
                      var15 = var9 + param4;
                      var16 = var12 - var10;
                      var17 = var13;
                      var18 = var14;
                      if (var17 > var18) {
                        var18 = param3 + param5 * var6_int / (var8 + var6_int);
                        var17 = param3 + param5 * var6_int / (var8 + var6_int);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var19 = var15;
                      var20 = var16;
                      gf.a(fc.field_g);
                      if (var20 < var19) {
                        var20 = param4 - -(var9 * param1 / (var9 - -var10));
                        var19 = param4 - -(var9 * param1 / (var9 - -var10));
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (null == param2[0]) {
                        break L8;
                      } else {
                        gf.a(param3, param4, var17, var19);
                        param2[0].h(param3, param4);
                        gf.b(fc.field_g);
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param2[2]) {
                        gf.a(var18, param4, var11, var19);
                        param2[2].h(var14, param4);
                        gf.b(fc.field_g);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param2[6] == null) {
                        break L10;
                      } else {
                        gf.a(param3, var20, var17, var12);
                        param2[6].h(param3, var16);
                        gf.b(fc.field_g);
                        break L10;
                      }
                    }
                    L11: {
                      if (param2[8] != null) {
                        gf.a(var18, var20, var11, var12);
                        param2[8].h(var14, var16);
                        gf.b(fc.field_g);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param2[1] == null) {
                        break L12;
                      } else {
                        if (param2[1].field_E == 0) {
                          break L12;
                        } else {
                          gf.a(var17, param4, var18, var19);
                          var21 = var13;
                          L13: while (true) {
                            if (var14 <= var21) {
                              gf.b(fc.field_g);
                              break L12;
                            } else {
                              param2[1].h(var21, param4);
                              var21 = var21 + param2[1].field_E;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (null == param2[7]) {
                        break L14;
                      } else {
                        if (-1 != (param2[7].field_E ^ -1)) {
                          gf.a(var17, var20, var18, var12);
                          var21 = var13;
                          L15: while (true) {
                            if (var14 <= var21) {
                              gf.b(fc.field_g);
                              break L14;
                            } else {
                              param2[7].h(var21, var16);
                              var21 = var21 + param2[7].field_E;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (param2[3] == null) {
                        break L16;
                      } else {
                        if (0 == param2[3].field_G) {
                          break L16;
                        } else {
                          gf.a(param3, var19, var17, var20);
                          var21 = var15;
                          L17: while (true) {
                            if (var16 <= var21) {
                              gf.b(fc.field_g);
                              break L16;
                            } else {
                              param2[3].h(param3, var21);
                              var21 = var21 + param2[3].field_G;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (null == param2[5]) {
                        break L18;
                      } else {
                        if (0 != param2[5].field_G) {
                          gf.a(var18, var19, var11, var20);
                          var21 = var15;
                          L19: while (true) {
                            if (var21 >= var16) {
                              gf.b(fc.field_g);
                              break L18;
                            } else {
                              param2[5].h(var14, var21);
                              var21 = var21 + param2[5].field_G;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (param2[4] == null) {
                        break L20;
                      } else {
                        if (param2[4].field_E == 0) {
                          break L20;
                        } else {
                          if (0 == param2[4].field_G) {
                            break L20;
                          } else {
                            gf.a(var17, var19, var18, var20);
                            var21 = var15;
                            L21: while (true) {
                              if (var21 >= var16) {
                                gf.b(fc.field_g);
                                break L20;
                              } else {
                                var22 = var13;
                                L22: while (true) {
                                  if (var14 <= var22) {
                                    var21 = var21 + param2[4].field_G;
                                    continue L21;
                                  } else {
                                    param2[4].h(var22, var21);
                                    var22 = var22 + param2[4].field_E;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) (var6);
            stackOut_73_1 = new StringBuilder().append("sn.B(").append(param0).append(',').append(param1).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L23;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L23;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param0 <= 2) {
            return;
        }
        ki.field_f = param1;
    }

    static {
    }
}
