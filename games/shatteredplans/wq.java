/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    boolean field_a;
    static String field_c;
    String field_b;
    String field_d;

    final static Object a(boolean param0, byte param1, byte[] param2) {
        cb var3 = null;
        RuntimeException var3_ref = null;
        cb stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        cb stackOut_5_0 = null;
        byte[] stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length > 136) {
                var3 = new cb();
                ((le) (Object) var3).a(param2, (byte) 95);
                stackOut_5_0 = (cb) var3;
                stackIn_6_0 = stackOut_5_0;
                return (Object) (Object) stackIn_6_0;
              } else {
                if (param1 < -124) {
                  stackOut_10_0 = ck.a(param2, false);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("wq.A(").append(false).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return (Object) (Object) stackIn_11_0;
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 68;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "System captured<br><col=2F5FBF>(In colony colour)</col>";
    }
}
