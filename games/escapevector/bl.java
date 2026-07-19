/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends hg {
    bl field_k;
    int field_i;
    static String[] field_l;
    static int field_h;
    int field_n;
    int field_g;
    int field_j;
    int field_m;

    final static te[] a(int param0, int param1, mf param2, int param3) {
        te[] discarded$2 = null;
        RuntimeException var4 = null;
        mf var5 = null;
        te[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        te[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (uc.a(param2, 100, param3, param0)) {
              L1: {
                if (param1 == 255) {
                  break L1;
                } else {
                  var5 = (mf) null;
                  discarded$2 = bl.a(49, -40, (mf) null, 15);
                  break L1;
                }
              }
              stackOut_5_0 = fg.a(13029);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("bl.A(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != 255) {
            bl.d(125);
        }
    }

    bl(int param0, int param1, int param2, int param3, int param4) {
        this.field_i = param1;
        this.field_g = param2;
        this.field_j = param3;
        this.field_m = param0;
        this.field_n = param4;
    }

    static {
        field_l = new String[255];
    }
}
