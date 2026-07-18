/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String field_a;
    static String field_b;
    static int[] field_c;

    final static wd a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        wd stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (mh.field_b != du.field_d) {
              L1: {
                if (mh.field_b != lm.field_d) {
                  break L1;
                } else {
                  if (param1.equals((Object) (Object) jh.field_j)) {
                    mh.field_b = nb.field_i;
                    stackOut_8_0 = vl.field_k;
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              jh.field_j = param1;
              mh.field_b = du.field_d;
              vl.field_k = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (wd) (Object) stackIn_7_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("ji.B(").append(0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    final static lk a(boolean param0) {
        if (!param0) {
          L0: {
            lk discarded$8 = ji.a(false);
            if (wi.field_f == null) {
              wi.field_f = new lk(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.field_H, -1, 2147483647, true);
              break L0;
            } else {
              break L0;
            }
          }
          return wi.field_f;
        } else {
          L1: {
            if (wi.field_f == null) {
              wi.field_f = new lk(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.field_H, -1, 2147483647, true);
              break L1;
            } else {
              break L1;
            }
          }
          return wi.field_f;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This item can only be used on your own units.";
        field_b = "Set up new game";
        field_c = new int[8192];
    }
}
