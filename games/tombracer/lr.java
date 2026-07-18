/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends RuntimeException {
    String field_d;
    static jea field_b;
    Throwable field_a;
    static String field_e;
    static int field_c;

    final static int a(una param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          if (param0 == una.field_a) {
            stackOut_22_0 = 5120;
            stackIn_23_0 = stackOut_22_0;
            return stackIn_23_0;
          } else {
            if (param0 != una.field_k) {
              if (param0 != una.field_m) {
                if (una.field_g != param0) {
                  if (una.field_f == param0) {
                    stackOut_20_0 = 5123;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0;
                  } else {
                    if (param0 == una.field_i) {
                      stackOut_18_0 = 5125;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    } else {
                      if (param0 != una.field_l) {
                        if (param0 != una.field_h) {
                          throw new IllegalArgumentException("");
                        } else {
                          stackOut_16_0 = 5126;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0;
                        }
                      } else {
                        stackOut_13_0 = 5131;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = 5121;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = 5124;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = 5122;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2;
            stackOut_26_1 = new StringBuilder().append("lr.B(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L0;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L0;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + 5126 + ')');
        }
    }

    final static float a(float param0, int param1, float param2, float param3) {
        if (param1 != 5122) {
          field_b = null;
          return param0 * (-param3 + param2) + param3;
        } else {
          return param0 * (-param3 + param2) + param3;
        }
    }

    lr(Throwable param0, String param1) {
        ((lr) this).field_a = param0;
        ((lr) this).field_d = param1;
    }

    public static void a() {
        field_e = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Nutritious and delicious, there are rumours that this foul-smelling concoction has helpful effects when heated.";
    }
}
