/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq {
    final static byte[] a(Object param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        nn var5 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_5_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          if (param0 != null) {
            if (param0 instanceof byte[]) {
              var4 = (byte[]) param0;
              int discarded$2 = 53;
              stackOut_5_0 = ad.a(var4, 32768, param3);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              if (!(param0 instanceof nn)) {
                throw new IllegalArgumentException();
              } else {
                var5 = (nn) param0;
                stackOut_8_0 = var5.a(param3, 32768, 15747);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("iq.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L0;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L0;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 14381 + 44 + 32768 + 44 + param3 + 41);
        }
    }

    static {
    }
}
