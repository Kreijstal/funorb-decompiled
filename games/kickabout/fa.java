/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends gn {
    static int field_j;
    int field_f;
    static java.awt.Frame field_k;
    int field_i;
    static String field_h;
    static String field_e;
    static String[] field_g;

    final static void b(int param0) {
        kd.field_s = false;
        if (!(dr.field_g == null)) {
            dr.field_g.a(5075);
        }
        int var1 = -60 % ((-56 - param0) / 56);
        if (!(0 == ov.field_b)) {
            td.a(29);
        }
        fb.field_I = 0;
    }

    private fa() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_g = null;
        field_k = null;
        field_h = null;
        field_e = null;
        int var1 = 81 % ((param0 - -6) / 41);
    }

    final static ut[] a(int param0, byte param1, int param2, sj param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        ut[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ut[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
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
            if (cu.a(param2, param3, param0, 122)) {
              int discarded$2 = 78;
              stackOut_5_0 = ub.i();
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (ut[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("fa.C(").append(param0).append(',').append(-89).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_h = "Confirm Password: ";
        field_e = "Open in popup window";
    }
}
