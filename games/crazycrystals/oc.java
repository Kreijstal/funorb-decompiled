/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int field_b;
    static byte[][] field_a;

    final static void a(dl[] param0, int param1, int param2, int param3, int param4, int param5) {
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var22 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (0 >= param4) {
                  break L1;
                } else {
                  if (param1 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param0[3] == null) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param0[3].field_n;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null != param0[5]) {
                        stackOut_12_0 = param0[5].field_n;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null != param0[1]) {
                        stackOut_15_0 = param0[1].field_o;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param0[7] != null) {
                        stackOut_18_0 = param0[7].field_o;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param4 + param3;
                      var11 = param2 - -param1;
                      var12 = var6_int + param3;
                      var13 = -var7 + var10;
                      var14 = param2 - -var8;
                      var15 = var11 + -var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 >= var16) {
                        break L6;
                      } else {
                        var17 = param4 * var6_int / (var6_int - -var7) + param3;
                        var16 = param4 * var6_int / (var6_int - -var7) + param3;
                        break L6;
                      }
                    }
                    L7: {
                      if (param5 < -45) {
                        break L7;
                      } else {
                        field_a = null;
                        break L7;
                      }
                    }
                    L8: {
                      var18 = var14;
                      var19 = var15;
                      if (var18 <= var19) {
                        break L8;
                      } else {
                        var19 = param1 * var8 / (var9 + var8) + param2;
                        var18 = param1 * var8 / (var9 + var8) + param2;
                        break L8;
                      }
                    }
                    L9: {
                      kh.b(ec.field_i);
                      if (null == param0[0]) {
                        break L9;
                      } else {
                        kh.a(param3, param2, var16, var18);
                        param0[0].a(param3, param2);
                        kh.a(ec.field_i);
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[2] == null) {
                        break L10;
                      } else {
                        kh.a(var17, param2, var10, var18);
                        param0[2].a(var13, param2);
                        kh.a(ec.field_i);
                        break L10;
                      }
                    }
                    L11: {
                      if (null == param0[6]) {
                        break L11;
                      } else {
                        kh.a(param3, var19, var16, var11);
                        param0[6].a(param3, var15);
                        kh.a(ec.field_i);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param0[8]) {
                        break L12;
                      } else {
                        kh.a(var17, var19, var10, var11);
                        param0[8].a(var13, var15);
                        kh.a(ec.field_i);
                        break L12;
                      }
                    }
                    L13: {
                      if (null == param0[1]) {
                        break L13;
                      } else {
                        if (param0[1].field_n != 0) {
                          kh.a(var16, param2, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var20 >= var13) {
                              kh.a(ec.field_i);
                              break L13;
                            } else {
                              param0[1].a(var20, param2);
                              var20 = var20 + param0[1].field_n;
                              continue L14;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (null == param0[7]) {
                        break L15;
                      } else {
                        if (0 != param0[7].field_n) {
                          kh.a(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var13 <= var20) {
                              kh.a(ec.field_i);
                              break L15;
                            } else {
                              param0[7].a(var20, var15);
                              var20 = var20 + param0[7].field_n;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      if (null == param0[3]) {
                        break L17;
                      } else {
                        if (param0[3].field_o != 0) {
                          kh.a(param3, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var20 >= var15) {
                              kh.a(ec.field_i);
                              break L17;
                            } else {
                              param0[3].a(param3, var20);
                              var20 = var20 + param0[3].field_o;
                              continue L18;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      if (null == param0[5]) {
                        break L19;
                      } else {
                        if (param0[5].field_o != 0) {
                          kh.a(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var15 <= var20) {
                              kh.a(ec.field_i);
                              break L19;
                            } else {
                              param0[5].a(var13, var20);
                              var20 = var20 + param0[5].field_o;
                              continue L20;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    L21: {
                      if (param0[4] == null) {
                        break L21;
                      } else {
                        if (param0[4].field_n == 0) {
                          break L21;
                        } else {
                          if (param0[4].field_o == 0) {
                            break L21;
                          } else {
                            kh.a(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                kh.a(ec.field_i);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param0[4].field_o;
                                    continue L22;
                                  } else {
                                    param0[4].a(var21, var20);
                                    var21 = var21 + param0[4].field_n;
                                    continue L23;
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var6;
            stackOut_72_1 = new StringBuilder().append("oc.A(");
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L24;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L24;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[50][];
    }
}
