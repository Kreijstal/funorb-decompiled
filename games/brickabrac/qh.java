/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static int field_a;
    static mh field_j;
    static nc field_b;
    static int field_d;
    static byte[] field_h;
    static int field_f;
    static jp field_e;
    static String[] field_i;
    static jp field_c;
    static String field_g;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_c = null;
        field_i = null;
        field_g = null;
        if (param0 >= 91) {
          field_h = null;
          field_b = null;
          return;
        }
        field_c = (jp) null;
        field_h = null;
        field_b = null;
    }

    final static void a(int param0, int param1, jp param2, int param3, jp param4, int param5, int param6, int param7, jp param8, int param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        try {
          param8.d((param3 * 5 >> 16) + ((-param8.field_x + param6) / 2 + param7), param9);
          param2.c(param7 - (-((param6 - param2.field_x) / 2) - (10 * param3 >> 16)), -param2.field_z + param1 + param9 + 480);
          if (param5 < 2) {
            return;
          }
          param4.c((20 * param3 >> 16) + param7 + (param6 - param4.field_x) / 2, param9 - (-param1 - 480) - param4.field_z);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_6_0 = var10;
          stackIn_6_1 = new StringBuilder().append("qh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param9).append(')').toString());
        }
    }

    static {
        field_a = 64;
        field_h = new byte[]{(byte)4};
        field_f = 0;
        field_g = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
