/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static int field_a;
    static vp field_d;
    static String field_b;
    static String field_e;
    static am field_f;
    static String field_c;

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 == -85) {
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        }
        field_b = (String) null;
        field_e = null;
        field_f = null;
        field_b = null;
    }

    final static String a(String param0, int param1, int param2, String param3, db param4) {
        RuntimeException var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 4164) {
            field_c = (String) null;
          }
          if (param4.a((byte) 102)) {
            stackIn_6_0 = param3 + " - " + param4.b(25030, param1) + "%";
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) (param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("vl.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_b = "Loading...";
        field_e = "Fullscreen";
        field_c = "If you are a member, log in to start at any level you've reached.";
    }
}
