/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends vg {
    int field_f;
    int field_m;
    int field_k;
    int field_n;
    int field_h;
    static nh field_i;
    int[] field_g;
    static String field_j;
    int field_l;

    final static hra a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hra stackIn_4_0 = null;
        hra stackIn_7_0 = null;
        hra stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        hra stackIn_24_0 = null;
        hra stackIn_38_0 = null;
        hra stackIn_42_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        hra stackOut_3_0 = null;
        hra stackOut_37_0 = null;
        hra stackOut_41_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        hra stackOut_23_0 = null;
        hra stackOut_10_0 = null;
        hra stackOut_6_0 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackOut_3_0 = is.field_wb;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int <= 64) {
              if (param1.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (var4 < var2_int) {
                    L1: {
                      var5 = param1.charAt(var4);
                      if (var5 == 46) {
                        L2: {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            if (~(var2_int + -1) == ~var4) {
                              break L2;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L1;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        stackOut_37_0 = fb.field_c;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0;
                      } else {
                        if (tl.field_p.indexOf(var5) != -1) {
                          var3 = 0;
                          break L1;
                        } else {
                          stackOut_41_0 = fb.field_c;
                          stackIn_42_0 = stackOut_41_0;
                          return stackIn_42_0;
                        }
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                if (param1.charAt(var2_int + -1) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (~var4 > ~(-1 + var2_int)) {
                      L4: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_19_0 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              break L5;
                            } else {
                              stackOut_18_0 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_20_0;
                          break L4;
                        } else {
                          L6: {
                            if (34 != var5) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                stackOut_23_0 = fb.field_c;
                                stackIn_24_0 = stackOut_23_0;
                                return stackIn_24_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_10_0 = fb.field_c;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            } else {
              stackOut_6_0 = rg.field_A;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var2;
            stackOut_46_1 = new StringBuilder().append("bd.C(").append(-1).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L7;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 41);
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 <= 61) {
            field_i = null;
        }
        field_j = null;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((bd) this).field_m = param0;
            ((bd) this).field_k = param4;
            ((bd) this).field_g = param1;
            ((bd) this).field_f = param7;
            ((bd) this).field_h = param3;
            ((bd) this).field_n = param5;
            if (param2 < 113) {
                bd.a(-51);
            }
            ((bd) this).field_l = param6;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bd.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    bd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Bonus";
    }
}
