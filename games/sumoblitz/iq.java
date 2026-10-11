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
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param0 instanceof byte[]) {
            var4 = (byte[]) (param0);
            stackIn_6_0 = ad.a(var4, param2, param3, (byte) 53);
            return stackIn_6_0;
          }
          if (param0 instanceof nn) {
            var5 = (nn) (param0);
            stackIn_9_0 = var5.a(param3, param2, 15747);
            return stackIn_9_0;
          }
          if (param1 == 14381) {
            throw new IllegalArgumentException();
          }
          stackIn_12_0 = (byte[]) null;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("iq.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
