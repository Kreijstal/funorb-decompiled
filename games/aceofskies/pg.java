/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static byte[][] field_c;
    static ej field_d;
    static eg field_a;
    static String field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            wl.a((java.awt.Component) (Object) param0, (byte) -3);
            var2_int = 59 / ((9 - param1) / 59);
            g.a((java.awt.Component) (Object) param0, 0);
            if (null == jd.field_c) {
              break L0;
            } else {
              jd.field_c.a((java.awt.Component) (Object) param0, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("pg.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[1000][];
        field_d = new ej(4, 1, 1, 1);
        field_b = "Creating your account";
        field_a = new eg();
    }
}
