/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static float[] field_b;
    static String field_d;
    static ll field_c;
    static String[] field_a;

    final static dd a(float param0, byte param1, dd param2, float param3) {
        RuntimeException var4 = null;
        qm var4_ref = null;
        qm var5 = null;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        dd var11 = null;
        qm stackIn_3_0 = null;
        qm stackIn_6_0 = null;
        dd stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        qm stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        qm stackOut_5_0 = null;
        qm stackOut_4_0 = null;
        dd stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0.0f) {
                stackOut_2_0 = param2.field_R;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = param2.a(false, param0);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var4_ref = stackIn_3_0;
              if (1.0f == param3) {
                stackOut_5_0 = param2.field_P;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = param2.a(false, param3);
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            var5 = stackIn_6_0;
            var6 = (int)((float)param2.field_Q + (float)(param2.field_M - param2.field_Q) * param0);
            var7 = (int)((float)(param2.field_M - param2.field_Q) * param3 + (float)param2.field_Q);
            var8 = param2.field_G + param0 * (-param2.field_G + param2.field_y);
            var10 = 122;
            var9 = param2.field_G + (param2.field_y - param2.field_G) * param3;
            var11 = new dd(var4_ref, var5, param2.field_k, param2.field_O, param2.field_I, param2.field_N, param2.field_C, param2.field_K, param2.field_z, param2.field_L, param2.field_A, var6, var7, param2.field_w, param2.field_s, param2.field_m, param2.field_x, param2.field_t, param2.field_q, 0.0f, var8, var9);
            var11.field_D = param2.field_D;
            var11.field_B = param2.field_B;
            var11.field_o = param2.field_o;
            stackOut_6_0 = (dd) var11;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("pb.B(").append(param0).append(',').append(-111).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 10.0f};
        field_c = new ll();
    }
}
