/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fp {
    static int field_c;
    static pf field_b;
    static String field_a;

    abstract long a(int param0);

    final static hb a(pf param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        un stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        un stackOut_2_0 = null;
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
              if (param1 < -39) {
                break L1;
              } else {
                var3 = (int[]) null;
                fp.a(-79, 121, 76, -123, 0, -125, (int[]) null, -35, -114);
                break L1;
              }
            }
            stackOut_2_0 = new un(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("fp.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (hb) ((Object) stackIn_3_0);
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        L0: {
          var4 = this.a(0);
          if (var4 > 0L) {
            jb.a((byte) -115, var4);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -1) {
          return 113;
        } else {
          return this.a(18907, param0);
        }
    }

    abstract int a(int param0, long param1);

    abstract void b(int param0);

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 47) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
        hb discarded$1 = null;
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
        pf var20 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param8) {
                break L1;
              } else {
                if (param7 < wn.field_e) {
                  L2: {
                    if ((param3 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if (param1 >= 0) {
                        break L2;
                      } else {
                        if (-1 >= (param0 ^ -1)) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param3 < wn.field_c) {
                      break L3;
                    } else {
                      if (param1 < wn.field_c) {
                        break L3;
                      } else {
                        if (wn.field_c <= param0) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param2 < -90) {
                      break L4;
                    } else {
                      var20 = (pf) null;
                      discarded$1 = fp.a((pf) null, 68);
                      break L4;
                    }
                  }
                  L5: {
                    var14 = -param7 + param8;
                    if (param5 == param7) {
                      L6: {
                        if (param7 == param8) {
                          var9_int = param3 << -2044834736;
                          var11 = 0;
                          var12 = 0;
                          var10 = param1 << -1028325968;
                          break L6;
                        } else {
                          var15 = param8 - param5;
                          if (param3 >= param1) {
                            var10 = param3 << -294493136;
                            var12 = (param0 + -param3 << -2068482832) / var14;
                            var11 = (-param1 + param0 << -523655024) / var15;
                            var9_int = param1 << 675119056;
                            break L6;
                          } else {
                            var10 = param1 << 1704507920;
                            var12 = (param0 + -param1 << -1997523152) / var15;
                            var9_int = param3 << -1818782640;
                            var11 = (param0 - param3 << 926034672) / var14;
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (0 <= param7) {
                          break L7;
                        } else {
                          param7 = Math.min(-param7, -param7 + param5);
                          var9_int = var9_int + param7 * var11;
                          var10 = var10 + var12 * param7;
                          param7 = 0;
                          break L7;
                        }
                      }
                      var13 = 0;
                      break L5;
                    } else {
                      L8: {
                        var10 = param3 << 1151539632;
                        var9_int = param3 << 1151539632;
                        var15 = param5 - param7;
                        var11 = (param1 - param3 << -1391019088) / var15;
                        var12 = (-param3 + param0 << 1662837520) / var14;
                        if (var11 < var12) {
                          var13 = 0;
                          break L8;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if (0 <= param7) {
                            break L10;
                          } else {
                            if (param5 >= 0) {
                              param7 = -param7;
                              var9_int = var9_int + param7 * var11;
                              var10 = var10 + var12 * param7;
                              param7 = 0;
                              break L10;
                            } else {
                              param7 = -param7 + param5;
                              var10 = var10 + var12 * param7;
                              var9_int = var9_int + param7 * var11;
                              param7 = param5;
                              break L9;
                            }
                          }
                        }
                        var16 = wn.field_h[param7];
                        L11: while (true) {
                          if (param7 >= param5) {
                            break L9;
                          } else {
                            L12: {
                              var17 = var9_int >> -2099851440;
                              if (wn.field_c <= var17) {
                                break L12;
                              } else {
                                var18 = -(var9_int >> 110414640) + (var10 >> 946831920);
                                if (var18 != 0) {
                                  L13: {
                                    if (wn.field_c <= var17 + var18) {
                                      var18 = -1 + wn.field_c + -var17;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if ((var17 ^ -1) <= -1) {
                                    dp.a(var17 + var16, param6, -1, param4, var18);
                                    break L12;
                                  } else {
                                    dp.a(var16, param6, -1, param4, var17 + var18);
                                    break L12;
                                  }
                                } else {
                                  if ((var17 ^ -1) > -1) {
                                    break L12;
                                  } else {
                                    if (var17 >= wn.field_c) {
                                      break L12;
                                    } else {
                                      dp.a(var17 + var16, param6, -1, param4, var18);
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            param7++;
                            if (wn.field_e <= param7) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var10 = var10 + var12;
                              var16 = var16 + gf.field_b;
                              var9_int = var9_int + var11;
                              continue L11;
                            }
                          }
                        }
                      }
                      var16 = param8 - param5;
                      if (-1 == (var16 ^ -1)) {
                        var11 = 0;
                        var12 = 0;
                        break L5;
                      } else {
                        L14: {
                          if (var13 == 0) {
                            var9_int = param1 << -1868537488;
                            break L14;
                          } else {
                            var10 = param1 << -1894651024;
                            break L14;
                          }
                        }
                        var17 = param0 << -274977232;
                        var11 = (var17 - var9_int) / var16;
                        var12 = (var17 - var10) / var16;
                        break L5;
                      }
                    }
                  }
                  L15: {
                    if ((param7 ^ -1) > -1) {
                      param7 = -param7;
                      var9_int = var9_int + param7 * var11;
                      var10 = var10 + var12 * param7;
                      param7 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var15 = wn.field_h[param7];
                  L16: while (true) {
                    if (param8 <= param7) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> -559966736;
                        if (var16 < wn.field_c) {
                          var17 = (var10 >> 139189104) - (var9_int >> -1432175600);
                          if (var17 == 0) {
                            if (-1 < (var16 ^ -1)) {
                              break L17;
                            } else {
                              if (wn.field_c <= var16) {
                                break L17;
                              } else {
                                dp.a(var15 + var16, param6, -1, param4, var17);
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (var16 - -var17 < wn.field_c) {
                                break L18;
                              } else {
                                var17 = -1 + wn.field_c + -var16;
                                break L18;
                              }
                            }
                            if (-1 < (var16 ^ -1)) {
                              dp.a(var15, param6, -1, param4, var17 - -var16);
                              break L17;
                            } else {
                              dp.a(var16 + var15, param6, -1, param4, var17);
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param7++;
                      if (param7 >= wn.field_e) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var15 = var15 + gf.field_b;
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        continue L16;
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
          L19: {
            var9 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) (var9);
            stackOut_76_1 = new StringBuilder().append("fp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param6 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L19;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L19;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param7 + ',' + param8 + ')');
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

    static {
        field_a = "Names should contain a maximum of 12 characters";
    }
}
