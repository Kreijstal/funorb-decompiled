/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends le {
    static String field_o;
    static String field_l;
    int field_q;
    int field_i;
    int field_r;
    static int field_p;
    int field_h;
    int field_m;
    static int field_n;
    static byte[][][] field_j;
    int field_k;

    public static void a(int param0) {
        int var1 = 74 % ((-19 - param0) / 33);
        field_l = null;
        field_o = null;
        field_j = null;
    }

    final static v a(int param0, dj param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param2 == -28490) {
              break L0;
            } else {
              wg.a(-121);
              break L0;
            }
          }
          if (ph.a(param3, 31043, param0, param1)) {
            return fe.b(true);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("wg.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    wg(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((wg) this).field_i = param0;
        ((wg) this).field_h = param5;
        ((wg) this).field_k = param3;
        ((wg) this).field_m = param4;
        ((wg) this).field_r = param1;
        ((wg) this).field_q = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "End of Free Game";
        field_l = "Sound: ";
    }
}
