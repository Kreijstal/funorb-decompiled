/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    static hga field_d;
    static boolean field_a;
    static kv[] field_b;
    static int field_c;

    final static boolean a(int param0, byte param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 99 / ((-16 - param1) / 37);
              if ((param2[param0 >> 5] & 1 << (31 & param0)) == 0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("hp.E(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
                nb.field_q = param1;
                try {
                    if (param2 != 3) {
                        hp.a(106);
                    }
                    var6 = param0.getParameter("cookieprefix");
                    var5 = var6;
                    var5 = var6;
                    var4 = param0.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                    var5 = var7;
                    var5 = var7;
                    if (param1.length() == 0) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var7 + "; Expires=" + km.a(f.b((byte) 73) - -94608000000L, -1) + "; Max-Age=" + 94608000L;
                    }
                    ac.a("document.cookie=\"" + var5 + "\"", param0, 119);
                } catch (Throwable throwable) {
                }
                eha.a(-123, param0);
            } catch (RuntimeException runtimeException) {
                throw pe.a((Throwable) (Object) runtimeException, "hp.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        int var1 = 31 % ((-6 - param0) / 38);
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = mc.a(false, param0, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("hp.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, byte param2, int param3, kv[] param4, int param5) {
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
        var23 = BachelorFridge.field_y;
        try {
          L0: {
            if (param4 == null) {
              return;
            } else {
              L1: {
                if (0 >= param0) {
                  break L1;
                } else {
                  if (param3 <= 0) {
                    break L1;
                  } else {
                    L2: {
                      if (param4[3] == null) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L2;
                      } else {
                        stackOut_9_0 = param4[3].field_n;
                        stackIn_11_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (param4[5] == null) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = param4[5].field_n;
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (null != param4[1]) {
                        stackOut_16_0 = param4[1].field_o;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      var10 = 6 / ((52 - param2) / 42);
                      if (null != param4[7]) {
                        stackOut_19_0 = param4[7].field_o;
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
                      var11 = param1 - -param0;
                      var12 = param3 + param5;
                      var13 = param1 - -var6_int;
                      var14 = -var7 + var11;
                      var15 = param5 - -var8;
                      var16 = -var9 + var12;
                      var17 = var13;
                      var18 = var14;
                      if (var18 >= var17) {
                        break L6;
                      } else {
                        var18 = var6_int * param0 / (var7 + var6_int) + param1;
                        var17 = var6_int * param0 / (var7 + var6_int) + param1;
                        break L6;
                      }
                    }
                    L7: {
                      var19 = var15;
                      var20 = var16;
                      if (var20 >= var19) {
                        break L7;
                      } else {
                        var20 = param5 + var8 * param3 / (var9 + var8);
                        var19 = param5 + var8 * param3 / (var9 + var8);
                        break L7;
                      }
                    }
                    L8: {
                      dg.a(qb.field_m);
                      if (param4[0] != null) {
                        dg.c(param1, param5, var17, var19);
                        param4[0].e(param1, param5);
                        dg.b(qb.field_m);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null != param4[2]) {
                        dg.c(var18, param5, var11, var19);
                        param4[2].e(var14, param5);
                        dg.b(qb.field_m);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param4[6] != null) {
                        dg.c(param1, var20, var17, var12);
                        param4[6].e(param1, var16);
                        dg.b(qb.field_m);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param4[8] == null) {
                        break L11;
                      } else {
                        dg.c(var18, var20, var11, var12);
                        param4[8].e(var14, var16);
                        dg.b(qb.field_m);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param4[1]) {
                        break L12;
                      } else {
                        if (param4[1].field_n == 0) {
                          break L12;
                        } else {
                          dg.c(var17, param5, var18, var19);
                          var21 = var13;
                          L13: while (true) {
                            if (var21 >= var14) {
                              dg.b(qb.field_m);
                              break L12;
                            } else {
                              param4[1].e(var21, param5);
                              var21 = var21 + param4[1].field_n;
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
                        if (param4[7].field_n == 0) {
                          break L14;
                        } else {
                          dg.c(var17, var20, var18, var12);
                          var21 = var13;
                          L15: while (true) {
                            if (var21 >= var14) {
                              dg.b(qb.field_m);
                              break L14;
                            } else {
                              param4[7].e(var21, var16);
                              var21 = var21 + param4[7].field_n;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (param4[3] == null) {
                        break L16;
                      } else {
                        if (0 != param4[3].field_o) {
                          dg.c(param1, var19, var17, var20);
                          var21 = var15;
                          L17: while (true) {
                            if (var21 >= var16) {
                              dg.b(qb.field_m);
                              break L16;
                            } else {
                              param4[3].e(param1, var21);
                              var21 = var21 + param4[3].field_o;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (param4[5] == null) {
                        break L18;
                      } else {
                        if (0 != param4[5].field_o) {
                          dg.c(var18, var19, var11, var20);
                          var21 = var15;
                          L19: while (true) {
                            if (var16 <= var21) {
                              dg.b(qb.field_m);
                              break L18;
                            } else {
                              param4[5].e(var14, var21);
                              var21 = var21 + param4[5].field_o;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (null == param4[4]) {
                        break L20;
                      } else {
                        if (param4[4].field_n == 0) {
                          break L20;
                        } else {
                          if (0 != param4[4].field_o) {
                            dg.c(var17, var19, var18, var20);
                            var21 = var15;
                            L21: while (true) {
                              if (var16 <= var21) {
                                dg.b(qb.field_m);
                                break L20;
                              } else {
                                var22 = var13;
                                L22: while (true) {
                                  if (var14 <= var22) {
                                    var21 = var21 + param4[4].field_o;
                                    continue L21;
                                  } else {
                                    param4[4].e(var22, var21);
                                    var22 = var22 + param4[4].field_n;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          } else {
                            break L20;
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
            stackOut_73_0 = (RuntimeException) var6;
            stackOut_73_1 = new StringBuilder().append("hp.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param4 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
