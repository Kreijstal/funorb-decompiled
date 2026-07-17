/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends RuntimeException {
    static int field_d;
    Throwable field_b;
    String field_c;
    static String field_a;
    static int field_e;

    public static void a() {
        field_a = null;
        int var1 = 74;
    }

    dd(Throwable param0, String param1) {
        ((dd) this).field_c = param1;
        ((dd) this).field_b = param0;
    }

    final static am a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        am stackIn_3_0 = null;
        am stackIn_6_0 = null;
        am stackIn_10_0 = null;
        int stackIn_19_0 = 0;
        am stackIn_23_0 = null;
        am stackIn_36_0 = null;
        am stackIn_41_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_40_0 = null;
        am stackOut_35_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        am stackOut_22_0 = null;
        am stackOut_9_0 = null;
        am stackOut_5_0 = null;
        am stackOut_2_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 != var2_int) {
            if (var2_int <= 64) {
              if (34 != param0.charAt(0)) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (~var2_int < ~var4) {
                    L1: {
                      var5 = param0.charAt(var4);
                      if (var5 != 46) {
                        if (-1 == qd.field_b.indexOf(var5)) {
                          stackOut_40_0 = lh.field_c;
                          stackIn_41_0 = stackOut_40_0;
                          return stackIn_41_0;
                        } else {
                          var3 = 0;
                          break L1;
                        }
                      } else {
                        L2: {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            if (~var4 == ~(var2_int + -1)) {
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
                        stackOut_35_0 = lh.field_c;
                        stackIn_36_0 = stackOut_35_0;
                        return stackIn_36_0;
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                if (param0.charAt(-1 + var2_int) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (var4 < -1 + var2_int) {
                      L4: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_18_0 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              break L5;
                            } else {
                              stackOut_17_0 = 1;
                              stackIn_19_0 = stackOut_17_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_19_0;
                          break L4;
                        } else {
                          L6: {
                            if (var5 != 34) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                break L6;
                              } else {
                                stackOut_22_0 = lh.field_c;
                                stackIn_23_0 = stackOut_22_0;
                                return stackIn_23_0;
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
                  stackOut_9_0 = lh.field_c;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_5_0 = wk.field_f;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } else {
            stackOut_2_0 = si.field_s;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var2;
            stackOut_45_1 = new StringBuilder().append("dd.B(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L7;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L7;
            }
          }
          throw la.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 44 + 0 + 41);
        }
    }

    final static void a(int param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 characters long";
        field_e = 0;
    }
}
