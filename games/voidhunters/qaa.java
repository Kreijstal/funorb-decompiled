/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qaa implements dja {
    static float field_a;
    static int field_b;

    public final tv a(byte param0) {
        int var2 = 46 % ((param0 - -64) / 50);
        return (tv) ((Object) new ptb());
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
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
        int var20 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var20 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) > -1) {
                break L1;
              } else {
                if (param3 < bfb.field_h) {
                  L2: {
                    if (-1 >= (param4 ^ -1)) {
                      break L2;
                    } else {
                      if ((param6 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (param5 >= 0) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param4 < bfb.field_a) {
                      break L3;
                    } else {
                      if (param6 < bfb.field_a) {
                        break L3;
                      } else {
                        if (param5 >= bfb.field_a) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var13 = 94 / ((param1 - -45) / 51);
                    var15 = -param3 + param0;
                    if (param8 == param3) {
                      L5: {
                        if (param3 == param0) {
                          var12 = 0;
                          var10 = param6 << -150507568;
                          var9_int = param4 << -1246564432;
                          var11 = 0;
                          break L5;
                        } else {
                          var16 = -param8 + param0;
                          if (param4 < param6) {
                            var12 = (param5 + -param6 << -816091696) / var16;
                            var10 = param6 << -1208461712;
                            var9_int = param4 << -1051345104;
                            var11 = (param5 + -param4 << 956687952) / var15;
                            break L5;
                          } else {
                            var9_int = param6 << 663931984;
                            var11 = (param5 - param6 << 1905277008) / var16;
                            var10 = param4 << -1466289456;
                            var12 = (param5 + -param4 << 1786623536) / var15;
                            break L5;
                          }
                        }
                      }
                      var14 = 0;
                      if (0 <= param3) {
                        break L4;
                      } else {
                        param3 = Math.min(-param3, -param3 + param8);
                        var10 = var10 + param3 * var12;
                        var9_int = var9_int + param3 * var11;
                        param3 = 0;
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param4 << 535824336;
                        var9_int = param4 << 535824336;
                        var16 = param8 + -param3;
                        var11 = (param6 + -param4 << 1281664976) / var16;
                        var12 = (-param4 + param5 << -1354655728) / var15;
                        if (var12 <= var11) {
                          var17 = var11;
                          var11 = var12;
                          var12 = var17;
                          var14 = 1;
                          break L6;
                        } else {
                          var14 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (param3 >= 0) {
                            break L8;
                          } else {
                            if (param8 >= 0) {
                              param3 = -param3;
                              var9_int = var9_int + var11 * param3;
                              var10 = var10 + param3 * var12;
                              param3 = 0;
                              break L8;
                            } else {
                              param3 = -param3 + param8;
                              var10 = var10 + param3 * var12;
                              var9_int = var9_int + var11 * param3;
                              param3 = param8;
                              break L7;
                            }
                          }
                        }
                        var17 = bfb.field_g[param3];
                        L9: while (true) {
                          if (param3 >= param8) {
                            break L7;
                          } else {
                            L10: {
                              var18 = var9_int >> 1934168112;
                              if (bfb.field_a > var18) {
                                var19 = (var10 >> -796713584) - (var9_int >> 1513870352);
                                if (0 != var19) {
                                  L11: {
                                    if (bfb.field_a > var19 + var18) {
                                      break L11;
                                    } else {
                                      var19 = -1 + (bfb.field_a - var18);
                                      break L11;
                                    }
                                  }
                                  if (-1 >= (var18 ^ -1)) {
                                    wga.a(true, var18 + var17, param2, var19, param7);
                                    break L10;
                                  } else {
                                    wga.a(true, var17, param2, var18 + var19, param7);
                                    break L10;
                                  }
                                } else {
                                  if (0 > var18) {
                                    break L10;
                                  } else {
                                    if (var18 >= bfb.field_a) {
                                      break L10;
                                    } else {
                                      wga.a(true, var17 + var18, param2, var19, param7);
                                      break L10;
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                            param3++;
                            if (param3 >= bfb.field_h) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var10 = var10 + var12;
                              var17 = var17 + dma.field_g;
                              var9_int = var9_int + var11;
                              continue L9;
                            }
                          }
                        }
                      }
                      var17 = param0 - param8;
                      if (var17 != 0) {
                        L12: {
                          var18 = param5 << -965800144;
                          if (var14 != 0) {
                            var10 = param6 << 258228432;
                            break L12;
                          } else {
                            var9_int = param6 << 1361040176;
                            break L12;
                          }
                        }
                        var11 = (-var9_int + var18) / var17;
                        var12 = (-var10 + var18) / var17;
                        break L4;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if (0 <= param3) {
                      break L13;
                    } else {
                      param3 = -param3;
                      var10 = var10 + var12 * param3;
                      var9_int = var9_int + param3 * var11;
                      param3 = 0;
                      break L13;
                    }
                  }
                  var16 = bfb.field_g[param3];
                  L14: while (true) {
                    if (param3 >= param0) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L15: {
                        var17 = var9_int >> 1424046256;
                        if (var17 < bfb.field_a) {
                          var18 = (var10 >> 1972778000) - (var9_int >> -30287760);
                          if (var18 == 0) {
                            if (0 > var17) {
                              break L15;
                            } else {
                              if (bfb.field_a <= var17) {
                                break L15;
                              } else {
                                wga.a(true, var17 + var16, param2, var18, param7);
                                break L15;
                              }
                            }
                          } else {
                            L16: {
                              if (bfb.field_a > var18 + var17) {
                                break L16;
                              } else {
                                var18 = -1 + bfb.field_a - var17;
                                break L16;
                              }
                            }
                            if (0 > var17) {
                              wga.a(true, var16, param2, var17 + var18, param7);
                              break L15;
                            } else {
                              wga.a(true, var17 + var16, param2, var18, param7);
                              break L15;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      param3++;
                      if (bfb.field_h > param3) {
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        var16 = var16 + dma.field_g;
                        continue L14;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var9 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var9);
            stackOut_71_1 = new StringBuilder().append("qaa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param7 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L17;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L17;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param8 + ')');
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

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            int[] var4 = (int[]) null;
            qaa.a(35, 80, -54, 13, 73, 4, -14, (int[]) null, -74);
        }
        return (tv[]) ((Object) new ptb[param1]);
    }

    static {
        field_a = 20.0f;
        field_b = 1500;
    }
}
