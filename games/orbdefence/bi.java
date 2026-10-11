/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static byte[] field_c;
    static String field_a;
    static String field_b;
    static String field_d;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 72 % ((-47 - param0) / 37);
        field_a = null;
        field_d = null;
    }

    final static int a(CharSequence param0, char param1, int param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param0.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param0.charAt(var5) == param1) {
              var3_int++;
            }
          }
          if (param2 < 123) {
            field_c = (byte[]) null;
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("bi.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = "SPLITTO";
        field_c = new byte[520];
        field_d = "Win";
        field_b = "Go Back";
    }
}
