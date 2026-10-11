/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_c;
    static dd field_b;
    static int[] field_d;
    static int field_a;

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          var2_int = param0.charAt(0);
          for (var3 = 1; var3 < param0.length(); var3++) {
            if (~param0.charAt(var3) != ~var2_int) {
              return false;
            }
          }
          if (param1 == 19) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("fl.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 99 % ((param0 + 57) / 50);
        field_d = null;
    }

    static {
        field_c = "Loading...";
        field_d = new int[8192];
    }
}
