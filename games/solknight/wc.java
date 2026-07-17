/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static da field_b;
    static kb field_f;
    static int field_e;
    static int field_a;
    static String field_d;
    static int field_c;

    public static void a(boolean param0) {
        field_f = null;
        field_b = null;
        field_d = null;
    }

    final static o a(o param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        o var6 = null;
        o stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        o stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var6 = new o(param0.field_t, param0.field_p);
            var6.field_q = param0.field_r;
            var6.field_s = param0.field_q + -param0.field_p - param0.field_n;
            var6.field_r = param0.field_q;
            var6.field_n = param0.field_s;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var6.field_t) {
                stackOut_7_0 = (o) var6;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= var6.field_p) {
                    var3++;
                    continue L1;
                  } else {
                    var6.field_v[var6.field_p * var3 + var4] = param0.field_v[var3 + (param0.field_t + -1 - var4) * param0.field_p];
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("wc.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + 0 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new kb();
        field_e = 480;
        field_a = 256;
        field_d = "More suggestions";
    }
}
