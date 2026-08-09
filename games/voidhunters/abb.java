/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class abb {
    static int field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, phb[] param4, int param5) {
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        var22 = VoidHunters.field_G;
        try {
          L0: {
            if (param4 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 >= param2) {
                  break L1;
                } else {
                  if (0 >= param1) {
                    break L1;
                  } else {
                    L2: {
                      if (param4[param0] == null) {
                        stackIn_11_0 = 0;
                        break L2;
                      } else {
                        stackIn_11_0 = param4[3].field_m;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (null != param4[5]) {
                        stackIn_14_0 = param4[5].field_m;
                        break L3;
                      } else {
                        stackIn_14_0 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (param4[1] == null) {
                        stackIn_17_0 = 0;
                        break L4;
                      } else {
                        stackIn_17_0 = param4[1].field_n;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      if (param4[7] != null) {
                        stackIn_20_0 = param4[7].field_n;
                        break L5;
                      } else {
                        stackIn_20_0 = 0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_20_0;
                      var10 = param5 + param2;
                      var11 = param1 + param3;
                      var12 = param5 - -var6_int;
                      var13 = -var7 + var10;
                      var14 = param3 - -var8;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var16 <= var17) {
                        break L6;
                      } else {
                        var17 = param2 * var6_int / (var6_int + var7) + param5;
                        var16 = param2 * var6_int / (var6_int + var7) + param5;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      if (var19 < var18) {
                        var19 = param1 * var8 / (var9 + var8) + param3;
                        var18 = param1 * var8 / (var9 + var8) + param3;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      dma.a(eja.field_o);
                      if (param4[0] != null) {
                        dma.g(param5, param3, var16, var18);
                        param4[0].a(param5, param3);
                        dma.b(eja.field_o);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param4[2] == null) {
                        break L9;
                      } else {
                        dma.g(var17, param3, var10, var18);
                        param4[2].a(var13, param3);
                        dma.b(eja.field_o);
                        break L9;
                      }
                    }
                    L10: {
                      if (null == param4[6]) {
                        break L10;
                      } else {
                        dma.g(param5, var19, var16, var11);
                        param4[6].a(param5, var15);
                        dma.b(eja.field_o);
                        break L10;
                      }
                    }
                    L11: {
                      if (null != param4[8]) {
                        dma.g(var17, var19, var10, var11);
                        param4[8].a(var13, var15);
                        dma.b(eja.field_o);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param4[1] == null) {
                        break L12;
                      } else {
                        if (0 == param4[1].field_m) {
                          break L12;
                        } else {
                          dma.g(var16, param3, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              dma.b(eja.field_o);
                              break L12;
                            } else {
                              param4[1].a(var20, param3);
                              var20 = var20 + param4[1].field_m;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (null == param4[7]) {
                        break L14;
                      } else {
                        if (param4[7].field_m != 0) {
                          dma.g(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var13 <= var20) {
                              dma.b(eja.field_o);
                              break L14;
                            } else {
                              param4[7].a(var20, var15);
                              var20 = var20 + param4[7].field_m;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (param4[3] == null) {
                        break L16;
                      } else {
                        if (0 != param4[3].field_n) {
                          dma.g(param5, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var15 <= var20) {
                              dma.b(eja.field_o);
                              break L16;
                            } else {
                              param4[3].a(param5, var20);
                              var20 = var20 + param4[3].field_n;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (null == param4[5]) {
                        break L18;
                      } else {
                        if (-1 == (param4[5].field_n ^ -1)) {
                          break L18;
                        } else {
                          dma.g(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var15 <= var20) {
                              dma.b(eja.field_o);
                              break L18;
                            } else {
                              param4[5].a(var13, var20);
                              var20 = var20 + param4[5].field_n;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      if (null == param4[4]) {
                        break L20;
                      } else {
                        if (0 == param4[4].field_m) {
                          break L20;
                        } else {
                          if (param4[4].field_n == 0) {
                            break L20;
                          } else {
                            dma.g(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var20 >= var15) {
                                dma.b(eja.field_o);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var13 <= var21) {
                                    var20 = var20 + param4[4].field_n;
                                    continue L21;
                                  } else {
                                    param4[4].a(var21, var20);
                                    var21 = var21 + param4[4].field_m;
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
            stackIn_74_0 = (RuntimeException) (var6);

            stackIn_74_1 = new StringBuilder().append("abb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L23;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L23;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param5 + ')');
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

    public static void a(int param0) {
        field_b = null;
        if (param0 != 4) {
            field_b = (String) null;
        }
    }

    abstract long a(byte param0);

    static {
        field_b = "Scrambler";
    }
}
