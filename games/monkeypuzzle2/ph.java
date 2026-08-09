/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static te field_b;
    static le field_d;
    static String field_a;
    static int field_c;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 1) {
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!bg.a(4826, param2)) {
              if (sg.a(param2, false)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (tl.a(0, param2)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (0 != param0.length()) {
                    if (qj.a(param2, false, param0)) {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var3_int = -121 % ((param1 - 42) / 59);
                      if (!ue.a(param2, param0, (byte) -84)) {
                        if (!di.a(95, param0, param2)) {
                          stackIn_25_0 = 1;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackIn_23_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("ph.A(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L1;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L2;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0 != 0;
                    } else {
                      return stackIn_25_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_b = new te(14, 0, 4, 1);
        field_a = "Next";
    }
}
