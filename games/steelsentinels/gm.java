/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_d;
    static String field_a;
    static gh field_c;
    static wk field_b;

    final static void a(byte param0) {
        if (param0 > -87) {
            field_d = null;
            rg.field_d = new ul();
            return;
        }
        rg.field_d = new ul();
    }

    final static ef a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ef var5 = null;
        ef stackIn_4_0 = null;
        ef stackIn_7_0 = null;
        ef stackIn_10_0 = null;
        ef stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_11_0 = null;
        ef stackOut_9_0 = null;
        ef stackOut_6_0 = null;
        ef stackOut_3_0 = null;
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
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() == 0) {
                  break L1;
                } else {
                  var2_int = param1.indexOf('@');
                  if (-1 != var2_int) {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(var2_int - -1);
                    var5 = bk.a(110, var3);
                    if (var5 == null) {
                      int discarded$2 = 0;
                      stackOut_11_0 = d.a(var4);
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_9_0 = (ef) var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  } else {
                    stackOut_6_0 = ud.field_A;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
            }
            stackOut_3_0 = qm.field_f;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("gm.A(").append(1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    public static void a() {
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%1> couldn't avoid the mighty enormo-laser";
        field_a = "C";
    }
}
