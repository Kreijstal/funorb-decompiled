/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static kb field_b;
    static long field_a;

    public static void a(int param0) {
        if (param0 != 908) {
          return;
        }
        field_b = null;
    }

    final static void a(rj param0, le param1, int param2, String param3, byte param4) {
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
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          var5_int = 0;
          if (param4 <= 89) {
            field_a = -103L;
          }
          var6 = -1;
          for (var7 = 1; param3.length() > var7; var7++) {
            var8 = param3.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + param0.field_a[0] + param1.b(param3.substring(0, var7));
            }
            if (var6 != -1) {
              param0.field_a[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param2;
              }
              param0.field_a[var7] = param0.field_a[0] + ((var5_int >> 8) + param1.b(param3.substring(0, 1 + var7)) - param1.a((char) var8));
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
          stackIn_21_1 = new StringBuilder().append("fa.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        if (param0 <= -32) {
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
        fa.a(78, -6);
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    static {
        field_b = null;
    }
}
