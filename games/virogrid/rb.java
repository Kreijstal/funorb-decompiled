/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static String field_b;
    static int field_c;
    static int[] field_a;
    static String field_d;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static km a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, e param8, int param9, int param10, int param11, int param12) {
        km var13 = null;
        RuntimeException var13_ref = null;
        km stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        km stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var13 = new km(0L, (km) null);
            var13.field_vb = wa.a((byte) 60, param11, param3);
            var13.field_x = wa.a((byte) -111, param6, param4);
            var13.field_T = wa.a((byte) 37, param7, param2);
            var13.field_cb = wa.a((byte) -89, param0, param12);
            var13.field_L = wa.a((byte) -86, param9, param10);
            var13.field_E = param5;
            var13.field_C = param8;
            stackOut_2_0 = (km) var13;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var13_ref;
            stackOut_4_1 = new StringBuilder().append("rb.A(").append(param0).append(',').append(-4841).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param8 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_3_0;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Accept <%0> into this game";
        field_d = "Toggle fullscreen mode";
    }
}
