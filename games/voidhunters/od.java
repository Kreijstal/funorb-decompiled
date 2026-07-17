/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static int field_a;

    od(uq param0, int param1, int param2, int param3) {
    }

    final static int a(boolean param0, mj param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          if (param0) {
            if (mj.field_g != param1) {
              if (param1 == mj.field_i) {
                stackOut_26_0 = 5122;
                stackIn_27_0 = stackOut_26_0;
                return stackIn_27_0;
              } else {
                if (mj.field_c != param1) {
                  if (mj.field_f != param1) {
                    if (mj.field_e == param1) {
                      stackOut_24_0 = 5123;
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0;
                    } else {
                      if (mj.field_a != param1) {
                        if (mj.field_b == param1) {
                          stackOut_22_0 = 5131;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          if (param1 == mj.field_d) {
                            stackOut_20_0 = 5126;
                            stackIn_21_0 = stackOut_20_0;
                            return stackIn_21_0;
                          } else {
                            throw new IllegalArgumentException("");
                          }
                        }
                      } else {
                        stackOut_15_0 = 5125;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    }
                  } else {
                    stackOut_11_0 = 5121;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  stackOut_8_0 = 5124;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_4_0 = 5120;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = 25;
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("od.A(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L0;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
