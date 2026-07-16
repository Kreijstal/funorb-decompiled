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

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        field_d = null;
        field_a = null;
        if (param0 > -64) {
            field_e = null;
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (sj.field_w.startsWith("win")) {
              L1: {
                if (param0.startsWith("http://")) {
                  break L1;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L2: while (true) {
                if (var3 >= param0.length()) {
                  Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  if (param1 > 86) {
                    stackOut_18_0 = 1;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  }
                } else {
                  if ((var2.indexOf((int) param0.charAt(var3)) ^ -1) == 0) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_19_0 != 0;
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
