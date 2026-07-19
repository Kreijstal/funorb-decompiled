/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends tc {
    int field_m;
    static String field_p;
    int field_q;
    int field_k;
    int field_n;
    int field_o;
    int field_s;
    int field_r;
    int[] field_l;

    public static void a(int param0) {
        field_p = null;
        if (param0 <= 69) {
            aj.a(-73);
        }
    }

    final static void a(float[] param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              param0[40] = 0.5f;
              param0[61] = 30.0f;
              param0[16] = 100.0f;
              param0[43] = 0.5f;
              param0[27] = 0.0f;
              param0[50] = 7.0f;
              param0[39] = 1500.0f;
              if (param1 >= 107) {
                break L1;
              } else {
                field_p = (String) null;
                break L1;
              }
            }
            param0[7] = 1.0f;
            param0[55] = 2000.0f;
            param0[6] = 10.0f;
            param0[33] = 0.10000000149011612f;
            param0[31] = 3.0f;
            param0[18] = 400.0f;
            param0[59] = 5.0f;
            param0[34] = 0.004999999888241291f;
            param0[45] = 500.0f;
            param0[51] = 100.0f;
            param0[35] = 0.05000000074505806f;
            param0[23] = 300.0f;
            param0[38] = 5.0f;
            param0[8] = 10.0f;
            param0[1] = 0.4000000059604645f;
            param0[0] = 1.0f;
            param0[36] = 20.0f;
            param0[60] = 0.0f;
            param0[11] = 90.30000305175781f;
            param0[17] = 20.0f;
            param0[20] = 100.0f;
            param0[49] = 60.0f;
            param0[53] = 100.0f;
            param0[57] = 1.0f;
            param0[5] = 1.5f;
            param0[13] = 50.0f;
            param0[14] = 300.0f;
            param0[44] = 3.0f;
            param0[56] = 2.0f;
            param0[22] = 500.0f;
            param0[2] = 0.004999999888241291f;
            param0[52] = 50.0f;
            param0[46] = 0.10000000149011612f;
            param0[24] = 400.0f;
            param0[4] = 0.0010000000474974513f;
            param0[54] = 50.0f;
            param0[42] = 500.0f;
            param0[37] = 1.0f;
            param0[12] = 3.0f;
            param0[28] = 1.0f;
            param0[19] = 30.0f;
            param0[15] = 1.0f;
            param0[10] = 100.30000305175781f;
            param0[48] = 30.0f;
            param0[41] = 16.0f;
            param0[9] = 1.5f;
            param0[32] = 100.0f;
            param0[25] = 0.30000001192092896f;
            param0[58] = 8.0f;
            param0[30] = 1.2000000476837158f;
            param0[47] = 0.20000000298023224f;
            param0[29] = 1.0f;
            param0[21] = 80.0f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("aj.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    private aj() throws Throwable {
        throw new Error();
    }

    static {
        field_p = "Make spiritual barrier";
    }
}
