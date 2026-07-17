/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    final static int a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = 0;
              var5 = 0;
              if (param1 <= -25) {
                break L1;
              } else {
                var13 = null;
                int discarded$1 = tf.a(-23, -46, (int[]) null);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (param2.length <= var6_int) {
                var5 = var5 / (param2.length >> 1);
                var4 = var4 / (param2.length >> 1);
                var17 = new int[param2.length];
                var16 = var17;
                var15 = var16;
                var14 = var15;
                var6 = var14;
                var7 = 0;
                L3: while (true) {
                  if (param2.length <= var7) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var17.length + -2) {
                        var3_int = var3_int / 2;
                        stackOut_12_0 = var3_int;
                        stackIn_13_0 = stackOut_12_0;
                        break L0;
                      } else {
                        var8 = var17[var7] >> param0;
                        var9 = var6[1 + var7] >> param0;
                        var10 = var6[2 + var7] >> param0;
                        var11 = var6[var7 + 3] >> param0;
                        var3_int = var3_int + (var8 * var11 + -(var10 * var9));
                        var7 += 2;
                        continue L4;
                      }
                    }
                  } else {
                    var6[var7] = -var4 + param2[var7];
                    var6[var7 + 1] = param2[1 + var7] - var5;
                    var7 += 2;
                    continue L3;
                  }
                }
              } else {
                var7 = param2[var6_int];
                var4 = var4 + var7;
                var8 = param2[1 + var6_int];
                var5 = var5 + var8;
                var6_int += 2;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("tf.A(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    static {
    }
}
