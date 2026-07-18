/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static wk field_c;
    static at field_a;
    static at field_e;
    static int field_d;
    static String field_b;

    final static void a(int param0, int param1, on param2) {
        bv var3 = null;
        try {
            var3 = vl.field_n;
            var3.h(32161, 5);
            var3.b(1, 2);
            var3.b(1, 0);
            var3.b(1, param2.field_l);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "s.A(" + 127 + ',' + 5 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_12_0 = null;
        String stackOut_19_0 = null;
        String stackOut_23_0 = null;
        Object stackOut_28_0 = null;
        String stackOut_26_0 = null;
        String stackOut_15_0 = null;
        String stackOut_8_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param2 != 1) {
              if (2 == param2) {
                stackOut_5_0 = fo.a(4800, ea.field_d, new String[1]);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param2 != 3) {
                  if (param2 == 4) {
                    stackOut_12_0 = fo.a(4800, pp.field_X, new String[1]);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (param2 != 5) {
                      if (param2 == 6) {
                        stackOut_19_0 = fo.a(4800, di.field_j, new String[1]);
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (param2 == 7) {
                          stackOut_23_0 = fo.a(4800, bh.field_I, new String[1]);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (param2 != 8) {
                            stackOut_28_0 = null;
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            stackOut_26_0 = fo.a(4800, oc.field_Nb, new String[1]);
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0;
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = fo.a(4800, ot.field_H, new String[1]);
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                } else {
                  stackOut_8_0 = fo.a(4800, m.field_b, new String[1]);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = fo.a(4800, kf.field_B, new String[1]);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("s.B(").append(false).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L1;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_29_0;
    }

    public static void a() {
        field_a = null;
        field_c = null;
        field_e = null;
        int var1 = -61;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new at();
        field_e = new at();
        field_b = "Achievements";
    }
}
