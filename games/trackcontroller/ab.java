/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static int field_a;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 98) {
          field_a = 29;
        }
    }

    final static qj a(String param0, int param1, String param2, kk param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -15383) {
            field_a = -117;
          }
          var4_int = param3.a(true, param0);
          var5 = param3.a(param2, var4_int, param1 ^ 15382);
          stackIn_3_0 = kh.a(false, var4_int, var5, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ab.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static kh a(boolean param0) {
        if (!param0) {
          return new kh(re.c(6), r.b(true));
        }
        field_a = 107;
        return new kh(re.c(6), r.b(!param0 ? true : false));
    }

    static {
        field_b = null;
    }
}
