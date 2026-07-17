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
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
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
            int discarded$1 = ((ri) this).field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_i + "</u>", param3 + param4.field_m, param1 + param4.field_j, param4.field_t, param4.field_x, var6_int, -1, ((ri) this).field_b, ((ri) this).field_c, ((ri) this).field_e.field_s + ((ri) this).field_e.field_F);
            if (param0 >= 113) {
              L3: {
                if (!param4.b(true)) {
                  break L3;
                } else {
                  L4: {
                    var7 = ((ri) this).field_e.b(param4.field_i);
                    var8 = ((ri) this).field_e.field_s + ((ri) this).field_e.field_F;
                    var9 = param3 - -param4.field_m;
                    if (((ri) this).field_b != 2) {
                      if (((ri) this).field_b == 1) {
                        var9 = var9 + (-var7 + param4.field_t >> 1);
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
                    if (-3 != ((ri) this).field_c) {
                      if (-2 != ((ri) this).field_c) {
                        break L5;
                      } else {
                        var10 = var10 + (param4.field_x + -var8 >> 1);
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("ri.T(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 <= param6) {
              return;
            } else {
              if (param6 - -1 < param3) {
                L1: {
                  if (param6 - -5 >= param3) {
                    break L1;
                  } else {
                    if (param0 == param5) {
                      break L1;
                    } else {
                      var7_int = (1 & (param5 & param0)) + ((param0 >> 1) + (param5 >> 1));
                      var8 = param6;
                      var9 = param0;
                      var10 = param5;
                      var11 = param6;
                      L2: while (true) {
                        if (var11 >= param3) {
                          ri.a(param0, param1, param2, var8, (byte) -81, var9, param6);
                          ri.a(var10, param1, param2, param3, param4, param5, var8);
                          break L0;
                        } else {
                          L3: {
                            var12 = pd.field_e[var11];
                            if (!param2) {
                              stackOut_23_0 = l.field_a[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = qg.field_c[var12];
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          var13 = stackIn_24_0;
                          if (var13 > var7_int) {
                            L4: {
                              pd.field_e[var11] = pd.field_e[var8];
                              if (var13 < var9) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            int incrementValue$1 = var8;
                            var8++;
                            pd.field_e[incrementValue$1] = var12;
                            var11++;
                            continue L2;
                          } else {
                            L5: {
                              if (var10 >= var13) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param3;
                L6: while (true) {
                  if (param6 >= var7_int) {
                    return;
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
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var7, "ri.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    public ri() {
        ((ri) this).field_e = ua.field_G;
        ((ri) this).field_b = 1;
        ((ri) this).field_c = 1;
    }

    ri(mg param0, int param1, int param2) {
        try {
            ((ri) this).field_e = param0;
            ((ri) this).field_b = param1;
            ((ri) this).field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ri.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for fonts";
    }
}
