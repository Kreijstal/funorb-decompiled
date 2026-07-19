/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static gb field_a;
    static String[] field_b;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
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
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var19 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (-1 < (param6 ^ -1)) {
                break L1;
              } else {
                if (param8 >= cj.field_d) {
                  break L1;
                } else {
                  L2: {
                    if (param7 == -20476) {
                      break L2;
                    } else {
                      field_a = (gb) null;
                      break L2;
                    }
                  }
                  L3: {
                    if (param3 >= 0) {
                      break L3;
                    } else {
                      if ((param5 ^ -1) <= -1) {
                        break L3;
                      } else {
                        if (-1 >= (param0 ^ -1)) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param3 < cj.field_b) {
                      break L4;
                    } else {
                      if (cj.field_b > param5) {
                        break L4;
                      } else {
                        if (param0 < cj.field_b) {
                          break L4;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L5: {
                    var14 = -param8 + param6;
                    if (param8 == param2) {
                      L6: {
                        if (param8 != param6) {
                          var15 = param6 - param2;
                          if (param3 >= param5) {
                            var11 = (-param5 + param0 << -675054192) / var15;
                            var12 = (-param3 + param0 << 1533737392) / var14;
                            var10 = param3 << 710859440;
                            var9_int = param5 << 508444880;
                            break L6;
                          } else {
                            var10 = param5 << 1752793872;
                            var9_int = param3 << -1704007568;
                            var12 = (-param5 + param0 << 978938416) / var15;
                            var11 = (-param3 + param0 << -957680016) / var14;
                            break L6;
                          }
                        } else {
                          var9_int = param3 << 375884304;
                          var11 = 0;
                          var12 = 0;
                          var10 = param5 << 1041901232;
                          break L6;
                        }
                      }
                      var13 = 0;
                      if ((param8 ^ -1) > -1) {
                        param8 = Math.min(-param8, param2 + -param8);
                        var10 = var10 + var12 * param8;
                        var9_int = var9_int + var11 * param8;
                        param8 = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      L7: {
                        var10 = param3 << 217207824;
                        var9_int = param3 << 217207824;
                        var15 = -param8 + param2;
                        var11 = (param5 - param3 << 1589196432) / var15;
                        var12 = (-param3 + param0 << 2130297168) / var14;
                        if (var12 <= var11) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L7;
                        } else {
                          var13 = 0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if ((param8 ^ -1) <= -1) {
                            break L9;
                          } else {
                            if ((param2 ^ -1) <= -1) {
                              param8 = -param8;
                              var10 = var10 + var12 * param8;
                              var9_int = var9_int + var11 * param8;
                              param8 = 0;
                              break L9;
                            } else {
                              param8 = param2 + -param8;
                              var9_int = var9_int + var11 * param8;
                              var10 = var10 + var12 * param8;
                              param8 = param2;
                              break L8;
                            }
                          }
                        }
                        var16 = cj.field_a[param8];
                        L10: while (true) {
                          if (param8 >= param2) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> -152979408;
                              if (cj.field_b <= var17) {
                                break L11;
                              } else {
                                var18 = -(var9_int >> -1409637328) + (var10 >> 1884136048);
                                if (-1 == (var18 ^ -1)) {
                                  if (-1 < (var17 ^ -1)) {
                                    break L11;
                                  } else {
                                    if (var17 >= cj.field_b) {
                                      break L11;
                                    } else {
                                      se.a(var17 + var16, 123, param1, var18, param4);
                                      break L11;
                                    }
                                  }
                                } else {
                                  L12: {
                                    if (var18 + var17 >= cj.field_b) {
                                      var18 = -1 + (-var17 + cj.field_b);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  if (-1 < (var17 ^ -1)) {
                                    se.a(var16, 95, param1, var17 + var18, param4);
                                    break L11;
                                  } else {
                                    se.a(var17 + var16, param7 + 20599, param1, var18, param4);
                                    break L11;
                                  }
                                }
                              }
                            }
                            param8++;
                            if (cj.field_d > param8) {
                              var16 = var16 + ed.field_h;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L10;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var16 = param6 + -param2;
                      if (0 != var16) {
                        L13: {
                          var17 = param0 << 455341008;
                          if (var13 != 0) {
                            var10 = param5 << -237429328;
                            break L13;
                          } else {
                            var9_int = param5 << -454410960;
                            break L13;
                          }
                        }
                        var12 = (var17 + -var10) / var16;
                        var11 = (var17 - var9_int) / var16;
                        break L5;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L5;
                      }
                    }
                  }
                  L14: {
                    if (-1 >= (param8 ^ -1)) {
                      break L14;
                    } else {
                      param8 = -param8;
                      var9_int = var9_int + param8 * var11;
                      var10 = var10 + var12 * param8;
                      param8 = 0;
                      break L14;
                    }
                  }
                  var15 = cj.field_a[param8];
                  L15: while (true) {
                    if (param6 <= param8) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> -974510416;
                        if (var16 < cj.field_b) {
                          var17 = -(var9_int >> 439317136) + (var10 >> -331851056);
                          if (var17 == 0) {
                            if (-1 < (var16 ^ -1)) {
                              break L16;
                            } else {
                              if (var16 >= cj.field_b) {
                                break L16;
                              } else {
                                se.a(var15 + var16, 123, param1, var17, param4);
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              if (cj.field_b > var16 - -var17) {
                                break L17;
                              } else {
                                var17 = -1 + (cj.field_b - var16);
                                break L17;
                              }
                            }
                            if (0 <= var16) {
                              se.a(var15 + var16, 89, param1, var17, param4);
                              break L16;
                            } else {
                              se.a(var15, 84, param1, var16 + var17, param4);
                              break L16;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                      param8++;
                      if (param8 >= cj.field_d) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var9_int = var9_int + var11;
                        var10 = var10 + var12;
                        var15 = var15 + ed.field_h;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var9);
            stackOut_75_1 = new StringBuilder().append("a.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param4 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L18;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L18;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -331851056) {
            int[] var2 = (int[]) null;
            a.a(-97, -4, 61, -122, (int[]) null, -38, 93, 89, -73);
        }
        field_b = null;
        field_a = null;
    }

    static {
    }
}
