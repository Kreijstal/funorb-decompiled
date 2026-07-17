/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String field_h;
    static String field_e;
    static wk[] field_a;
    static kf field_d;
    static String field_b;
    static int[] field_f;
    static String field_g;
    static boolean field_l;
    static ud field_j;
    static boolean field_k;
    static gh field_c;
    static wk field_i;

    final static me a(boolean param0, long param1, String param2, int param3, String param4) {
        RuntimeException var6 = null;
        on stackIn_3_0 = null;
        pg stackIn_7_0 = null;
        fb stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        on stackOut_2_0 = null;
        pg stackOut_6_0 = null;
        fb stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != 0L) {
                break L1;
              } else {
                if (param4 == null) {
                  break L1;
                } else {
                  stackOut_2_0 = new on(param4, param2);
                  stackIn_3_0 = stackOut_2_0;
                  return (me) (Object) stackIn_3_0;
                }
              }
            }
            if (param0) {
              stackOut_6_0 = new pg(param1, param2);
              stackIn_7_0 = stackOut_6_0;
              return (me) (Object) stackIn_7_0;
            } else {
              L2: {
                if (param3 == 0) {
                  break L2;
                } else {
                  field_h = null;
                  break L2;
                }
              }
              stackOut_10_0 = new fb(param1, param2);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("qi.C(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param3).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return (me) (Object) stackIn_11_0;
    }

    final static void a(java.math.BigInteger param0, gi param1, gi param2, java.math.BigInteger param3, int param4) {
        try {
            nf.a(false, param2, param3, 0, param1.field_p, param0, param1.field_t);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "qi.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + 5 + 41);
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_b = null;
        field_f = null;
        field_i = null;
        int var1 = 0;
        field_e = null;
        field_c = null;
        field_d = null;
        field_g = null;
        field_h = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "The <%0> has already been engineered.";
        field_d = null;
        field_h = "Suggested names: ";
        field_j = null;
        field_l = false;
        field_g = "Message game";
        field_b = "Month";
        field_f = new int[]{2, 20, 21, 6, 37, 45, 5, 11, 13};
    }
}
