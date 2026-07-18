/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends jb {
    int field_h;
    static ko field_i;
    static boolean field_f;
    static String[] field_g;

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        hd.a(false);
        kh.a(param0, param4, param2, param1);
        if (param3 != 73) {
            qp.a(90, 81, -14, (byte) -52, 17);
        }
    }

    private qp() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 1095153680) {
            return;
        }
        field_g = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
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
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var19 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (0 > param3) {
                break L1;
              } else {
                if (param5 < nb.field_b) {
                  L2: {
                    if (param7 >= 0) {
                      break L2;
                    } else {
                      if (param1 >= 0) {
                        break L2;
                      } else {
                        if (0 <= param2) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param7 < nb.field_d) {
                      break L3;
                    } else {
                      if (nb.field_d > param1) {
                        break L3;
                      } else {
                        if (nb.field_d <= param2) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param3 + -param5;
                    if (param8 == param5) {
                      L5: {
                        if (param3 == param5) {
                          var11 = 0;
                          var9_int = param7 << 16;
                          var10 = param1 << 16;
                          var12 = 0;
                          break L5;
                        } else {
                          var15 = -param8 + param3;
                          if (param1 <= param7) {
                            var12 = (-param7 + param2 << 16) / var14;
                            var11 = (-param1 + param2 << 16) / var15;
                            var9_int = param1 << 16;
                            var10 = param7 << 16;
                            break L5;
                          } else {
                            var9_int = param7 << 16;
                            var12 = (-param1 + param2 << 16) / var15;
                            var11 = (param2 + -param7 << 16) / var14;
                            var10 = param1 << 16;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (param5 >= 0) {
                          break L6;
                        } else {
                          param5 = Math.min(-param5, -param5 + param8);
                          var10 = var10 + param5 * var12;
                          var9_int = var9_int + var11 * param5;
                          param5 = 0;
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param7 << 16;
                        var9_int = param7 << 16;
                        var15 = param8 + -param5;
                        var12 = (-param7 + param2 << 16) / var14;
                        var11 = (-param7 + param1 << 16) / var15;
                        if (var12 > var11) {
                          var13 = 0;
                          break L7;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (0 > param5) {
                            if (param8 >= 0) {
                              param5 = -param5;
                              var10 = var10 + param5 * var12;
                              var9_int = var9_int + param5 * var11;
                              param5 = 0;
                              break L9;
                            } else {
                              param5 = param8 - param5;
                              var10 = var10 + param5 * var12;
                              var9_int = var9_int + var11 * param5;
                              param5 = param8;
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var16 = nb.field_a[param5];
                        L10: while (true) {
                          if (param5 >= param8) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 16;
                              if (nb.field_d <= var17) {
                                break L11;
                              } else {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (var18 == 0) {
                                  if (0 > var17) {
                                    break L11;
                                  } else {
                                    if (nb.field_d > var17) {
                                      ui.a(param4, var18, param6, -109, var16 + var17);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                } else {
                                  L12: {
                                    if (var18 + var17 >= nb.field_d) {
                                      var18 = -1 + nb.field_d - var17;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (0 <= var17) {
                                    ui.a(param4, var18, param6, -90, var17 - -var16);
                                    break L11;
                                  } else {
                                    ui.a(param4, var17 + var18, param6, -39, var16);
                                    break L11;
                                  }
                                }
                              }
                            }
                            param5++;
                            if (param5 < nb.field_b) {
                              var16 = var16 + kh.field_l;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L10;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = -param8 + param3;
                      if (var16 != 0) {
                        L13: {
                          var17 = param2 << 16;
                          if (var13 == 0) {
                            var9_int = param1 << 16;
                            break L13;
                          } else {
                            var10 = param1 << 16;
                            break L13;
                          }
                        }
                        var11 = (var17 - var9_int) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      } else {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (0 > param5) {
                      param5 = -param5;
                      var10 = var10 + param5 * var12;
                      var9_int = var9_int + var11 * param5;
                      param5 = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var15 = nb.field_a[param5];
                  L15: while (true) {
                    if (param3 <= param5) {
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 16;
                        if (var16 < nb.field_d) {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L16;
                            } else {
                              if (nb.field_d > var16) {
                                ui.a(param4, var17, param6, -122, var16 - -var15);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              if (nb.field_d <= var17 + var16) {
                                var17 = nb.field_d - (var16 - -1);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var16 >= 0) {
                              ui.a(param4, var17, param6, -107, var16 - -var15);
                              break L16;
                            } else {
                              ui.a(param4, var16 + var17, param6, -47, var15);
                              break L16;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                      param5++;
                      if (nb.field_b <= param5) {
                        return;
                      } else {
                        var15 = var15 + kh.field_l;
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        continue L15;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var9;
            stackOut_77_1 = new StringBuilder().append("qp.B(").append(99).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param4 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L18;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L18;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a() {
        pl.e(-119);
        qd.field_q = true;
        int var1 = 1;
        ne.field_d = true;
        qe.field_g.g((byte) -122);
        int discarded$0 = -13;
        ke.a(gg.field_b, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Basics", "Rolling", "Shuffles", "Spiders", "Sticky Balls"};
    }
}
