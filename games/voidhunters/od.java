/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static int field_a;

    od(uq param0, int param1, int param2, int param3) {
    }

    final static int a(boolean param0, mj param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          if (mj.field_g != param1) {
            if (param1 == mj.field_i) {
              stackOut_25_0 = 5122;
              stackIn_26_0 = stackOut_25_0;
              return stackIn_26_0;
            } else {
              if (mj.field_c != param1) {
                if (mj.field_f != param1) {
                  if (mj.field_e == param1) {
                    stackOut_23_0 = 5123;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0;
                  } else {
                    if (mj.field_a != param1) {
                      if (mj.field_b == param1) {
                        stackOut_21_0 = 5131;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      } else {
                        if (param1 == mj.field_d) {
                          stackOut_19_0 = 5126;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          throw new IllegalArgumentException("");
                        }
                      }
                    } else {
                      stackOut_14_0 = 5125;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  }
                } else {
                  stackOut_10_0 = 5121;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_7_0 = 5124;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          } else {
            stackOut_3_0 = 5120;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var2;
            stackOut_28_1 = new StringBuilder().append("od.A(").append(true).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L0;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
