/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cd extends fl {
    static long field_t;
    static int[] field_q;
    static String field_r;
    static cn field_s;
    static String field_u;
    static int field_v;

    cd() {
    }

    public static void f() {
        field_r = null;
        field_s = null;
        field_q = null;
        field_u = null;
    }

    final static tk a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        tk var5 = null;
        tk stackIn_4_0 = null;
        tk stackIn_8_0 = null;
        tk stackIn_12_0 = null;
        tk stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_7_0 = null;
        tk stackOut_11_0 = null;
        tk stackOut_13_0 = null;
        tk stackOut_3_0 = null;
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
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() != 0) {
                  var2_int = param1.indexOf('@');
                  if (param0 == var2_int) {
                    stackOut_7_0 = mf.field_d;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    int discarded$2 = 119;
                    var5 = sf.a(var3);
                    if (var5 != null) {
                      stackOut_11_0 = (tk) var5;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    } else {
                      stackOut_13_0 = rn.a(var4, ~param0);
                      stackIn_14_0 = stackOut_13_0;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = ig.field_g;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("cd.A(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Waiting for levels";
        field_u = "The account name you use to access RuneScape and other Jagex.com games";
        field_s = new cn();
        field_v = -1;
    }
}
