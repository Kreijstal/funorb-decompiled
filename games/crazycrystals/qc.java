/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends oh {
    static si field_i;
    static String[] field_g;
    static String field_h;
    static dl[] field_f;

    final static void a(boolean param0, int param1) {
        if (ph.field_E == null) {
            dq.a(-32056, param0);
        } else {
            q.a(false);
        }
        Object var3 = null;
        qc.a(9, -14, -108, (dl[]) null, -100, -14, -83);
    }

    public static void c(byte param0) {
        field_h = null;
        field_i = null;
        field_g = null;
        field_f = null;
    }

    qc() {
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var2_int = param0.charAt(0);
              if (param1 < -78) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            var3 = 1;
            L2: while (true) {
              if (var3 >= param0.length()) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (param0.charAt(var3) != var2_int) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("qc.R(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final int a(int param0, int param1) {
        if (param0 != 1843275042) {
            field_g = null;
        }
        return q.field_a[ma.field_n[param1]].field_g;
    }

    int a(byte param0, boolean param1) {
        if (param0 > -53) {
            field_i = null;
        }
        return param1 ? 16 : 2;
    }

    final static void a(int param0, int param1, int param2, dl[] param3, int param4, int param5, int param6) {
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
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var23 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param3 != null) {
              L1: {
                if (0 >= param5) {
                  break L1;
                } else {
                  if (param2 <= 0) {
                    break L1;
                  } else {
                    if (param0 == 0) {
                      break L1;
                    } else {
                      L2: {
                        if (param3[3] != null) {
                          stackOut_10_0 = param3[3].field_n;
                          stackIn_11_0 = stackOut_10_0;
                          break L2;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_11_0 = stackOut_9_0;
                          break L2;
                        }
                      }
                      L3: {
                        var7_int = stackIn_11_0;
                        if (param3[5] == null) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          break L3;
                        } else {
                          stackOut_12_0 = param3[5].field_n;
                          stackIn_14_0 = stackOut_12_0;
                          break L3;
                        }
                      }
                      L4: {
                        var8 = stackIn_14_0;
                        if (null == param3[1]) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L4;
                        } else {
                          stackOut_15_0 = param3[1].field_o;
                          stackIn_17_0 = stackOut_15_0;
                          break L4;
                        }
                      }
                      L5: {
                        var9 = stackIn_17_0;
                        if (null == param3[7]) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        } else {
                          stackOut_18_0 = param3[7].field_o;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      L6: {
                        var10 = stackIn_20_0;
                        var11 = param4 + param5;
                        var12 = param1 - -param2;
                        var13 = param4 - -var7_int;
                        var14 = -var8 + var11;
                        var15 = var9 + param1;
                        var16 = var12 - var10;
                        var17 = var13;
                        var18 = var14;
                        if (var18 < var17) {
                          var18 = param4 - -(var7_int * param5 / (var8 + var7_int));
                          var17 = param4 - -(var7_int * param5 / (var8 + var7_int));
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var19 = var15;
                        var20 = var16;
                        kh.b(ec.field_i);
                        if (var20 < var19) {
                          var20 = param1 + var9 * param2 / (var9 + var10);
                          var19 = param1 + var9 * param2 / (var9 + var10);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (param3[0] != null) {
                          kh.a(param4, param1, var17, var19);
                          param3[0].f(param4, param1, param0);
                          kh.a(ec.field_i);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (null == param3[param6]) {
                          break L9;
                        } else {
                          kh.a(var18, param1, var11, var19);
                          param3[2].f(var14, param1, param0);
                          kh.a(ec.field_i);
                          break L9;
                        }
                      }
                      L10: {
                        if (param3[6] != null) {
                          kh.a(param4, var20, var17, var12);
                          param3[6].f(param4, var16, param0);
                          kh.a(ec.field_i);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (null != param3[8]) {
                          kh.a(var18, var20, var11, var12);
                          param3[8].f(var14, var16, param0);
                          kh.a(ec.field_i);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (null == param3[1]) {
                          break L12;
                        } else {
                          if (param3[1].field_n != 0) {
                            kh.a(var17, param1, var18, var19);
                            var21 = var13;
                            L13: while (true) {
                              if (var14 <= var21) {
                                kh.a(ec.field_i);
                                break L12;
                              } else {
                                param3[1].f(var21, param1, param0);
                                var21 = var21 + param3[1].field_n;
                                continue L13;
                              }
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (param3[7] == null) {
                          break L14;
                        } else {
                          if (param3[7].field_n != 0) {
                            kh.a(var17, var20, var18, var12);
                            var21 = var13;
                            L15: while (true) {
                              if (var14 <= var21) {
                                kh.a(ec.field_i);
                                break L14;
                              } else {
                                param3[7].f(var21, var16, param0);
                                var21 = var21 + param3[7].field_n;
                                continue L15;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      L16: {
                        if (null == param3[3]) {
                          break L16;
                        } else {
                          if (0 != param3[3].field_o) {
                            kh.a(param4, var19, var17, var20);
                            var21 = var15;
                            L17: while (true) {
                              if (var16 <= var21) {
                                kh.a(ec.field_i);
                                break L16;
                              } else {
                                param3[3].f(param4, var21, param0);
                                var21 = var21 + param3[3].field_o;
                                continue L17;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        if (param3[5] == null) {
                          break L18;
                        } else {
                          if (param3[5].field_o != 0) {
                            kh.a(var18, var19, var11, var20);
                            var21 = var15;
                            L19: while (true) {
                              if (var21 >= var16) {
                                kh.a(ec.field_i);
                                break L18;
                              } else {
                                param3[5].f(var14, var21, param0);
                                var21 = var21 + param3[5].field_o;
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
                          if (0 == param3[4].field_n) {
                            break L20;
                          } else {
                            if (param3[4].field_o == 0) {
                              break L20;
                            } else {
                              kh.a(var17, var19, var18, var20);
                              var21 = var15;
                              L21: while (true) {
                                if (var21 >= var16) {
                                  kh.a(ec.field_i);
                                  break L20;
                                } else {
                                  var22 = var13;
                                  L22: while (true) {
                                    if (var22 >= var14) {
                                      var21 = var21 + param3[4].field_o;
                                      continue L21;
                                    } else {
                                      param3[4].f(var22, var21, param0);
                                      var22 = var22 + param3[4].field_n;
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
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var7;
            stackOut_76_1 = new StringBuilder().append("qc.J(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L23;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L23;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_h = "Accept";
        field_f = new dl[4];
    }
}
