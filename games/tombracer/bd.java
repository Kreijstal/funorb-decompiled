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
        hra stackIn_4_0 = null;
        hra stackIn_7_0 = null;
        hra stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        hra stackIn_24_0 = null;
        hra stackIn_38_0 = null;
        hra stackIn_42_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if ((var2_int ^ -1) == param0) {
              stackIn_4_0 = is.field_wb;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= -65) {
                if (param1.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 < var2_int) {
                      L2: {
                        var5 = param1.charAt(var4);
                        if (var5 == 46) {
                          L3: {
                            if (-1 == (var4 ^ -1)) {
                              break L3;
                            } else {
                              if (var2_int + -1 == var4) {
                                break L3;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          stackIn_38_0 = fb.field_c;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if ((tl.field_p.indexOf(var5) ^ -1) != 0) {
                            var3 = 0;
                            break L2;
                          } else {
                            stackIn_42_0 = fb.field_c;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      var4++;
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (-35 == (param1.charAt(var2_int + -1) ^ -1)) {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (var4 < -1 + var2_int) {
                        L5: {
                          var5 = param1.charAt(var4);
                          if (var5 == 92) {
                            L6: {
                              if (var3 != 0) {
                                stackIn_20_0 = 0;
                                break L6;
                              } else {
                                stackIn_20_0 = 1;
                                break L6;
                              }
                            }
                            var3 = stackIn_20_0;
                            break L5;
                          } else {
                            L7: {
                              if (34 != var5) {
                                break L7;
                              } else {
                                if (var3 != 0) {
                                  break L7;
                                } else {
                                  stackIn_24_0 = fb.field_c;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_11_0 = fb.field_c;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = rg.field_A;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var2);

            stackIn_48_1 = new StringBuilder().append("bd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L8;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_38_0;
                } else {
                  return stackIn_42_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 <= 61) {
            field_i = (nh) null;
        }
        field_j = null;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_m = param0;
            this.field_k = param4;
            this.field_g = param1;
            this.field_f = param7;
            this.field_h = param3;
            this.field_n = param5;
            if (param2 < 113) {
                bd.a(-51);
            }
            this.field_l = param6;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    bd() {
    }

    static {
        field_j = "Bonus";
    }
}
