/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    private t[] field_d;
    static boolean field_b;
    static int field_c;
    static String field_a;

    final static am a(int param0, fj param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        am var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        am stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            int discarded$2 = param1.i((byte) -101);
            var2_int = param1.i((byte) -101);
            var3 = tj.a(var2_int, 37);
            var3.field_k = param1.i((byte) -101);
            var4 = param1.i((byte) -101);
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                var3.a((byte) 125);
                stackOut_6_0 = (am) var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var6 = param1.i((byte) -101);
                var3.a(param1, 35, var6);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("fn.B(").append(-58).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    fn(t[] param0) {
        try {
            ((fn) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "fn.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_a = null;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 84 / ((param3 - -59) / 54);
        rh.a(param0, param1, (byte) 71, param4, param2, ((fn) this).field_d);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "Waiting for sound effects";
    }
}
