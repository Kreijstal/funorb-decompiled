/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rea extends bw {
    static sna field_g;
    double field_o;
    double field_m;
    int field_n;
    double field_j;
    double field_l;
    int field_i;
    static String field_f;
    static kv field_k;
    int field_h;

    public static void c(byte param0) {
        field_g = null;
        field_k = null;
        field_f = null;
    }

    final static void a(eaa param0, int param1, int param2, byte param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        rea var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var6_int = -35 % ((param3 - -3) / 43);
            var7 = (rea) (Object) param0.b((byte) 90);
            L1: while (true) {
              if (var7 == null) {
                break L0;
              } else {
                L2: {
                  var8 = (630 & (int)var7.field_m * 8357 - -(326565 * (int)var7.field_j)) + (var7.field_n >> 1);
                  if (var8 <= 256) {
                    break L2;
                  } else {
                    var8 = 256;
                    break L2;
                  }
                }
                qna.field_l[var7.field_i].a((int)var7.field_m + param2 - 128, param5 + ((int)var7.field_l - 80), 4 * var7.field_n);
                var7 = (rea) (Object) param0.c(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("rea.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    rea(int param0, int param1, int param2, int param3) {
        ((rea) this).field_l = (double)param2;
        ((rea) this).field_i = param3;
        ((rea) this).field_j = (double)param1;
        ((rea) this).field_m = (double)param0;
        ((rea) this).field_h = -2;
        ((rea) this).field_n = 256;
        ((rea) this).field_o = 0.0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Join";
    }
}
