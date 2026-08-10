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
        if (param0) {
            field_b = (da) null;
        }
    }

    final static o a(o param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        o var6 = null;
        o stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var6 = new o(param0.field_t, param0.field_p);
            var6.field_q = param0.field_r;
            var6.field_s = param0.field_q + -param0.field_p - param0.field_n;
            var6.field_r = param0.field_q;
            var6.field_n = param0.field_s;
            var3 = param1;
            L1: while (true) {
              if (var3 >= var6.field_t) {
                stackIn_8_0 = (o) (var6);
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
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("wc.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    static {
        field_f = new kb();
        field_e = 480;
        field_a = 256;
        field_d = "More suggestions";
    }
}
