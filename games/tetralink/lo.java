/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String field_b;
    static byte[] field_a;
    static String field_d;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
        if (param0 != 4666) {
            lo.a(83);
        }
    }

    final static StringBuilder a(int param0, StringBuilder param1, int param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var4_int = param1.length();
              if (param0 == -26750) {
                break L1;
              } else {
                field_a = (byte[]) null;
                break L1;
              }
            }
            param1.setLength(param2);
            var5 = var4_int;
            L2: while (true) {
              if (var5 >= param2) {
                stackIn_7_0 = (StringBuilder) (param1);
                break L0;
              } else {
                param1.setCharAt(var5, param3);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("lo.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_b = "Hide chat";
        field_d = "To report a player, right-click on their name and select the option to report abuse.";
        field_c = "No players";
    }
}
