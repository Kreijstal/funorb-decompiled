/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String field_a;
    static db field_c;
    static int[] field_b;
    static String field_e;
    static String field_d;

    final static boolean c() {
        return null != hd.field_u ? true : ac.field_e;
    }

    final static void b() {
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
        var2[4] = ce.a(param1, 64, oj.a(-5300, -5300));
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
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
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
                      var13 = -var7 + var10;
                      var14 = var8 + param5;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 >= var16) {
                        break L6;
                      } else {
                        var17 = param3 - -(param0 * var6_int / (var6_int - -var7));
                        var16 = param3 - -(param0 * var6_int / (var6_int - -var7));
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      ra.a(pg.field_i);
                      if (var18 > var19) {
                        var19 = param5 - -(var8 * param4 / (var9 + var8));
                        var18 = param5 - -(var8 * param4 / (var9 + var8));
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (param2[0] == null) {
                        break L8;
                      } else {
                        ra.b(param3, param5, var16, var18);
                        param2[0].c(param3, param5);
                        ra.b(pg.field_i);
                        break L8;
                      }
                    }
                    L9: {
                      if (param2[2] == null) {
                        break L9;
                      } else {
                        ra.b(var17, param5, var10, var18);
                        param2[2].c(var13, param5);
                        ra.b(pg.field_i);
                        break L9;
                      }
                    }
                    L10: {
                      if (null != param2[6]) {
                        ra.b(param3, var19, var16, var11);
                        param2[6].c(param3, var15);
                        ra.b(pg.field_i);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param2[8] != null) {
                        ra.b(var17, var19, var10, var11);
                        param2[8].c(var13, var15);
                        ra.b(pg.field_i);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param2[1]) {
                        break L12;
                      } else {
                        if (0 != param2[1].field_t) {
                          ra.b(var16, param5, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              ra.b(pg.field_i);
                              break L12;
                            } else {
                              param2[1].c(var20, param5);
                              var20 = var20 + param2[1].field_t;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (null == param2[7]) {
                        break L14;
                      } else {
                        if (param2[7].field_t != 0) {
                          ra.b(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              ra.b(pg.field_i);
                              break L14;
                            } else {
                              param2[7].c(var20, var15);
                              var20 = var20 + param2[7].field_t;
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
                        if (param2[3].field_F == 0) {
                          break L16;
                        } else {
                          ra.b(param3, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var15 <= var20) {
                              ra.b(pg.field_i);
                              break L16;
                            } else {
                              param2[3].c(param3, var20);
                              var20 = var20 + param2[3].field_F;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (param2[5] == null) {
                        break L18;
                      } else {
                        if (param2[5].field_F == 0) {
                          break L18;
                        } else {
                          ra.b(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var15 <= var20) {
                              ra.b(pg.field_i);
                              break L18;
                            } else {
                              param2[5].c(var13, var20);
                              var20 = var20 + param2[5].field_F;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      if (param2[4] == null) {
                        break L20;
                      } else {
                        if (0 == param2[4].field_t) {
                          break L20;
                        } else {
                          if (param2[4].field_F == 0) {
                            break L20;
                          } else {
                            ra.b(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                ra.b(pg.field_i);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param2[4].field_F;
                                    continue L21;
                                  } else {
                                    param2[4].c(var21, var20);
                                    var21 = var21 + param2[4].field_t;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("qj.C(").append(param0).append(',').append(-36).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L23;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L23;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a() {
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
