/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static int field_b;
    static ng field_a;

    final static void a(boolean param0, int param1) {
        kd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        vb var4 = null;
        ng stackIn_2_0 = null;
        ng stackIn_3_0 = null;
        ng stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ng stackOut_1_0 = null;
        ng stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ng stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = jl.field_a;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0) {
                stackOut_3_0 = (ng) ((Object) stackIn_3_0);
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = (ng) ((Object) stackIn_2_0);
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            var4 = (vb) ((Object) ((ng) (Object) stackIn_4_0).a(stackIn_4_1 != 0));
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 == null) {
                    break L4;
                  } else {
                    vi.a(param1, var4, 1);
                    var4 = (vb) ((Object) jl.field_a.f(2));
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (!param0) {
                  break L3;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              var2 = ci.field_f.a(true);
              L5: while (true) {
                if (var2 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  ck.a(param1, 2);
                  var2 = ci.field_f.f(2);
                  if (var3 == 0) {
                    continue L5;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "vh.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != 119) {
            int[] var2 = (int[]) null;
            vh.a((byte) 39, 124, (int[]) null, 22);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, int param1, int[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        byte stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param1 + param3;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int >= param2.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = -param1 + var4_int;
                    stackIn_14_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      var5 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (-1 < (var5 ^ -1)) {
                              break L6;
                            } else {
                              stackOut_6_0 = param2[param1 + var5];
                              stackOut_6_1 = param2[var5];
                              stackIn_12_0 = stackOut_6_0;
                              stackIn_12_1 = stackOut_6_1;
                              stackIn_7_0 = stackOut_6_0;
                              stackIn_7_1 = stackOut_6_1;
                              if (var7 != 0) {
                                break L5;
                              } else {
                                L7: {
                                  if (stackIn_7_0 < stackIn_7_1) {
                                    break L7;
                                  } else {
                                    if (var7 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var6 = param2[var5];
                                param2[var5] = param2[param1 + var5];
                                param2[param1 + var5] = var6;
                                var5 = var5 - param1;
                                if (var7 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          stackOut_11_0 = var4_int;
                          stackOut_11_1 = param1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          break L5;
                        }
                        var4_int = stackIn_12_0 + stackIn_12_1;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_13_0 = param0;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              }
              if (stackIn_14_0 == -42) {
                break L0;
              } else {
                vh.a((byte) 51);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("vh.B(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = -1;
        field_a = new ng();
    }
}
