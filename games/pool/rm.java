/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static boolean field_d;
    static String field_a;
    static nm field_e;
    static String field_f;
    static int field_b;
    static dd[] field_g;
    static long field_c;

    final static double[][] a(double[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        double[][] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[][] stackOut_0_0 = null;
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
            var2_int = -107 % ((param1 - 67) / 56);
            stackOut_0_0 = new double[][]{param0, new double[]{param0[0], -param0[1] + 288.0, param0[2], param0[3], 288.0 - param0[4], param0[5]}, new double[]{-param0[0] + 576.0, 288.0 - param0[1], param0[2], 576.0 - param0[3], -param0[4] + 288.0, param0[5]}, new double[]{-param0[0] + 576.0, param0[1], param0[2], -param0[3] + 576.0, param0[4], param0[5]}};
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("rm.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_f = null;
        field_e = null;
        if (param0 > -12) {
            rm.a((byte) -85);
        }
    }

    static {
        field_a = "Show private chat from my friends and opponents";
        field_f = "Yes";
        field_c = 0L;
    }
}
