/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri implements j {
    static int field_f;
    private int field_b;
    static String field_d;
    static String field_a;
    private int field_c;
    private mg field_e;

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -6873) {
          L0: {
            field_f = -71;
            if ((-param1 & param1) != param1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((-param1 & param1) != param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
            field_f = 91;
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_v) {
                  break L2;
                } else {
                  if (!param4.b(true)) {
                    stackOut_5_0 = 2188450;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_6_0 = stackOut_4_0;
              break L1;
            }
            var6_int = stackIn_6_0;
            discarded$1 = this.field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_i + "</u>", param3 + param4.field_m, param1 + param4.field_j, param4.field_t, param4.field_x, var6_int, -1, this.field_b, this.field_c, this.field_e.field_s + this.field_e.field_F);
            if (param0 >= 113) {
              L3: {
                if (!param4.b(true)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var7 = this.field_e.b(param4.field_i);
                      var8 = this.field_e.field_s + this.field_e.field_F;
                      var9 = param3 - -param4.field_m;
                      if (this.field_b != 2) {
                        break L5;
                      } else {
                        var9 = var9 + (param4.field_t - var7);
                        if (var11 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (-2 == (this.field_b ^ -1)) {
                      var9 = var9 + (-var7 + param4.field_t >> 1051701537);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    L7: {
                      var10 = param4.field_j + param1;
                      if (-3 != (this.field_c ^ -1)) {
                        break L7;
                      } else {
                        var10 = var10 + (-var8 + param4.field_x);
                        if (var11 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (-2 != (this.field_c ^ -1)) {
                      break L6;
                    } else {
                      var10 = var10 + (param4.field_x + -var8 >> -854277343);
                      break L6;
                    }
                  }
                  ci.a(var7 - -4, 2 + var10, var8, var9 - 2, (byte) 125);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("ri.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, byte param4, int param5, int param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        var14 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 <= param6) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param6 - -1 < param3) {
                L1: {
                  if (param6 - -5 >= param3) {
                    break L1;
                  } else {
                    if (param0 == param5) {
                      break L1;
                    } else {
                      var7_int = (1 & (param5 & param0)) + ((param0 >> -643157535) + (param5 >> -1524157823));
                      var8 = param6;
                      var9 = param0;
                      var10 = param5;
                      var11 = param6;
                      L2: while (true) {
                        L3: {
                          if (var11 >= param3) {
                            ri.a(param0, param1, param2, var8, (byte) -81, var9, param6);
                            stackOut_35_0 = var10;
                            stackIn_36_0 = stackOut_35_0;
                            break L3;
                          } else {
                            var12 = pd.field_e[var11];
                            stackOut_23_0 = param2;
                            stackIn_36_0 = stackOut_23_0 ? 1 : 0;
                            stackIn_24_0 = stackOut_23_0;
                            if (var14 != 0) {
                              break L3;
                            } else {
                              L4: {
                                if (!stackIn_24_0) {
                                  stackOut_26_0 = l.field_a[var12];
                                  stackIn_27_0 = stackOut_26_0;
                                  break L4;
                                } else {
                                  stackOut_25_0 = qg.field_c[var12];
                                  stackIn_27_0 = stackOut_25_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var13 = stackIn_27_0;
                                  if (var13 > var7_int) {
                                    break L6;
                                  } else {
                                    if (var10 >= var13) {
                                      break L5;
                                    } else {
                                      var10 = var13;
                                      if (var14 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                L7: {
                                  pd.field_e[var11] = pd.field_e[var8];
                                  if (var13 < var9) {
                                    var9 = var13;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                incrementValue$1 = var8;
                                var8++;
                                pd.field_e[incrementValue$1] = var12;
                                break L5;
                              }
                              var11++;
                              continue L2;
                            }
                          }
                        }
                        ri.a(stackIn_36_0, param1, param2, param3, param4, param5, var8);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                var7_int = -1 + param3;
                L8: while (true) {
                  stackOut_10_0 = param6;
                  stackIn_11_0 = stackOut_10_0;
                  L9: while (true) {
                    L10: {
                      if (stackIn_11_0 >= var7_int) {
                        break L10;
                      } else {
                        var8 = param6;
                        L11: while (true) {
                          L12: {
                            if (var8 >= var7_int) {
                              break L12;
                            } else {
                              var9 = pd.field_e[var8];
                              var10 = pd.field_e[1 + var8];
                              stackOut_14_0 = ec.a(var9, -66, param2, var10);
                              stackIn_11_0 = stackOut_14_0 ? 1 : 0;
                              stackIn_15_0 = stackOut_14_0;
                              if (var14 != 0) {
                                continue L9;
                              } else {
                                L13: {
                                  if (stackIn_15_0) {
                                    pd.field_e[var8] = var10;
                                    pd.field_e[1 + var8] = var9;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var8++;
                                if (var14 == 0) {
                                  continue L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var14 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var7), "ri.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
              return;
            }
          }
        }
    }

    public ri() {
        this.field_e = ua.field_G;
        this.field_b = 1;
        this.field_c = 1;
    }

    ri(mg param0, int param1, int param2) {
        try {
            this.field_e = param0;
            this.field_b = param1;
            this.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Waiting for fonts";
    }
}
