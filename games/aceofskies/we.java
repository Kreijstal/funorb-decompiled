/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static of field_a;
    static int field_c;
    static String field_b;

    final static void a() {
        rh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              um.field_m.h();
              da.field_a.h();
              ad.field_U = ad.field_U - 1;
              if (0 != ad.field_U) {
                break L1;
              } else {
                ad.field_U = 200;
                var1 = (rh) (Object) di.field_M.d(268435455);
                L2: while (true) {
                  if (var1 == null) {
                    if (null != ao.field_c) {
                      var1 = (rh) (Object) ao.field_c.d(268435455);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (var1.field_i.b((byte) 105)) {
                              break L4;
                            } else {
                              var1.c(-123);
                              break L4;
                            }
                          }
                          var1 = (rh) (Object) ao.field_c.b((byte) 103);
                          continue L3;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (var1.field_i.b((byte) 93)) {
                        break L5;
                      } else {
                        var1.c(-128);
                        break L5;
                      }
                    }
                    var1 = (rh) (Object) di.field_M.b((byte) 103);
                    continue L2;
                  }
                }
              }
            }
            L6: {
              if (null == mg.field_d) {
                break L6;
              } else {
                if (!mg.field_d.f(32119)) {
                  dt.field_c = null;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1_ref, "we.C(" + 200 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_c = -22;
        }
        field_b = null;
        field_a = null;
    }

    final static w a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        w stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_12_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackOut_12_0 = td.field_d;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (w) (Object) stackIn_7_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("we.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + -120 + ')');
        }
        return stackIn_13_0;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, ll[] param5) {
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
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param5 == null) {
              return;
            } else {
              L1: {
                if (param1 <= 0) {
                  break L1;
                } else {
                  if (param0 > 0) {
                    L2: {
                      if (param5[3] != null) {
                        stackOut_9_0 = param5[3].field_v;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param5[5]) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param5[5].field_v;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (param5[1] != null) {
                        stackOut_15_0 = param5[1].field_q;
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
                      if (null != param5[7]) {
                        stackOut_18_0 = param5[7].field_q;
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
                      var10 = param2 - -param1;
                      var11 = param0 + param4;
                      var12 = var6_int + param2;
                      var13 = var10 + -var7;
                      var14 = param4 - -var8;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (~var16 >= ~var17) {
                        break L6;
                      } else {
                        var17 = param1 * var6_int / (var6_int - -var7) + param2;
                        var16 = param1 * var6_int / (var6_int - -var7) + param2;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      vp.b(jo.field_j);
                      if (~var18 >= ~var19) {
                        break L7;
                      } else {
                        var19 = var8 * param0 / (var9 + var8) + param4;
                        var18 = var8 * param0 / (var9 + var8) + param4;
                        break L7;
                      }
                    }
                    L8: {
                      if (param5[0] != null) {
                        vp.a(param2, param4, var16, var18);
                        param5[0].b(param2, param4);
                        vp.a(jo.field_j);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param5[2] != null) {
                        vp.a(var17, param4, var10, var18);
                        param5[2].b(var13, param4);
                        vp.a(jo.field_j);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param5[6] != null) {
                        vp.a(param2, var19, var16, var11);
                        param5[6].b(param2, var15);
                        vp.a(jo.field_j);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param5[8] == null) {
                        break L11;
                      } else {
                        vp.a(var17, var19, var10, var11);
                        param5[8].b(var13, var15);
                        vp.a(jo.field_j);
                        break L11;
                      }
                    }
                    L12: {
                      if (param5[1] == null) {
                        break L12;
                      } else {
                        if (0 == param5[1].field_v) {
                          break L12;
                        } else {
                          vp.a(var16, param4, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              vp.a(jo.field_j);
                              break L12;
                            } else {
                              param5[1].b(var20, param4);
                              var20 = var20 + param5[1].field_v;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (param5[7] == null) {
                        break L14;
                      } else {
                        if (param5[7].field_v != 0) {
                          vp.a(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (~var20 <= ~var13) {
                              vp.a(jo.field_j);
                              break L14;
                            } else {
                              param5[7].b(var20, var15);
                              var20 = var20 + param5[7].field_v;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (null == param5[3]) {
                        break L16;
                      } else {
                        if (param5[3].field_q != 0) {
                          vp.a(param2, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (~var20 <= ~var15) {
                              vp.a(jo.field_j);
                              break L16;
                            } else {
                              param5[3].b(param2, var20);
                              var20 = var20 + param5[3].field_q;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (null == param5[5]) {
                        break L18;
                      } else {
                        if (param5[5].field_q != 0) {
                          vp.a(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var20 >= var15) {
                              vp.a(jo.field_j);
                              break L18;
                            } else {
                              param5[5].b(var13, var20);
                              var20 = var20 + param5[5].field_q;
                              continue L19;
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (param5[4] == null) {
                        break L20;
                      } else {
                        if (param5[4].field_v == 0) {
                          break L20;
                        } else {
                          if (param5[4].field_q == 0) {
                            break L20;
                          } else {
                            vp.a(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (~var20 <= ~var15) {
                                vp.a(jo.field_j);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (~var21 <= ~var13) {
                                    var20 = var20 + param5[4].field_q;
                                    continue L21;
                                  } else {
                                    param5[4].b(var21, var20);
                                    var21 = var21 + param5[4].field_v;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L23: {
                      if (!param3) {
                        break L23;
                      } else {
                        field_a = null;
                        break L23;
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var6;
            stackOut_74_1 = new StringBuilder().append("we.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param5 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L24;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L24;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new of();
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = -1;
    }
}
