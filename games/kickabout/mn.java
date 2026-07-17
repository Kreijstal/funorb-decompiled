/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn implements gj {
    static rv field_c;
    static String field_d;
    static int[] field_b;
    static int field_a;
    static ff field_e;
    static String field_f;

    public static void a(byte param0) {
        int var1 = 0;
        field_c = null;
        field_d = null;
        field_b = null;
        field_f = null;
        field_e = null;
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        ut var9 = null;
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
            L1: {
              var7 = -123 / ((59 - param0) / 53);
              var6_int = param3.field_t + param4;
              var8 = param3.field_g + param2;
              kj.a(12105912, var8, var6_int, param3.field_i, param3.field_n);
              var9 = jc.field_g[1];
              if (!(param3 instanceof wi)) {
                break L1;
              } else {
                if (!((wi) (Object) param3).field_A) {
                  break L1;
                } else {
                  var9.c((-var9.field_o + param3.field_n >> 1) + (1 + var6_int), 1 + (var8 + (-var9.field_v + param3.field_i >> 1)), 256);
                  break L1;
                }
              }
            }
            if (!param3.b(44)) {
              break L0;
            } else {
              ob.b(2, param3.field_n - 4, var8 + 2, -4 + param3.field_i, 2 + var6_int);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("mn.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Clan";
        field_a = 256;
        field_b = new int[4];
        field_c = new rv();
        field_e = new ff(11, 0, 1, 2);
        field_f = "Accept";
    }
}
