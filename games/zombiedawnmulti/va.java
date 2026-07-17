/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static String field_b;
    static int field_a;

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          try {
            if (go.field_l.startsWith("win")) {
              L0: {
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (param1.startsWith("https://")) {
                    break L0;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
              L1: {
                var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                if (param0 == 9805) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              var3 = 0;
              L2: while (true) {
                if (param1.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                } else {
                  if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                    var3++;
                    continue L2;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            return stackIn_19_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref2;
            stackOut_20_1 = new StringBuilder().append("va.C(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static void a(byte param0) {
        if (param0 != 62) {
          field_b = null;
          kn.a(-1431, true, am.field_a, mc.field_g);
          bl.field_h = true;
          return;
        } else {
          kn.a(-1431, true, am.field_a, mc.field_g);
          bl.field_h = true;
          return;
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 != -59) {
            va.a((byte) -88);
            return jm.a(param1, -23936, param2, param3);
        }
        return jm.a(param1, -23936, param2, param3);
    }

    public static void a(int param0) {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Powerups with this modifier will kill ANYTHING! Try it on Fireball for a show.";
        field_a = 0;
    }
}
