/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    String field_a;
    static ot[] field_i;
    private int field_c;
    private oc[] field_d;
    private int field_g;
    private int field_e;
    static String field_f;
    static String[] field_j;
    static int[] field_b;
    float field_h;

    final void a(sj param0, byte param1, String param2, String param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              this.a(18476, param0, (String) null, param2, param3, -1);
              if (param1 <= -105) {
                break L1;
              } else {
                this.field_c = -99;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("qe.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private final void a(int param0, int param1, oc param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)(this.field_g + 1) + (float)param1 / 100.0f;
              if (param1 != 0) {
                this.field_a = param2.field_c + " - " + param1 + "%";
                break L1;
              } else {
                this.field_a = param2.field_d;
                break L1;
              }
            }
            L2: {
              this.field_h = (float)this.field_c * var4_float / (float)(1 + this.field_e);
              if (param0 == -1) {
                break L2;
              } else {
                field_i = (ot[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("qe.B(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param1.charAt(0);
            if (param0) {
              var3 = 1;
              L1: while (true) {
                if (var3 >= param1.length()) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1.charAt(var3) != var2_int) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("qe.D(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
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
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var19 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (-1 < (param3 ^ -1)) {
                break L1;
              } else {
                if (t.field_k <= param6) {
                  break L1;
                } else {
                  L2: {
                    if (param7 >= 0) {
                      break L2;
                    } else {
                      if (-1 >= (param8 ^ -1)) {
                        break L2;
                      } else {
                        if ((param1 ^ -1) <= -1) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param7 < t.field_b) {
                      break L3;
                    } else {
                      if (t.field_b > param8) {
                        break L3;
                      } else {
                        if (t.field_b > param1) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param2 == -2178) {
                      break L4;
                    } else {
                      field_b = (int[]) null;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = -param6 + param3;
                    if (param6 == param0) {
                      L6: {
                        if (param6 == param3) {
                          var12 = 0;
                          var9_int = param7 << -289398192;
                          var11 = 0;
                          var10 = param8 << 1655104560;
                          break L6;
                        } else {
                          var15 = param3 + -param0;
                          if (param8 <= param7) {
                            var11 = (-param8 + param1 << -288919280) / var15;
                            var9_int = param8 << 990497808;
                            var10 = param7 << -529280880;
                            var12 = (-param7 + param1 << 1306325648) / var14;
                            break L6;
                          } else {
                            var11 = (-param7 + param1 << 1181281840) / var14;
                            var10 = param8 << -468342160;
                            var12 = (param1 - param8 << -2134772944) / var15;
                            var9_int = param7 << 2074179664;
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if ((param6 ^ -1) > -1) {
                          param6 = Math.min(-param6, -param6 + param0);
                          var9_int = var9_int + param6 * var11;
                          var10 = var10 + var12 * param6;
                          param6 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var13 = 0;
                      break L5;
                    } else {
                      L8: {
                        var10 = param7 << -902170160;
                        var9_int = param7 << -902170160;
                        var15 = param0 + -param6;
                        var12 = (param1 + -param7 << -1480300944) / var14;
                        var11 = (-param7 + param8 << 390335536) / var15;
                        if (var12 <= var11) {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L8;
                        } else {
                          var13 = 0;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if ((param6 ^ -1) <= -1) {
                            break L10;
                          } else {
                            if (param0 >= 0) {
                              param6 = -param6;
                              var9_int = var9_int + param6 * var11;
                              var10 = var10 + var12 * param6;
                              param6 = 0;
                              break L10;
                            } else {
                              param6 = -param6 + param0;
                              var9_int = var9_int + param6 * var11;
                              var10 = var10 + var12 * param6;
                              param6 = param0;
                              break L9;
                            }
                          }
                        }
                        var16 = t.field_q[param6];
                        L11: while (true) {
                          if (param6 >= param0) {
                            break L9;
                          } else {
                            L12: {
                              var17 = var9_int >> 1965741968;
                              if (t.field_b <= var17) {
                                break L12;
                              } else {
                                var18 = (var10 >> 1183118480) - (var9_int >> -274950320);
                                if (0 != var18) {
                                  L13: {
                                    if (var18 + var17 >= t.field_b) {
                                      var18 = -1 + -var17 + t.field_b;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if (-1 < (var17 ^ -1)) {
                                    vj.a(param5, var16, var18 + var17, param4, 108);
                                    break L12;
                                  } else {
                                    vj.a(param5, var16 + var17, var18, param4, 102);
                                    break L12;
                                  }
                                } else {
                                  if ((var17 ^ -1) > -1) {
                                    break L12;
                                  } else {
                                    if (var17 < t.field_b) {
                                      vj.a(param5, var17 + var16, var18, param4, -26);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            param6++;
                            if (param6 < t.field_k) {
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              var16 = var16 + on.field_g;
                              continue L11;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var16 = -param0 + param3;
                      if (-1 != (var16 ^ -1)) {
                        L14: {
                          var17 = param1 << 1617128112;
                          if (var13 == 0) {
                            var9_int = param8 << 841152336;
                            break L14;
                          } else {
                            var10 = param8 << 1791473840;
                            break L14;
                          }
                        }
                        var11 = (-var9_int + var17) / var16;
                        var12 = (var17 - var10) / var16;
                        break L5;
                      } else {
                        var11 = 0;
                        var12 = 0;
                        break L5;
                      }
                    }
                  }
                  L15: {
                    if (-1 < (param6 ^ -1)) {
                      param6 = -param6;
                      var10 = var10 + param6 * var12;
                      var9_int = var9_int + param6 * var11;
                      param6 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var15 = t.field_q[param6];
                  L16: while (true) {
                    if (param6 >= param3) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> -1222022896;
                        if (var16 < t.field_b) {
                          var17 = (var10 >> -1167934576) + -(var9_int >> -1104617264);
                          if (-1 == (var17 ^ -1)) {
                            if (0 > var16) {
                              break L17;
                            } else {
                              if (var16 < t.field_b) {
                                vj.a(param5, var15 + var16, var17, param4, 104);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (t.field_b > var16 - -var17) {
                                break L18;
                              } else {
                                var17 = t.field_b + (-var16 - 1);
                                break L18;
                              }
                            }
                            if (-1 < (var16 ^ -1)) {
                              vj.a(param5, var15, var17 + var16, param4, 114);
                              break L17;
                            } else {
                              vj.a(param5, var16 + var15, var17, param4, param2 ^ -2285);
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param6++;
                      if (t.field_k <= param6) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var9_int = var9_int + var11;
                        var15 = var15 + on.field_g;
                        var10 = var10 + var12;
                        continue L16;
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
          L19: {
            var9 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) (var9);
            stackOut_79_1 = new StringBuilder().append("qe.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param5 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L19;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L19;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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

    final boolean a(int param0) {
        int var3 = 0;
        oc var4 = null;
        L0: {
          var3 = Kickabout.field_G;
          if (param0 == 1183118480) {
            break L0;
          } else {
            this.field_h = 2.4517242908477783f;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_g >= this.field_e) {
            return true;
          } else {
            var4 = this.field_d[this.field_g];
            if (!var4.field_h.d(-118)) {
              this.a(-1, 0, var4);
              return false;
            } else {
              L2: {
                if (0 > var4.field_a) {
                  break L2;
                } else {
                  if (var4.field_h.b((byte) 20, var4.field_a)) {
                    break L2;
                  } else {
                    this.a(-1, var4.field_h.b(var4.field_a, (byte) 56), var4);
                    return false;
                  }
                }
              }
              L3: {
                if (null == var4.field_g) {
                  break L3;
                } else {
                  if (var4.field_h.a(false, var4.field_g)) {
                    break L3;
                  } else {
                    this.a(-1, var4.field_h.a(var4.field_g, -16248), var4);
                    return false;
                  }
                }
              }
              L4: {
                if (var4.field_a >= 0) {
                  break L4;
                } else {
                  if (null != var4.field_g) {
                    break L4;
                  } else {
                    if (var4.field_c == null) {
                      break L4;
                    } else {
                      if (!var4.field_h.a(false)) {
                        this.a(param0 + -1183118481, var4.field_h.e(param0 ^ -1183116137), var4);
                        return false;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              this.field_g = this.field_g + 1;
              continue L1;
            }
          }
        }
    }

    final void a(sj param0, String param1, int param2, String param3, String param4) {
        if (param2 != -6869) {
            return;
        }
        try {
            this.a(param2 ^ -21241, param0, param3, param1, param4, -1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "qe.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, sj param1, String param2, String param3, String param4, int param5) {
        int fieldTemp$2 = 0;
        oc[] var7 = null;
        oc var7_ref = null;
        RuntimeException var7_ref2 = null;
        oc var8 = null;
        oc[] var9 = null;
        oc var10 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_d.length > this.field_e) {
                break L1;
              } else {
                var9 = new oc[2 * this.field_e];
                var7 = var9;
                dv.a(this.field_d, 0, var9, 0, this.field_e);
                this.field_d = var9;
                break L1;
              }
            }
            L2: {
              var8 = new oc();
              var10 = var8;
              var7_ref = var10;
              var10.field_d = param4;
              var10.field_h = param1;
              var10.field_g = param2;
              var10.field_c = param3;
              var10.field_a = param5;
              fieldTemp$2 = this.field_e;
              this.field_e = this.field_e + 1;
              this.field_d[fieldTemp$2] = var8;
              if (param0 == 18476) {
                break L2;
              } else {
                this.field_d = (oc[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7_ref2);
            stackOut_5_1 = new StringBuilder().append("qe.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param5 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            qe.a(true);
        }
        field_b = null;
        field_f = null;
        field_i = null;
        field_j = null;
    }

    final void a(String param0, sj param1, int param2) {
        try {
            if (param2 >= -67) {
                sj var5 = (sj) null;
                this.a((String) null, (sj) null, -7);
            }
            this.a(18476, param1, (String) null, (String) null, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "qe.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    qe(int param0) {
        this.field_d = new oc[16];
        this.field_c = param0;
    }

    static {
        field_f = "This kit was unlocked by the \"<%0>\" achievement.";
        field_j = new String[]{"total tackles", "total success", "total off ball", "times tackled"};
        field_b = new int[1024];
    }
}
