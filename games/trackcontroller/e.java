/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        var19 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (ig.field_d > param8) {
                  L2: {
                    if (param0 >= 0) {
                      break L2;
                    } else {
                      if (param4 >= 0) {
                        break L2;
                      } else {
                        if (0 <= param5) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param7 == -26361) {
                      break L3;
                    } else {
                      int discarded$1 = e.a(64, -25, 3);
                      break L3;
                    }
                  }
                  L4: {
                    if (~ig.field_g < ~param0) {
                      break L4;
                    } else {
                      if (param4 < ig.field_g) {
                        break L4;
                      } else {
                        if (~ig.field_g < ~param5) {
                          break L4;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L5: {
                    var14 = param1 + -param8;
                    if (~param8 == ~param3) {
                      L6: {
                        if (~param1 != ~param8) {
                          var15 = param1 - param3;
                          if (param0 < param4) {
                            var12 = (-param4 + param5 << 16) / var15;
                            var9_int = param0 << 16;
                            var11 = (param5 - param0 << 16) / var14;
                            var10 = param4 << 16;
                            break L6;
                          } else {
                            var10 = param0 << 16;
                            var11 = (-param4 + param5 << 16) / var15;
                            var9_int = param4 << 16;
                            var12 = (param5 + -param0 << 16) / var14;
                            break L6;
                          }
                        } else {
                          var10 = param4 << 16;
                          var11 = 0;
                          var9_int = param0 << 16;
                          var12 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (param8 < 0) {
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
                        var10 = param0 << 16;
                        var9_int = param0 << 16;
                        var15 = -param8 + param3;
                        var11 = (param4 - param0 << 16) / var15;
                        var12 = (param5 - param0 << 16) / var14;
                        if (~var12 < ~var11) {
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
                          if (param8 >= 0) {
                            break L10;
                          } else {
                            if (param3 >= 0) {
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
                              var17 = var9_int >> 16;
                              if (~var17 <= ~ig.field_g) {
                                break L12;
                              } else {
                                var18 = (var10 >> 16) - (var9_int >> 16);
                                if (var18 == 0) {
                                  if (var17 < 0) {
                                    break L12;
                                  } else {
                                    if (~var17 > ~ig.field_g) {
                                      ta.a(param6, param7 ^ -19323, param2, var17 + var16, var18);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (~ig.field_g >= ~(var17 + var18)) {
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
                            if (~ig.field_d < ~param8) {
                              var16 = var16 + ll.field_d;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L11;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = param1 + -param3;
                      if (0 != var16) {
                        L14: {
                          if (var13 == 0) {
                            var9_int = param4 << 16;
                            break L14;
                          } else {
                            var10 = param4 << 16;
                            break L14;
                          }
                        }
                        var17 = param5 << 16;
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
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 16;
                        if (ig.field_g <= var16) {
                          break L17;
                        } else {
                          var17 = (var10 >> 16) - (var9_int >> 16);
                          if (var17 != 0) {
                            L18: {
                              if (~ig.field_g >= ~(var17 + var16)) {
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
                      if (~param8 > ~ig.field_d) {
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        var15 = var15 + ll.field_d;
                        continue L16;
                      } else {
                        return;
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
          L19: {
            var9 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var9;
            stackOut_76_1 = new StringBuilder().append("e.B(").append(param0).append(44).append(param1).append(44);
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param2 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param1 == -1932340400) {
          var3 = param2;
          if (512 == var3) {
            if ((1 & field_a[param0]) == 0) {
              L0: {
                if ((field_a[param0] & 8) == 0) {
                  stackOut_11_0 = 16384;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_10_0 = 2048;
                  stackIn_12_0 = stackOut_10_0;
                  break L0;
                }
              }
              return stackIn_12_0;
            } else {
              return 4096;
            }
          } else {
            if (var3 != 1024) {
              if (var3 != 128) {
                throw new IllegalArgumentException();
              } else {
                return 4096;
              }
            } else {
              L1: {
                if ((16 & field_a[param0]) != 0) {
                  stackOut_15_0 = 4096;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                } else {
                  stackOut_14_0 = 2048;
                  stackIn_16_0 = stackOut_14_0;
                  break L1;
                }
              }
              return stackIn_16_0;
            }
          }
        } else {
          return 21;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
