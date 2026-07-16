/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_a;
    int field_c;
    static String field_b;
    int field_e;
    static int field_d;

    final static boolean a(String param0, byte param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var4 = stellarshard.field_B;
        try {
          L0: {
            if (ej.field_k.startsWith("win")) {
              L1: {
                if (param0.startsWith("http://")) {
                  break L1;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              if (param1 == -5) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length() <= var3) {
                    Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                    stackOut_18_0 = 1;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    if (-1 != var2.indexOf((int) param0.charAt(var3))) {
                      var3++;
                      continue L2;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_19_0 != 0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = -88 / ((37 - param0) / 52);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    li(int param0, int param1, int param2, int param3) {
        ((li) this).field_c = param3;
        ((li) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Members' Benefits";
        field_b = "Menu";
    }
}
