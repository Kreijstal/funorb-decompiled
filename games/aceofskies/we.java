/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static of field_a;
    static int field_c;
    static String field_b;

    final static void a(int param0) {
        rh var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
                var1 = (rh) ((Object) di.field_M.d(268435455));
                L2: while (true) {
                  if (var1 == null) {
                    if (null != ao.field_c) {
                      var1 = (rh) ((Object) ao.field_c.d(268435455));
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
                          var1 = (rh) ((Object) ao.field_c.b((byte) 103));
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
                    var1 = (rh) ((Object) di.field_M.b((byte) 103));
                    continue L2;
                  }
                }
              }
            }
            L6: {
              if (param0 == 200) {
                break L6;
              } else {
                field_c = -8;
                break L6;
              }
            }
            L7: {
              if (null == mg.field_d) {
                break L7;
              } else {
                if (!mg.field_d.f(32119)) {
                  dt.field_c = null;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "we.C(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_c = -22;
        }
        field_b = null;
        field_a = null;
    }

    final static w a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        w stackIn_11_0 = null;
        w stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                if (param1 < -108) {
                  stackIn_13_0 = td.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_11_0 = (w) null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4 = param0.charAt(var3);
                if ((var4 ^ -1) <= -49) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("we.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (w) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, ll[] param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
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
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param5 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-1 <= (param1 ^ -1)) {
                  break L1;
                } else {
                  if (-1 > (param0 ^ -1)) {
                    L2: {
                      if (param5[3] != null) {
                        stackIn_10_0 = param5[3].field_v;
                        break L2;
                      } else {
                        stackIn_10_0 = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param5[5]) {
                        stackIn_13_0 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = param5[5].field_v;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (param5[1] != null) {
                        stackIn_16_0 = param5[1].field_q;
                        break L4;
                      } else {
                        stackIn_16_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (null != param5[7]) {
                        stackIn_19_0 = param5[7].field_q;
                        break L5;
                      } else {
                        stackIn_19_0 = 0;
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
                      if (var16 <= var17) {
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
                      if (var18 <= var19) {
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
                            if (var20 >= var13) {
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
                        if (-1 != (param5[3].field_q ^ -1)) {
                          vp.a(param2, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var20 >= var15) {
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
                        if (-1 != (param5[5].field_q ^ -1)) {
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
                        if (-1 == (param5[4].field_v ^ -1)) {
                          break L20;
                        } else {
                          if (-1 == (param5[4].field_q ^ -1)) {
                            break L20;
                          } else {
                            vp.a(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var20 >= var15) {
                                vp.a(jo.field_j);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var21 >= var13) {
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
                        field_a = (of) null;
                        break L23;
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
            stackIn_76_0 = (RuntimeException) (var6);

            stackIn_76_1 = new StringBuilder().append("we.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L24;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L24;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ')');
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
        field_a = new of();
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = -1;
    }
}
