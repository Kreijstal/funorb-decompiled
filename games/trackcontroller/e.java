/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 != -1102) {
            field_a = (int[]) null;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int discarded$1 = 0;
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
        var19 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 < (param1 ^ -1)) {
                break L1;
              } else {
                if (ig.field_d > param8) {
                  L2: {
                    if (-1 >= (param0 ^ -1)) {
                      break L2;
                    } else {
                      if ((param4 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (0 <= param5) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param7 == -26361) {
                      break L3;
                    } else {
                      discarded$1 = e.a(64, -25, 3);
                      break L3;
                    }
                  }
                  L4: {
                    if (ig.field_g > param0) {
                      break L4;
                    } else {
                      if (param4 < ig.field_g) {
                        break L4;
                      } else {
                        if (ig.field_g > param5) {
                          break L4;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L5: {
                    var14 = param1 + -param8;
                    if (param8 == param3) {
                      L6: {
                        if (param1 != param8) {
                          var15 = param1 - param3;
                          if (param0 < param4) {
                            var12 = (-param4 + param5 << -1658295600) / var15;
                            var9_int = param0 << 713277712;
                            var11 = (param5 - param0 << 1487843632) / var14;
                            var10 = param4 << -1932340400;
                            break L6;
                          } else {
                            var10 = param0 << 355144816;
                            var11 = (-param4 + param5 << 1669895312) / var15;
                            var9_int = param4 << -145674064;
                            var12 = (param5 + -param0 << 1997827632) / var14;
                            break L6;
                          }
                        } else {
                          var10 = param4 << -2101196944;
                          var11 = 0;
                          var9_int = param0 << -1274111120;
                          var12 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (-1 < (param8 ^ -1)) {
                          param8 = Math.min(-param8, -param8 + param3);
                          var10 = var10 + var12 * param8;
                          var9_int = var9_int + param8 * var11;
                          param8 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var13 = 0;
                      break L5;
                    } else {
                      L8: {
                        var10 = param0 << -508436624;
                        var9_int = param0 << -508436624;
                        var15 = -param8 + param3;
                        var11 = (param4 - param0 << 802930896) / var15;
                        var12 = (param5 - param0 << -927902960) / var14;
                        if (var12 > var11) {
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
                          if (-1 >= (param8 ^ -1)) {
                            break L10;
                          } else {
                            if (-1 >= (param3 ^ -1)) {
                              param8 = -param8;
                              var10 = var10 + var12 * param8;
                              var9_int = var9_int + var11 * param8;
                              param8 = 0;
                              break L10;
                            } else {
                              param8 = -param8 + param3;
                              var10 = var10 + param8 * var12;
                              var9_int = var9_int + param8 * var11;
                              param8 = param3;
                              break L9;
                            }
                          }
                        }
                        var16 = ig.field_i[param8];
                        L11: while (true) {
                          if (param3 <= param8) {
                            break L9;
                          } else {
                            L12: {
                              var17 = var9_int >> -1065438224;
                              if (var17 >= ig.field_g) {
                                break L12;
                              } else {
                                var18 = (var10 >> 1217462736) - (var9_int >> 285256432);
                                if (-1 == (var18 ^ -1)) {
                                  if (var17 < 0) {
                                    break L12;
                                  } else {
                                    if (var17 < ig.field_g) {
                                      ta.a(param6, param7 ^ -19323, param2, var17 + var16, var18);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (ig.field_g <= var17 + var18) {
                                      var18 = -1 + -var17 + ig.field_g;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if (0 <= var17) {
                                    ta.a(param6, 11650, param2, var16 + var17, var18);
                                    break L12;
                                  } else {
                                    ta.a(param6, 11650, param2, var16, var17 + var18);
                                    break L12;
                                  }
                                }
                              }
                            }
                            param8++;
                            if (ig.field_d > param8) {
                              var16 = var16 + ll.field_d;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L11;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var16 = param1 + -param3;
                      if (0 != var16) {
                        L14: {
                          if (var13 == 0) {
                            var9_int = param4 << 1734676976;
                            break L14;
                          } else {
                            var10 = param4 << -2005729872;
                            break L14;
                          }
                        }
                        var17 = param5 << 1126796592;
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
                    if (0 > param8) {
                      param8 = -param8;
                      var9_int = var9_int + param8 * var11;
                      var10 = var10 + var12 * param8;
                      param8 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var15 = ig.field_i[param8];
                  L16: while (true) {
                    if (param1 <= param8) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 1548997680;
                        if (ig.field_g <= var16) {
                          break L17;
                        } else {
                          var17 = (var10 >> 1747374640) - (var9_int >> -362690576);
                          if (var17 != 0) {
                            L18: {
                              if (ig.field_g <= var17 + var16) {
                                var17 = -1 + (ig.field_g - var16);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if (var16 >= 0) {
                              ta.a(param6, 11650, param2, var16 + var15, var17);
                              break L17;
                            } else {
                              ta.a(param6, 11650, param2, var15, var17 + var16);
                              break L17;
                            }
                          } else {
                            if (0 > var16) {
                              break L17;
                            } else {
                              if (var16 >= ig.field_g) {
                                break L17;
                              } else {
                                ta.a(param6, param7 + 38011, param2, var15 + var16, var17);
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      param8++;
                      if (param8 < ig.field_d) {
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        var15 = var15 + ll.field_d;
                        continue L16;
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
          L19: {
            var9 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) (var9);
            stackOut_76_1 = new StringBuilder().append("e.B(").append(param0).append(',').append(param1).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param2 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param1 == -1932340400) {
          var3 = param2;
          if (512 == var3) {
            if ((1 & field_a[param0]) != 0) {
              return 4096;
            } else {
              L0: {
                if ((field_a[param0] & 8) == 0) {
                  stackOut_12_0 = 16384;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_11_0 = 2048;
                  stackIn_13_0 = stackOut_11_0;
                  break L0;
                }
              }
              return stackIn_13_0;
            }
          } else {
            if ((var3 ^ -1) != -1025) {
              if (-129 == (var3 ^ -1)) {
                return 4096;
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              L1: {
                if ((16 & field_a[param0]) != 0) {
                  stackOut_18_0 = 4096;
                  stackIn_19_0 = stackOut_18_0;
                  break L1;
                } else {
                  stackOut_17_0 = 2048;
                  stackIn_19_0 = stackOut_17_0;
                  break L1;
                }
              }
              return stackIn_19_0;
            }
          }
        } else {
          return 21;
        }
    }

    static {
        field_a = new int[38];
        field_a[19] = 17;
        field_a[24] = 1;
        field_a[15] = 4;
        field_a[16] = 9;
        field_a[28] = 26;
        field_a[11] = 36;
        field_a[33] = 49;
        field_a[14] = 8;
        field_a[36] = 7;
        field_a[30] = 13;
        field_a[13] = 32;
        field_a[23] = 34;
        field_a[12] = 16;
        field_a[34] = 35;
        field_a[32] = 42;
        field_a[10] = 24;
        field_a[20] = 6;
        field_a[8] = 2;
        field_a[21] = 18;
        field_a[29] = 38;
        field_a[7] = 1;
        field_a[26] = 37;
        field_a[37] = 19;
        field_a[27] = 25;
        field_a[17] = 5;
        field_a[9] = 3;
        field_a[25] = 2;
        field_a[18] = 33;
        field_a[35] = 11;
        field_a[31] = 22;
        field_a[22] = 10;
    }
}
