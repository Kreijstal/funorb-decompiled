/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static int field_f;
    static vh field_d;
    static int[] field_a;
    static String field_g;
    static int field_c;
    static String field_e;
    private static int field_b;

    public static void a() {
        field_e = null;
        field_g = null;
        field_d = null;
        field_a = null;
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          try {
            if (sj.field_w.startsWith("win")) {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param0.length()) {
                  Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  if (param1 > 86) {
                    stackOut_18_0 = 1;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  }
                } else {
                  if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            return stackIn_21_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref2;
            stackOut_22_1 = new StringBuilder().append("ll.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Ignore";
        field_g = "Previous";
        field_b = 12;
        field_f = 1 << field_b;
    }
}
