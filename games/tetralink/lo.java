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
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          var4_int = param1.length();
          if (param0 != -26750) {
            field_a = (byte[]) null;
          }
          param1.setLength(param2);
          for (var5 = var4_int; var5 < param2; var5++) {
            param1.setCharAt(var5, param3);
          }
          stackIn_7_0 = (StringBuilder) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("lo.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = "Hide chat";
        field_d = "To report a player, right-click on their name and select the option to report abuse.";
        field_c = "No players";
    }
}
