/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int field_a;
    static long field_b;

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fi var6 = null;
        byte[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
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
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 0) {
                var9 = new byte[param0];
                var4 = var9;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= param0) {
                    break L1;
                  } else {
                    var9[var5] = param3[var5 + param1];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var4 = param3;
                break L1;
              }
            }
            var5 = 53 / ((47 - param2) / 35);
            var6 = new fi();
            var6.b((byte) 127);
            var6.a((long)(8 * param0), var4, 0);
            var7 = new byte[64];
            var6.a(var7, 0, (byte) 124);
            stackOut_6_0 = (byte[]) var7;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("q.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    static {
    }
}
