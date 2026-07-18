/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static nh field_d;
    static String[] field_e;
    static gk field_c;
    static String field_g;
    static sa field_a;
    static int field_f;
    static String[] field_b;

    public static void a() {
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
        field_g = null;
        field_a = null;
    }

    final static vi a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        vi var5 = null;
        vi stackIn_4_0 = null;
        vi stackIn_9_0 = null;
        vi stackIn_12_0 = null;
        vi stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_13_0 = null;
        vi stackOut_11_0 = null;
        vi stackOut_8_0 = null;
        vi stackOut_3_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length()) {
                  var2_int = param0.indexOf('@');
                  if (var2_int != -1) {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int - -1);
                    var5 = qg.b((byte) 71, var3);
                    if (var5 == null) {
                      int discarded$2 = -1;
                      stackOut_13_0 = pd.a(var4);
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    } else {
                      stackOut_11_0 = (vi) var5;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    }
                  } else {
                    stackOut_8_0 = qj.field_e;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = dm.field_A;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("bc.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + -3303 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "No highscores";
        field_a = new sa(14, 0, 4, 1);
    }
}
