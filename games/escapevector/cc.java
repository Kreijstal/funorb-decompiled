/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends hg {
    static String field_k;
    int field_m;
    int field_g;
    int field_n;
    int field_o;
    int field_i;
    static ed field_j;
    int field_h;
    static String field_l;

    final static ed[] a(int param0, mf param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ed[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4_int = 0;
            if (uc.a(param1, 120, param0, param2)) {
              int discarded$2 = 121;
              stackOut_3_0 = hf.b();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ed[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("cc.B(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + 75 + 41);
        }
        return stackIn_4_0;
    }

    public static void d() {
        field_k = null;
        field_l = null;
        field_j = null;
    }

    cc(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((cc) this).field_n = param2;
        ((cc) this).field_g = param5;
        ((cc) this).field_m = param1;
        ((cc) this).field_h = param3;
        ((cc) this).field_i = param0;
        ((cc) this).field_o = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "The Achievements system is currently unavailable.";
    }
}
