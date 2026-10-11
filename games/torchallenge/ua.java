/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_a;
    static ge[] field_d;
    static volatile boolean field_c;
    static String field_b;

    final static void a(int param0, byte param1, eg param2, String param3, qi param4) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          if (param1 != -113) {
            ua.a(125);
          }
          for (var7 = 1; var7 < param3.length(); var7++) {
            var8 = param3.charAt(var7);
            if (60 == var8) {
              var6 = param4.field_g[0] + (var5_int >> 8) + param2.a(param3.substring(0, var7));
            }
            if (var6 != -1) {
              param4.field_g[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param0;
              }
              param4.field_g[var7] = (var5_int >> 8) + param4.field_g[0] + param2.a(param3.substring(0, 1 + var7)) - param2.a((char) var8);
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        int var1 = 68 % ((18 - param0) / 56);
        field_b = null;
    }

    static {
        field_a = "Accept";
        field_c = false;
        field_b = "Passwords must be between 5 and 20 letters and numbers";
    }
}
