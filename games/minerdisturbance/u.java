/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static String field_b;
    static String field_a;

    final static String a(String param0, bj param1, String param2, int param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.a((byte) 105)) {
            stackIn_2_0 = (String) (param2);
            return stackIn_2_0;
          }
          if (param3 != -7157) {
            u.a(20);
          }
          stackIn_6_0 = param0 + " - " + param1.a(param4, -118) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("u.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static int b(int param0) {
        if (param0 != -4440) {
          field_a = (String) null;
          return t.field_c;
        }
        return t.field_c;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 < 1) {
          field_b = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 != 27443) {
          return true;
        }
        return g.a((byte) -128);
    }

    static {
        field_b = "Cancel";
        field_a = "Create a free Account";
    }
}
