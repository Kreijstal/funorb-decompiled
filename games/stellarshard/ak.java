/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static boolean field_a;
    static volatile int field_e;
    static bh field_d;
    static int[] field_c;
    static String field_b;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (!param0) {
          field_e = -85;
        }
    }

    final static String a(String param0, String param1, pf param2, byte param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.a((byte) -36)) {
            stackIn_3_0 = (String) (param1);
            return stackIn_3_0;
          }
          if (param3 == 51) {
            stackIn_8_0 = param4 + " - " + param2.b(0, param0) + "%";
            return stackIn_8_0;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ak.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_e = -1;
        field_a = false;
        field_d = new bh("usename");
        field_b = "Connection lost - attempting to reconnect";
    }
}
