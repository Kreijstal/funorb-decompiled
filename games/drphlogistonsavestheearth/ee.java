/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static nh[] field_c;
    static int field_a;
    static volatile int field_d;
    static he[] field_b;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, nh param8) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var9_int = param7 + (param8.field_D + param3) + -param5;
            var10 = param7 + (param8.field_D + param3 - -param6);
            var11 = param8.field_v - (-param2 + -(param8.field_w >> 1));
            wj.d(var9_int, 0, var10, var11 - -param1);
            param8.a(param3 - 1, param2 - 1, param0);
            param8.a(-1 + param3, param2 + 1, param0);
            wj.a(ha.field_d);
            wj.d(var9_int + 1, 0, var10 - -1, var11 - -param1);
            param8.a(1 + param3, -1 + param2, param0);
            param8.a(param3 + 1, 1 + param2, param0);
            var12 = 93 / ((31 - param4) / 59);
            wj.a(ha.field_d);
            var9_int = -param7 + param3 + (param8.field_D + param8.field_y) + -param6;
            var10 = param8.field_D - -param8.field_y - -param3 - (param7 - -param5);
            wj.d(var9_int, -param1 + var11, var10, 480);
            param8.a(-1 + param3, param2 + -1, param0);
            param8.a(param3 - 1, 1 + param2, param0);
            wj.a(ha.field_d);
            wj.d(1 + var9_int, -param1 + var11, 1 + var10, 480);
            param8.a(1 + param3, -1 + param2, param0);
            param8.a(param3 + 1, 1 + param2, param0);
            wj.a(ha.field_d);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9;
            stackOut_2_1 = new StringBuilder().append("ee.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param8 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
