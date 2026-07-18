/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lma {
    private static String field_z;

    final static int a(int param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            if (param1 + param0 - -param2 <= dma.field_j) {
              stackOut_3_0 = param0 + param1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (-param2 + param1 >= 0) {
                stackOut_8_0 = -param2 + param1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param3 == -16) {
                  stackOut_13_0 = dma.field_j - param2;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_11_0 = -11;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, field_z + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "lma.A(";
    }
}
