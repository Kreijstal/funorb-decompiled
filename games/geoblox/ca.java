/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends hf {
    static String field_h;
    static mg field_f;
    static int field_i;
    static na field_g;

    final static nd a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        nd var5 = null;
        nd stackIn_4_0 = null;
        nd stackIn_7_0 = null;
        nd stackIn_10_0 = null;
        nd stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_11_0 = null;
        nd stackOut_9_0 = null;
        nd stackOut_6_0 = null;
        nd stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 == param0.length()) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if (var2_int != -1) {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(1 + var2_int);
                    var5 = r.a(var3, true);
                    if (var5 == null) {
                      stackOut_11_0 = fe.a(var4, false);
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_9_0 = (nd) var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  } else {
                    stackOut_6_0 = pj.field_f;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
            }
            stackOut_3_0 = fb.field_j;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("ca.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + 1 + 41);
        }
        return stackIn_12_0;
    }

    public static void b(boolean param0) {
        field_h = null;
        field_f = null;
        field_g = null;
    }

    private ca() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unpacking music";
    }
}
