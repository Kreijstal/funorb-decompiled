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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 99 / ((-16 - param1) / 37);
              if ((param2[param0 >> -1495798459] & 1 << (31 & param0)) == 0) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hp.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
                throw pe.a((Throwable) ((Object) runtimeException), "hp.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
        String var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var3 = (String) null;
                hp.a((java.applet.Applet) null, (String) null, 0);
                break L1;
              }
            }
            stackIn_3_0 = mc.a(false, param0, param1 ^ 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("hp.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, byte param2, int param3, kv[] param4, int param5) {
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
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
        int var23 = 0;
        var23 = BachelorFridge.field_y;
        try {
          L0: {
            if (param4 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (0 >= param0) {
                  break L1;
                } else {
                  if (-1 <= (param3 ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (param4[3] == null) {
                        stackIn_11_0 = 0;
                        break L2;
                      } else {
                        stackIn_11_0 = param4[3].field_n;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_11_0;
                      if (param4[5] == null) {
                        stackIn_14_0 = 0;
                        break L3;
                      } else {
                        stackIn_14_0 = param4[5].field_n;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_14_0;
                      if (null != param4[1]) {
                        stackIn_17_0 = param4[1].field_o;
                        break L4;
                      } else {
                        stackIn_17_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_17_0;
                      var10 = 6 / ((52 - param2) / 42);
                      if (null != param4[7]) {
                        stackIn_20_0 = param4[7].field_o;
                        break L5;
                      } else {
                        stackIn_20_0 = 0;
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
                        if (-1 == (param4[1].field_n ^ -1)) {
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
                      L21: {
                        if (null == param4[4]) {
                          break L21;
                        } else {
                          if (param4[4].field_n == 0) {
                            break L21;
                          } else {
                            if (0 != param4[4].field_o) {
                              dg.c(var17, var19, var18, var20);
                              var21 = var15;
                              L22: while (true) {
                                if (var16 <= var21) {
                                  dg.b(qb.field_m);
                                  break L21;
                                } else {
                                  var22 = var13;
                                  L23: while (true) {
                                    if (var14 <= var22) {
                                      var21 = var21 + param4[4].field_o;
                                      continue L22;
                                    } else {
                                      param4[4].e(var22, var21);
                                      var22 = var22 + param4[4].field_n;
                                      continue L23;
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
                      break L20;
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
          L24: {
            var6 = decompiledCaughtException;
            stackIn_75_0 = (RuntimeException) (var6);

            stackIn_75_1 = new StringBuilder().append("hp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L24;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L24;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param5 + ')');
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

    static {
        field_a = true;
    }
}
