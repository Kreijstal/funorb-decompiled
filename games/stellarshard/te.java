/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static String field_a;
    static String field_b;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -15) {
            te.a((byte) 74);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, pb param6, int param7, byte param8) {
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
            var9_int = -param5 + (param3 + param6.field_t - -param2);
            var10 = param0 + (param3 + (param2 + param6.field_t));
            var11 = param1 + (param6.field_s + (param6.field_y >> -898706559));
            ti.a(var9_int, 0, var10, var11 - -param7);
            param6.d(-1 + param2, param1 - 1, param4);
            param6.d(param2 + -1, 1 + param1, param4);
            ti.b(pk.field_i);
            ti.a(var9_int + 1, 0, 1 + var10, var11 + param7);
            param6.d(1 + param2, param1 + -1, param4);
            param6.d(param2 + 1, param1 - -1, param4);
            ti.b(pk.field_i);
            var12 = 39 / ((param8 - -29) / 63);
            var10 = param6.field_t + param6.field_v - -param2 + -param3 + -param5;
            var9_int = param2 + (param6.field_t + param6.field_v) + (-param3 + -param0);
            ti.a(var9_int, var11 - param7, var10, 480);
            param6.d(param2 - 1, param1 + -1, param4);
            param6.d(-1 + param2, 1 + param1, param4);
            ti.b(pk.field_i);
            ti.a(1 + var9_int, -param7 + var11, 1 + var10, 480);
            param6.d(1 + param2, -1 + param1, param4);
            param6.d(param2 + 1, 1 + param1, param4);
            ti.b(pk.field_i);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var9);
            stackOut_2_1 = new StringBuilder().append("te.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param6 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, pb param4, int param5, int param6, int param7, int param8) {
        try {
            vh.field_i = param1;
            i.field_a = param6;
            kk.field_o = param8;
            t.field_a = param0;
            ug.field_f = param4;
            vi.field_d = param3;
            bl.field_d = param2;
            if (param7 <= 59) {
                field_c = 117;
            }
            pk.field_g = param5;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "te.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_b = "Nuke";
        field_a = "NEW ACHIEVEMENT";
    }
}
