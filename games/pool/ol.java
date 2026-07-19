/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static int field_d;
    static int field_a;
    static int field_e;
    static String field_b;
    static an field_c;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        try {
          L0: {
            L1: {
              if (-1 < (param6 ^ -1)) {
                break L1;
              } else {
                if (param5 < fb.field_o) {
                  L2: {
                    if ((param2 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if ((param4 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (-1 < (param7 ^ -1)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param2 < fb.field_k) {
                      break L3;
                    } else {
                      if (fb.field_k > param4) {
                        break L3;
                      } else {
                        if (fb.field_k <= param7) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param6 + -param5;
                    if (param3 != param5) {
                      L5: {
                        var10 = param2 << -161819888;
                        var9_int = param2 << -161819888;
                        var15 = -param5 + param3;
                        var11 = (param4 + -param2 << -1052394480) / var15;
                        var12 = (-param2 + param7 << -81090800) / var14;
                        if (var11 < var12) {
                          var13 = 0;
                          break L5;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (param5 >= 0) {
                            break L7;
                          } else {
                            if (0 <= param3) {
                              param5 = -param5;
                              var10 = var10 + param5 * var12;
                              var9_int = var9_int + var11 * param5;
                              param5 = 0;
                              break L7;
                            } else {
                              param5 = -param5 + param3;
                              var9_int = var9_int + var11 * param5;
                              var10 = var10 + param5 * var12;
                              param5 = param3;
                              break L6;
                            }
                          }
                        }
                        var16 = fb.field_m[param5];
                        L8: while (true) {
                          if (param3 <= param5) {
                            break L6;
                          } else {
                            L9: {
                              var17 = var9_int >> -463446672;
                              if (var17 < fb.field_k) {
                                var18 = -(var9_int >> -460888208) + (var10 >> -1098195152);
                                if (0 == var18) {
                                  if (0 > var17) {
                                    break L9;
                                  } else {
                                    if (var17 < fb.field_k) {
                                      fd.a(param0, param1, var16 + var17, var18, 2);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                } else {
                                  L10: {
                                    if (fb.field_k > var17 - -var18) {
                                      break L10;
                                    } else {
                                      var18 = -1 + (fb.field_k + -var17);
                                      break L10;
                                    }
                                  }
                                  if (var17 < 0) {
                                    fd.a(param0, param1, var16, var17 + var18, param8 + -19545);
                                    break L9;
                                  } else {
                                    fd.a(param0, param1, var16 + var17, var18, param8 ^ 19545);
                                    break L9;
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            param5++;
                            if (fb.field_o <= param5) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              var16 = var16 + qh.field_l;
                              continue L8;
                            }
                          }
                        }
                      }
                      var16 = -param3 + param6;
                      if (-1 == (var16 ^ -1)) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L11: {
                          var17 = param7 << 2045150064;
                          if (var13 != 0) {
                            var10 = param4 << 1156974096;
                            break L11;
                          } else {
                            var9_int = param4 << 1236798832;
                            break L11;
                          }
                        }
                        var11 = (var17 - var9_int) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (param6 == param5) {
                          var9_int = param2 << 1954610672;
                          var12 = 0;
                          var10 = param4 << -915913360;
                          var11 = 0;
                          break L12;
                        } else {
                          var15 = param6 + -param3;
                          if (param4 > param2) {
                            var12 = (-param4 + param7 << -570291504) / var15;
                            var9_int = param2 << -1234640560;
                            var11 = (-param2 + param7 << -1046219824) / var14;
                            var10 = param4 << 1430775248;
                            break L12;
                          } else {
                            var11 = (param7 + -param4 << -138966960) / var15;
                            var9_int = param4 << -1667536720;
                            var12 = (param7 - param2 << -2078298416) / var14;
                            var10 = param2 << 124986128;
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (-1 < (param5 ^ -1)) {
                          param5 = Math.min(-param5, param3 - param5);
                          var9_int = var9_int + param5 * var11;
                          var10 = var10 + var12 * param5;
                          param5 = 0;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var13 = 0;
                      break L4;
                    }
                  }
                  L14: {
                    if (param5 >= 0) {
                      break L14;
                    } else {
                      param5 = -param5;
                      var10 = var10 + param5 * var12;
                      var9_int = var9_int + param5 * var11;
                      param5 = 0;
                      break L14;
                    }
                  }
                  L15: {
                    var15 = fb.field_m[param5];
                    if (param8 == 19547) {
                      break L15;
                    } else {
                      field_c = (an) null;
                      break L15;
                    }
                  }
                  L16: while (true) {
                    if (param6 <= param5) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> -700793424;
                        if (fb.field_k > var16) {
                          var17 = (var10 >> 1311218480) - (var9_int >> 1439674256);
                          if (-1 == (var17 ^ -1)) {
                            if (0 > var16) {
                              break L17;
                            } else {
                              if (fb.field_k > var16) {
                                fd.a(param0, param1, var16 + var15, var17, 2);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (var16 + var17 >= fb.field_k) {
                                var17 = -1 + fb.field_k + -var16;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if (-1 >= (var16 ^ -1)) {
                              fd.a(param0, param1, var16 - -var15, var17, 2);
                              break L17;
                            } else {
                              fd.a(param0, param1, var15, var17 - -var16, 2);
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param5++;
                      if (param5 >= fb.field_o) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        var15 = var15 + qh.field_l;
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
            stackOut_77_0 = (RuntimeException) (var9);
            stackOut_77_1 = new StringBuilder().append("ol.B(");
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L19;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L19;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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

    final static float[] a(int[] param0, byte param1) {
        RuntimeException var2 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_2_0 = null;
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
              if (param1 == 1) {
                break L1;
              } else {
                field_a = 96;
                break L1;
              }
            }
            stackOut_2_0 = op.a(16, param0, 97);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ol.A(");
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
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1430775248) {
            return;
        }
        field_c = null;
    }

    static {
        field_b = "Average rating";
    }
}
