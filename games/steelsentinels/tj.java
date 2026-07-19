/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static String field_b;
    static mi field_e;
    static boolean field_a;
    static gh field_f;
    static int field_c;
    static String field_d;

    final static void a(int param0) {
        hc.a(17, 0);
        if (param0 < 111) {
            tj.a(false);
        }
    }

    final static tc a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        tc var9 = null;
        RuntimeException var9_ref = null;
        tc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        tc stackOut_2_0 = null;
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
              var9 = new tc(param6, param3, param1, param2, param0, param4, param7);
              ic.field_B.a(param5 ^ 18, var9);
              if (param5 == 17) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            vh.a(param8, var9, (byte) 122);
            stackOut_2_0 = (tc) (var9);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var9_ref);
            stackOut_4_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param7 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        tc discarded$2 = null;
        int[] var2 = null;
        field_d = null;
        field_b = null;
        field_f = null;
        if (!param0) {
          var2 = (int[]) null;
          discarded$2 = tj.a(-41, 14, -14, -105, -92, 72, 120, (int[]) null, -116);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    static {
        field_b = "Cancel";
        field_a = false;
        field_c = 0;
        field_d = "HEALTH";
    }
}
