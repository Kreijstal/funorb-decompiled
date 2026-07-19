/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ig extends rk {
    int field_p;
    static cd field_q;

    abstract Object e(int param0);

    final static void a(o[] param0, int param1, byte param2, int param3, int param4, int param5) {
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
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var22 = wizardrun.field_H;
        try {
          L0: {
            if (param0 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if ((param4 ^ -1) >= -1) {
                  break L1;
                } else {
                  if ((param3 ^ -1) < -1) {
                    L2: {
                      if (null == param0[3]) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param0[3].field_x;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (param0[5] != null) {
                        stackOut_12_0 = param0[5].field_x;
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
                        stackOut_15_0 = param0[1].field_s;
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
                      if (null == param0[7]) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = param0[7].field_s;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param1 - -param4;
                      var11 = param5 + param3;
                      var12 = var6_int + param1;
                      var13 = -var7 + var10;
                      var14 = param5 - -var8;
                      if (param2 == -110) {
                        break L6;
                      } else {
                        ig.a((byte) -10);
                        break L6;
                      }
                    }
                    L7: {
                      var15 = var11 + -var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 < var16) {
                        var17 = var6_int * param4 / (var6_int + var7) + param1;
                        var16 = var6_int * param4 / (var6_int + var7) + param1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var18 = var14;
                      var19 = var15;
                      ed.b(td.field_a);
                      if (var18 <= var19) {
                        break L8;
                      } else {
                        var19 = param3 * var8 / (var9 + var8) + param5;
                        var18 = param3 * var8 / (var9 + var8) + param5;
                        break L8;
                      }
                    }
                    L9: {
                      if (null == param0[0]) {
                        break L9;
                      } else {
                        ed.b(param1, param5, var16, var18);
                        param0[0].e(param1, param5);
                        ed.a(td.field_a);
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[2] == null) {
                        break L10;
                      } else {
                        ed.b(var17, param5, var10, var18);
                        param0[2].e(var13, param5);
                        ed.a(td.field_a);
                        break L10;
                      }
                    }
                    L11: {
                      if (param0[6] != null) {
                        ed.b(param1, var19, var16, var11);
                        param0[6].e(param1, var15);
                        ed.a(td.field_a);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param0[8] != null) {
                        ed.b(var17, var19, var10, var11);
                        param0[8].e(var13, var15);
                        ed.a(td.field_a);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (param0[1] == null) {
                        break L13;
                      } else {
                        if (param0[1].field_x != 0) {
                          ed.b(var16, param5, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var20 >= var13) {
                              ed.a(td.field_a);
                              break L13;
                            } else {
                              param0[1].e(var20, param5);
                              var20 = var20 + param0[1].field_x;
                              continue L14;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (param0[7] == null) {
                        break L15;
                      } else {
                        if (param0[7].field_x == 0) {
                          break L15;
                        } else {
                          ed.b(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var13 <= var20) {
                              ed.a(td.field_a);
                              break L15;
                            } else {
                              param0[7].e(var20, var15);
                              var20 = var20 + param0[7].field_x;
                              continue L16;
                            }
                          }
                        }
                      }
                    }
                    L17: {
                      if (param0[3] == null) {
                        break L17;
                      } else {
                        if (0 == param0[3].field_s) {
                          break L17;
                        } else {
                          ed.b(param1, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var20 >= var15) {
                              ed.a(td.field_a);
                              break L17;
                            } else {
                              param0[3].e(param1, var20);
                              var20 = var20 + param0[3].field_s;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (null == param0[5]) {
                        break L19;
                      } else {
                        if (-1 != (param0[5].field_s ^ -1)) {
                          ed.b(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var20 >= var15) {
                              ed.a(td.field_a);
                              break L19;
                            } else {
                              param0[5].e(var13, var20);
                              var20 = var20 + param0[5].field_s;
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
                        if (0 == param0[4].field_x) {
                          break L21;
                        } else {
                          if (0 == param0[4].field_s) {
                            break L21;
                          } else {
                            ed.b(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                ed.a(td.field_a);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param0[4].field_s;
                                    continue L22;
                                  } else {
                                    param0[4].e(var21, var20);
                                    var21 = var21 + param0[4].field_x;
                                    continue L23;
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
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) (var6);
            stackOut_73_1 = new StringBuilder().append("ig.B(");
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param0 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L24;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L24;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    public static void a(byte param0) {
        field_q = null;
        if (param0 >= -82) {
            field_q = (cd) null;
        }
    }

    abstract boolean d(int param0);

    ig(int param0) {
        this.field_p = param0;
    }

    static {
    }
}
