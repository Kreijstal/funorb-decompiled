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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (param0 instanceof byte[]) {
                var4 = (byte[]) (param0);
                stackIn_6_0 = ad.a(var4, param2, param3, (byte) 53);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!(param0 instanceof nn)) {
                  if (param1 == 14381) {
                    throw new IllegalArgumentException();
                  } else {
                    stackIn_12_0 = (byte[]) null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var5 = (nn) (param0);
                  stackIn_9_0 = var5.a(param3, param2, 15747);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("iq.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    static {
    }
}
