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
        if (param0 != -6873) {
            field_f = -71;
        }
        return (-param1 & param1) == param1 ? true : false;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
            field_f = 91;
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_v) {
                  break L2;
                } else {
                  if (!param4.b(true)) {
                    stackIn_6_0 = 2188450;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 3249872;
              break L1;
            }
            var6_int = stackIn_6_0;
            this.field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_i + "</u>", param3 + param4.field_m, param1 + param4.field_j, param4.field_t, param4.field_x, var6_int, -1, this.field_b, this.field_c, this.field_e.field_s + this.field_e.field_F);
            if (param0 >= 113) {
              L3: {
                if (!param4.b(true)) {
                  break L3;
                } else {
                  L4: {
                    var7 = this.field_e.b(param4.field_i);
                    var8 = this.field_e.field_s + this.field_e.field_F;
                    var9 = param3 - -param4.field_m;
                    if (this.field_b != 2) {
                      if (-2 == (this.field_b ^ -1)) {
                        var9 = var9 + (-var7 + param4.field_t >> 1051701537);
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      var9 = var9 + (param4.field_t - var7);
                      break L4;
                    }
                  }
                  L5: {
                    var10 = param4.field_j + param1;
                    if (-3 != (this.field_c ^ -1)) {
                      if (-2 != (this.field_c ^ -1)) {
                        break L5;
                      } else {
                        var10 = var10 + (param4.field_x + -var8 >> -854277343);
                        break L5;
                      }
                    } else {
                      var10 = var10 + (-var8 + param4.field_x);
                      break L5;
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
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("ri.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
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
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
                        if (var11 >= param3) {
                          ri.a(param0, param1, param2, var8, (byte) -81, var9, param6);
                          ri.a(var10, param1, param2, param3, param4, param5, var8);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = pd.field_e[var11];
                            if (!param2) {
                              stackIn_24_0 = l.field_a[var12];
                              break L3;
                            } else {
                              stackIn_24_0 = qg.field_c[var12];
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var13 > var7_int) {
                              L5: {
                                pd.field_e[var11] = pd.field_e[var8];
                                if (var13 < var9) {
                                  var9 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              incrementValue$0 = var8;
                              var8++;
                              pd.field_e[incrementValue$0] = var12;
                              break L4;
                            } else {
                              if (var10 < var13) {
                                var10 = var13;
                                break L4;
                              } else {
                                var11++;
                                continue L2;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param3;
                L6: while (true) {
                  if (param6 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param6;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = pd.field_e[var8];
                          var10 = pd.field_e[1 + var8];
                          if (ec.a(var9, -66, param2, var10)) {
                            pd.field_e[var8] = var10;
                            pd.field_e[1 + var8] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
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
