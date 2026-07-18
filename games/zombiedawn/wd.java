/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends pj {
    byte[] field_A;
    static vn field_y;
    static String field_w;
    na field_x;
    static int[] field_z;
    int field_v;

    final byte[] d(int param0) {
        if (!(!((wd) this).field_q)) {
            throw new RuntimeException();
        }
        if (param0 != 0) {
            return null;
        }
        return ((wd) this).field_A;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, int[] param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var19 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param4 < 0) {
                break L1;
              } else {
                if (en.field_d <= param5) {
                  break L1;
                } else {
                  L2: {
                    if (param1 >= 0) {
                      break L2;
                    } else {
                      if (param2 >= 0) {
                        break L2;
                      } else {
                        if (param0 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (!param6) {
                      break L3;
                    } else {
                      wd.g(-39);
                      break L3;
                    }
                  }
                  L4: {
                    if (param1 < en.field_g) {
                      break L4;
                    } else {
                      if (~param2 > ~en.field_g) {
                        break L4;
                      } else {
                        if (param0 < en.field_g) {
                          break L4;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L5: {
                    var14 = param4 + -param5;
                    if (~param5 == ~param3) {
                      L6: {
                        if (param4 != param5) {
                          var15 = -param3 + param4;
                          if (~param2 >= ~param1) {
                            var10 = param1 << 16;
                            var12 = (param0 - param1 << 16) / var14;
                            var9_int = param2 << 16;
                            var11 = (param0 + -param2 << 16) / var15;
                            break L6;
                          } else {
                            var9_int = param1 << 16;
                            var12 = (-param2 + param0 << 16) / var15;
                            var11 = (param0 + -param1 << 16) / var14;
                            var10 = param2 << 16;
                            break L6;
                          }
                        } else {
                          var10 = param2 << 16;
                          var9_int = param1 << 16;
                          var12 = 0;
                          var11 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (0 <= param5) {
                          break L7;
                        } else {
                          param5 = Math.min(-param5, -param5 + param3);
                          var10 = var10 + param5 * var12;
                          var9_int = var9_int + param5 * var11;
                          param5 = 0;
                          break L7;
                        }
                      }
                      var13 = 0;
                      break L5;
                    } else {
                      L8: {
                        var10 = param1 << 16;
                        var9_int = param1 << 16;
                        var15 = -param5 + param3;
                        var12 = (-param1 + param0 << 16) / var14;
                        var11 = (-param1 + param2 << 16) / var15;
                        if (~var12 >= ~var11) {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L8;
                        } else {
                          var13 = 0;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if (param5 >= 0) {
                            break L10;
                          } else {
                            if (param3 >= 0) {
                              param5 = -param5;
                              var10 = var10 + var12 * param5;
                              var9_int = var9_int + var11 * param5;
                              param5 = 0;
                              break L10;
                            } else {
                              param5 = -param5 + param3;
                              var9_int = var9_int + var11 * param5;
                              var10 = var10 + param5 * var12;
                              param5 = param3;
                              break L9;
                            }
                          }
                        }
                        var16 = en.field_b[param5];
                        L11: while (true) {
                          if (~param5 <= ~param3) {
                            break L9;
                          } else {
                            L12: {
                              var17 = var9_int >> 16;
                              if (en.field_g <= var17) {
                                break L12;
                              } else {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (0 == var18) {
                                  if (var17 < 0) {
                                    break L12;
                                  } else {
                                    if (var17 >= en.field_g) {
                                      break L12;
                                    } else {
                                      eb.a(param8, 1393669633, var18, var17 + var16, param7);
                                      break L12;
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (var18 + var17 >= en.field_g) {
                                      var18 = -var17 + en.field_g - 1;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if (var17 < 0) {
                                    eb.a(param8, 1393669633, var18 + var17, var16, param7);
                                    break L12;
                                  } else {
                                    eb.a(param8, 1393669633, var18, var16 + var17, param7);
                                    break L12;
                                  }
                                }
                              }
                            }
                            param5++;
                            if (~en.field_d < ~param5) {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + bi.field_f;
                              continue L11;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = -param3 + param4;
                      if (var16 != 0) {
                        L14: {
                          if (var13 == 0) {
                            var9_int = param2 << 16;
                            break L14;
                          } else {
                            var10 = param2 << 16;
                            break L14;
                          }
                        }
                        var17 = param0 << 16;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (var17 - var10) / var16;
                        break L5;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L5;
                      }
                    }
                  }
                  L15: {
                    if (param5 < 0) {
                      param5 = -param5;
                      var9_int = var9_int + param5 * var11;
                      var10 = var10 + var12 * param5;
                      param5 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var15 = en.field_b[param5];
                  L16: while (true) {
                    if (~param4 >= ~param5) {
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 16;
                        if (~en.field_g < ~var16) {
                          var17 = (var10 >> 16) + -(var9_int >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L17;
                            } else {
                              if (var16 < en.field_g) {
                                eb.a(param8, 1393669633, var17, var15 + var16, param7);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (var16 + var17 < en.field_g) {
                                break L18;
                              } else {
                                var17 = -1 + -var16 + en.field_g;
                                break L18;
                              }
                            }
                            if (var16 < 0) {
                              eb.a(param8, 1393669633, var17 - -var16, var15, param7);
                              break L17;
                            } else {
                              eb.a(param8, 1393669633, var17, var15 + var16, param7);
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param5++;
                      if (param5 < en.field_d) {
                        var9_int = var9_int + var11;
                        var15 = var15 + bi.field_f;
                        var10 = var10 + var12;
                        continue L16;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var9;
            stackOut_76_1 = new StringBuilder().append("wd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param8 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L19;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L19;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + ')');
        }
    }

    final static void b(int param0, int param1) {
        int discarded$0 = qo.b((byte) -122);
        int var2 = 100 / ((-19 - param0) / 35);
    }

    final int e(int param0) {
        if (!(!((wd) this).field_q)) {
            return 0;
        }
        if (param0 != -31478) {
            return -121;
        }
        return 100;
    }

    public static void g(int param0) {
        field_w = null;
        field_y = null;
        if (param0 != 1445852592) {
            Object var2 = null;
            wd.a(-38, 92, -57, -122, -91, 120, true, -19, (int[]) null);
        }
        field_z = null;
    }

    wd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var4 = 0;
        field_w = "Members";
        field_z = new int[50];
        double var0 = 0.0;
        double var2 = 0.12566370614359174;
        for (var4 = 0; var4 < 50; var4++) {
            field_z[var4] = (int)(64.0 * Math.sin(var0)) + 192;
            var0 = var0 + var2;
        }
    }
}
