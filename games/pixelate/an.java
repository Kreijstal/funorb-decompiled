/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static String field_d;
    static ak field_a;
    static int[] field_c;
    static fl field_e;
    static kk field_b;

    final static void a(jl param0, int param1, byte param2, mn param3, String param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 != -92) {
            an.a(-43);
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param4.length() > var7; var7++) {
            var8 = param4.charAt(var7);
            if (var8 == 60) {
              var6 = param3.field_g[0] + ((var5_int >> 8) + param0.c(param4.substring(0, var7)));
            }
            if (var6 != -1) {
              param3.field_g[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param3.field_g[var7] = param3.field_g[0] + ((var5_int >> 8) + param0.c(param4.substring(0, var7 + 1)) - param0.a((char) var8));
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("an.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
          field_d = (String) null;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        if (param0 == -1) {
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = (kk) null;
        field_e = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_d = "<%0> has declined the invitation.";
    }
}
