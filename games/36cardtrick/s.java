/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_b;
    static String field_a;
    static int field_c;
    static j field_d;

    final static void a(ee param0, byte param1, int param2, di param3, String param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        try {
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param4.length(); var7++) {
            var8 = param4.charAt(var7);
            if (var8 == 60) {
              var6 = param3.field_a[0] + (var5_int >> 8) + param0.a(param4.substring(0, var7));
            }
            if (-1 != var6) {
              param3.field_a[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param2;
              }
              param3.field_a[var7] = param3.field_a[0] + ((var5_int >> 8) + param0.a(param4.substring(0, var7 + 1)) - param0.a((char) var8));
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          if (param1 != 61) {
            field_a = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("s.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 30235) {
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Passwords must be between 5 and 20 characters long";
        field_a = "Play free version";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$05bb3be3c57b(ee param0, int param1, int param2, di param3, String param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        try {
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; var7 < param4.length(); var7++) {
            var8 = param4.charAt(var7);
            if (var8 == 60) {
              var6 = param3.field_a[0] + (var5_int >> 8) + param0.a(param4.substring(0, var7));
            }
            if (-1 != var6) {
              param3.field_a[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param2;
              }
              param3.field_a[var7] = param3.field_a[0] + ((var5_int >> 8) + param0.a(param4.substring(0, var7 + 1)) - param0.a((char) var8));
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          if (param1 != 61) {
            field_a = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("s.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }
}
