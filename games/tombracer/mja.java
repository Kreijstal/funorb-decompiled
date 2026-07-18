/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mja {
    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!in.a("jaclib", param0 + 530)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 == -50) {
                stackOut_8_0 = in.a("hw3d", param0 + 530);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "mja.A(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    static {
    }
}
