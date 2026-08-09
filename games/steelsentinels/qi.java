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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-1L != (param1 ^ -1L)) {
                break L1;
              } else {
                if (param4 == null) {
                  break L1;
                } else {
                  stackIn_3_0 = new on(param4, param2);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param0) {
              stackIn_7_0 = new pg(param1, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param3 == 0) {
                  break L2;
                } else {
                  field_h = (String) null;
                  break L2;
                }
              }
              stackIn_11_0 = new fb(param1, param2);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("qi.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (me) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (me) ((Object) stackIn_7_0);
          } else {
            return (me) ((Object) stackIn_11_0);
          }
        }
    }

    final static void a(java.math.BigInteger param0, gi param1, gi param2, java.math.BigInteger param3, int param4) {
        if (param4 != 5) {
            return;
        }
        try {
            nf.a(false, param2, param3, 0, param1.field_p, param0, param1.field_t);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "qi.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_b = null;
        field_f = null;
        field_i = null;
        int var1 = 119 % ((-9 - param0) / 50);
        field_e = null;
        field_c = null;
        field_d = null;
        field_g = null;
        field_h = null;
        field_a = null;
    }

    static {
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
