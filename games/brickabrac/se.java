/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends nm {
    static int[] field_j;
    static String field_l;
    byte[] field_i;
    static jp field_k;

    final static jp[] a(int param0, byte param1, int param2) {
        boolean discarded$2 = false;
        CharSequence var4 = null;
        if (param1 != -18) {
          var4 = (CharSequence) null;
          discarded$2 = se.a(21, (CharSequence) null);
          return hn.a(param2, param0, 1, param1 ^ 24);
        } else {
          return hn.a(param2, param0, 1, param1 ^ 24);
        }
    }

    public static void a(int param0) {
        field_j = null;
        int var1 = 10 / ((param0 - -33) / 35);
        field_k = null;
        field_l = null;
    }

    final static boolean a(int param0, CharSequence param1) {
        jp[] discarded$2 = null;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 == 17165) {
                break L1;
              } else {
                discarded$2 = se.a(-74, (byte) 25, 127);
                break L1;
              }
            }
            stackOut_2_0 = jd.a((byte) 122, false, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("se.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    se(byte[] param0) {
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "se.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new int[]{17, 18, 8};
        field_l = "Go Back";
    }
}
