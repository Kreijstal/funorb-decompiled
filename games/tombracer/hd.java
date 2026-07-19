/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static boolean[] field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 29021) {
            return;
        }
        field_b = null;
    }

    final static jua a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_9_0 = null;
        jua stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jua stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (gsa.field_y != wt.field_d) {
              L1: {
                if (param0 > 114) {
                  break L1;
                } else {
                  field_b = (int[]) null;
                  break L1;
                }
              }
              L2: {
                if (mua.field_a != wt.field_d) {
                  break L2;
                } else {
                  if (param1.equals(uaa.field_a)) {
                    wt.field_d = fta.field_c;
                    stackOut_10_0 = oo.field_t;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              oo.field_t = null;
              wt.field_d = gsa.field_y;
              uaa.field_a = param1;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("hd.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jua) ((Object) stackIn_9_0);
        } else {
          return stackIn_11_0;
        }
    }

    final static void a(int param0, int param1) {
        mga.field_i = 1000000000L / (long)param0;
        if (param1 <= 97) {
            field_a = (boolean[]) null;
        }
    }

    static {
        field_a = new boolean[64];
        field_b = new int[]{28, 0};
    }
}
