/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_e;
    static String field_c;
    static int field_d;
    static im field_b;
    static ki field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = 0;
    }

    final static qj a(String param0, boolean param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        qj stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (tg.field_c != mg.field_m) {
              L1: {
                if (kf.field_d != tg.field_c) {
                  break L1;
                } else {
                  if (!param0.equals((Object) (Object) pg.field_a)) {
                    break L1;
                  } else {
                    tg.field_c = tl.field_h;
                    stackOut_7_0 = uc.field_q;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              uc.field_q = null;
              pg.field_a = param0;
              tg.field_c = mg.field_m;
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (qj) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("lf.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + true + ')');
        }
        return (qj) (Object) stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
