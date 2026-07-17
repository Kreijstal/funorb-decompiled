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
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var19 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param6 < 0) {
                break L1;
              } else {
                if (param8 >= cj.field_d) {
                  break L1;
                } else {
                  L2: {
                    if (param3 >= 0) {
                      break L2;
                    } else {
                      if (param5 >= 0) {
                        break L2;
                      } else {
                        if (param0 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (~param3 > ~cj.field_b) {
                      break L3;
                    } else {
                      if (~cj.field_b < ~param5) {
                        break L3;
                      } else {
                        if (param0 < cj.field_b) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = -param8 + param6;
                    if (param8 == param2) {
                      L5: {
                        if (~param8 != ~param6) {
                          var15 = param6 - param2;
                          if (~param3 <= ~param5) {
                            var11 = (-param5 + param0 << 16) / var15;
                            var12 = (-param3 + param0 << 16) / var14;
                            var10 = param3 << 16;
                            var9_int = param5 << 16;
                            break L5;
                          } else {
                            var10 = param5 << 16;
                            var9_int = param3 << 16;
                            var12 = (-param5 + param0 << 16) / var15;
                            var11 = (-param3 + param0 << 16) / var14;
                            break L5;
                          }
                        } else {
                          var9_int = param3 << 16;
                          var11 = 0;
                          var12 = 0;
                          var10 = param5 << 16;
                          break L5;
                        }
                      }
                      var13 = 0;
                      if (param8 < 0) {
                        param8 = Math.min(-param8, param2 + -param8);
                        var10 = var10 + var12 * param8;
                        var9_int = var9_int + var11 * param8;
                        param8 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param3 << 16;
                        var9_int = param3 << 16;
                        var15 = -param8 + param2;
                        var11 = (param5 - param3 << 16) / var15;
                        var12 = (-param3 + param0 << 16) / var14;
                        if (var12 <= var11) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        } else {
                          var13 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (param8 >= 0) {
                            break L8;
                          } else {
                            if (param2 >= 0) {
                              param8 = -param8;
                              var10 = var10 + var12 * param8;
                              var9_int = var9_int + var11 * param8;
                              param8 = 0;
                              break L8;
                            } else {
                              param8 = param2 + -param8;
                              var9_int = var9_int + var11 * param8;
                              var10 = var10 + var12 * param8;
                              param8 = param2;
                              break L7;
                            }
                          }
                        }
                        var16 = cj.field_a[param8];
                        L9: while (true) {
                          if (param8 >= param2) {
                            break L7;
                          } else {
                            L10: {
                              var17 = var9_int >> 16;
                              if (cj.field_b <= var17) {
                                break L10;
                              } else {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (var18 == 0) {
                                  if (var17 < 0) {
                                    break L10;
                                  } else {
                                    if (var17 >= cj.field_b) {
                                      break L10;
                                    } else {
                                      se.a(var17 + var16, 123, param1, var18, param4);
                                      break L10;
                                    }
                                  }
                                } else {
                                  L11: {
                                    if (~(var18 + var17) <= ~cj.field_b) {
                                      var18 = -1 + (-var17 + cj.field_b);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  if (var17 < 0) {
                                    se.a(var16, 95, param1, var17 + var18, param4);
                                    break L10;
                                  } else {
                                    se.a(var17 + var16, 123, param1, var18, param4);
                                    break L10;
                                  }
                                }
                              }
                            }
                            param8++;
                            if (~cj.field_d < ~param8) {
                              var16 = var16 + ed.field_h;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L9;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = param6 + -param2;
                      if (0 != var16) {
                        L12: {
                          var17 = param0 << 16;
                          if (var13 != 0) {
                            var10 = param5 << 16;
                            break L12;
                          } else {
                            var9_int = param5 << 16;
                            break L12;
                          }
                        }
                        var12 = (var17 + -var10) / var16;
                        var11 = (var17 - var9_int) / var16;
                        break L4;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if (param8 >= 0) {
                      break L13;
                    } else {
                      param8 = -param8;
                      var9_int = var9_int + param8 * var11;
                      var10 = var10 + var12 * param8;
                      param8 = 0;
                      break L13;
                    }
                  }
                  var15 = cj.field_a[param8];
                  L14: while (true) {
                    if (~param6 >= ~param8) {
                      break L0;
                    } else {
                      L15: {
                        var16 = var9_int >> 16;
                        if (~var16 > ~cj.field_b) {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L15;
                            } else {
                              if (var16 >= cj.field_b) {
                                break L15;
                              } else {
                                se.a(var15 + var16, 123, param1, var17, param4);
                                break L15;
                              }
                            }
                          } else {
                            L16: {
                              if (cj.field_b > var16 - -var17) {
                                break L16;
                              } else {
                                var17 = -1 + (cj.field_b - var16);
                                break L16;
                              }
                            }
                            if (0 <= var16) {
                              se.a(var15 + var16, 89, param1, var17, param4);
                              break L15;
                            } else {
                              se.a(var15, 84, param1, var16 + var17, param4);
                              break L15;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      param8++;
                      if (param8 >= cj.field_d) {
                        return;
                      } else {
                        var9_int = var9_int + var11;
                        var10 = var10 + var12;
                        var15 = var15 + ed.field_h;
                        continue L14;
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
          L17: {
            var9 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var9;
            stackOut_73_1 = new StringBuilder().append("a.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
              break L17;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L17;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param5 + 44 + param6 + 44 + -20476 + 44 + param8 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
    }
}
