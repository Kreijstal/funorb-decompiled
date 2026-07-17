/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String field_a;
    static db field_c;
    static int[] field_b;
    static String field_e;
    static String field_d;

    final static boolean c(int param0) {
        return null != hd.field_u ? true : ac.field_e;
    }

    final static void b(byte param0) {
        try {
            if (null != sk.field_f) {
                try {
                    sk.field_f.a(0L, 0);
                    sk.field_f.a(-19735, kb.field_q.field_u, kb.field_q.field_t, 24);
                } catch (Exception exception) {
                }
            }
            kb.field_q.field_t = kb.field_q.field_t + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0) {
        return cm.field_n || ug.o(-69);
    }

    final static oh[] a(int param0, int param1) {
        oh[] var2 = new oh[9];
        var2[4] = ce.a(param1, 64, oj.a(param0, param0));
        return var2;
    }

    final static hl b(int param0) {
        if (param0 != 0) {
            hl discarded$0 = qj.b(-109);
        }
        return ph.field_t.field_Pb;
    }

    final static void a(int param0, byte param1, oh[] param2, int param3, int param4, int param5) {
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
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var22 = TetraLink.field_J;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (0 >= param0) {
                  break L1;
                } else {
                  if (param4 > 0) {
                    L2: {
                      if (null != param2[3]) {
                        stackOut_8_0 = param2[3].field_t;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (null == param2[5]) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = param2[5].field_t;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (null != param2[1]) {
                        stackOut_14_0 = param2[1].field_F;
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
                      if (param2[7] != null) {
                        stackOut_17_0 = param2[7].field_F;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param0 + param3;
                      var11 = param4 + param5;
                      var12 = param3 - -var6_int;
                      if (param1 == -36) {
                        break L6;
                      } else {
                        field_d = null;
                        break L6;
                      }
                    }
                    L7: {
                      var13 = -var7 + var10;
                      var14 = var8 + param5;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 >= var16) {
                        break L7;
                      } else {
                        var17 = param3 - -(param0 * var6_int / (var6_int - -var7));
                        var16 = param3 - -(param0 * var6_int / (var6_int - -var7));
                        break L7;
                      }
                    }
                    L8: {
                      var18 = var14;
                      var19 = var15;
                      ra.a(pg.field_i);
                      if (var18 > var19) {
                        var19 = param5 - -(var8 * param4 / (var9 + var8));
                        var18 = param5 - -(var8 * param4 / (var9 + var8));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param2[0] == null) {
                        break L9;
                      } else {
                        ra.b(param3, param5, var16, var18);
                        param2[0].c(param3, param5);
                        ra.b(pg.field_i);
                        break L9;
                      }
                    }
                    L10: {
                      if (param2[2] == null) {
                        break L10;
                      } else {
                        ra.b(var17, param5, var10, var18);
                        param2[2].c(var13, param5);
                        ra.b(pg.field_i);
                        break L10;
                      }
                    }
                    L11: {
                      if (null != param2[6]) {
                        ra.b(param3, var19, var16, var11);
                        param2[6].c(param3, var15);
                        ra.b(pg.field_i);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param2[8] != null) {
                        ra.b(var17, var19, var10, var11);
                        param2[8].c(var13, var15);
                        ra.b(pg.field_i);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (null == param2[1]) {
                        break L13;
                      } else {
                        if (0 != param2[1].field_t) {
                          ra.b(var16, param5, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var20 >= var13) {
                              ra.b(pg.field_i);
                              break L13;
                            } else {
                              param2[1].c(var20, param5);
                              var20 = var20 + param2[1].field_t;
                              continue L14;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (null == param2[7]) {
                        break L15;
                      } else {
                        if (param2[7].field_t != 0) {
                          ra.b(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var20 >= var13) {
                              ra.b(pg.field_i);
                              break L15;
                            } else {
                              param2[7].c(var20, var15);
                              var20 = var20 + param2[7].field_t;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      if (param2[3] == null) {
                        break L17;
                      } else {
                        if (param2[3].field_F == 0) {
                          break L17;
                        } else {
                          ra.b(param3, var18, var16, var19);
                          var20 = var14;
                          L18: while (true) {
                            if (var15 <= var20) {
                              ra.b(pg.field_i);
                              break L17;
                            } else {
                              param2[3].c(param3, var20);
                              var20 = var20 + param2[3].field_F;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (param2[5] == null) {
                        break L19;
                      } else {
                        if (param2[5].field_F == 0) {
                          break L19;
                        } else {
                          ra.b(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var15 <= var20) {
                              ra.b(pg.field_i);
                              break L19;
                            } else {
                              param2[5].c(var13, var20);
                              var20 = var20 + param2[5].field_F;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                    L21: {
                      if (param2[4] == null) {
                        break L21;
                      } else {
                        if (0 == param2[4].field_t) {
                          break L21;
                        } else {
                          if (param2[4].field_F == 0) {
                            break L21;
                          } else {
                            ra.b(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                ra.b(pg.field_i);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param2[4].field_F;
                                    continue L22;
                                  } else {
                                    param2[4].c(var21, var20);
                                    var21 = var21 + param2[4].field_t;
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
            stackOut_72_0 = (RuntimeException) var6;
            stackOut_72_1 = new StringBuilder().append("qj.C(").append(param0).append(44).append(param1).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param2 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        int var1 = -67;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{2, 14, 15, 6, 5, 16, 17, 10, 11, 12};
        field_c = new db(1, 2, 2, 0);
        field_e = "Your turn - playing <%0> (<%1>)";
        field_d = "Enter name of friend to add to list";
    }
}
