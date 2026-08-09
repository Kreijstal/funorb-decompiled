/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    final static int a(int param0, int param1, int[] param2) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
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
                var13 = (int[]) null;
                tf.a(-23, -46, (int[]) null);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (param2.length <= var6_int) {
                var5 = var5 / (param2.length >> -1125813791);
                var4 = var4 / (param2.length >> -1873997695);
                var15 = new int[param2.length];
                var14 = var15;
                var6 = var14;
                var7 = 0;
                L3: while (true) {
                  if (param2.length <= var7) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var15.length + -2) {
                        var3_int = var3_int / 2;
                        stackIn_13_0 = var3_int;
                        break L0;
                      } else {
                        var8 = var15[var7] >> param0;
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("tf.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    static {
    }
}
