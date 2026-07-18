/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static String field_b;
    static int field_a;

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        rl var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 > 0) {
                var8 = new byte[param1];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param1) {
                    break L1;
                  } else {
                    var8[var5_int] = param0[param3 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                var4 = param0;
                break L1;
              }
            }
            var5 = new rl();
            var5.a(15298);
            var5.a(14027, (long)(param1 * 8), var4);
            var6 = new byte[64];
            var5.a(var6, 116, 0);
            stackOut_6_0 = (byte[]) var6;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("n.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + -5705 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(boolean param0) {
        if (param0) {
            n.a(true);
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1) {
        int discarded$0 = 170;
        wl.a(false, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
