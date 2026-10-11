/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int field_a;
    static o[] field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
          String var2 = (String) null;
          lk.a(47, (vd) null, 92, (fg) null, (String) null);
        }
    }

    final static void a(int param0, vd param1, int param2, fg param3, String param4) {
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = wizardrun.field_H;
        try {
          var5_int = 0;
          var6 = -1;
          var7 = -117 % ((param0 - 0) / 57);
          for (var8 = 1; var8 < param4.length(); var8++) {
            var9 = param4.charAt(var8);
            if (var9 == 60) {
              var6 = param3.field_e[0] + (var5_int >> 8) + param1.b(param4.substring(0, var8));
            }
            if (-1 != var6) {
              param3.field_e[var8] = var6;
            } else {
              if (var9 == 32) {
                var5_int = var5_int + param2;
              }
              param3.field_e[var8] = param3.field_e[0] + (var5_int >> 8) + (param1.b(param4.substring(0, 1 + var8)) - param1.a((char) var9));
            }
            if (var9 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("lk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_a = 0;
    }
}
