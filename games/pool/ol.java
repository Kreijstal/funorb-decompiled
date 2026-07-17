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
              if (param6 < 0) {
                break L1;
              } else {
                if (~param5 > ~fb.field_o) {
                  L2: {
                    if (param2 >= 0) {
                      break L2;
                    } else {
                      if (param4 >= 0) {
                        break L2;
                      } else {
                        if (param7 < 0) {
                          return;
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
                      if (~fb.field_k < ~param4) {
                        break L3;
                      } else {
                        if (fb.field_k <= param7) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param6 + -param5;
                    if (~param3 != ~param5) {
                      L5: {
                        var10 = param2 << 16;
                        var9_int = param2 << 16;
                        var15 = -param5 + param3;
                        var11 = (param4 + -param2 << 16) / var15;
                        var12 = (-param2 + param7 << 16) / var14;
                        if (~var11 > ~var12) {
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
                          if (~param3 >= ~param5) {
                            break L6;
                          } else {
                            L9: {
                              var17 = var9_int >> 16;
                              if (var17 < fb.field_k) {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
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
                              return;
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
                      if (var16 == 0) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L11: {
                          var17 = param7 << 16;
                          if (var13 != 0) {
                            var10 = param4 << 16;
                            break L11;
                          } else {
                            var9_int = param4 << 16;
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
                          var9_int = param2 << 16;
                          var12 = 0;
                          var10 = param4 << 16;
                          var11 = 0;
                          break L12;
                        } else {
                          var15 = param6 + -param3;
                          if (~param4 < ~param2) {
                            var12 = (-param4 + param7 << 16) / var15;
                            var9_int = param2 << 16;
                            var11 = (-param2 + param7 << 16) / var14;
                            var10 = param4 << 16;
                            break L12;
                          } else {
                            var11 = (param7 + -param4 << 16) / var15;
                            var9_int = param4 << 16;
                            var12 = (param7 - param2 << 16) / var14;
                            var10 = param2 << 16;
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (param5 < 0) {
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
                      field_c = null;
                      break L15;
                    }
                  }
                  L16: while (true) {
                    if (~param6 >= ~param5) {
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 16;
                        if (~fb.field_k < ~var16) {
                          var17 = (var10 >> 16) - (var9_int >> 16);
                          if (var17 == 0) {
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
                              if (~(var16 + var17) <= ~fb.field_k) {
                                var17 = -1 + fb.field_k + -var16;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if (var16 >= 0) {
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
                      if (~param5 <= ~fb.field_o) {
                        return;
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
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var9;
            stackOut_77_1 = new StringBuilder().append("ol.B(");
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L19;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L19;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static float[] a(int[] param0, byte param1) {
        RuntimeException var2 = null;
        float[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        float[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = op.a(16, param0, 97);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ol.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 1 + 41);
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1430775248) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Average rating";
    }
}
