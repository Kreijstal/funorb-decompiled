/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static int field_a;
    static int field_d;
    static int field_c;
    static int field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        jc.field_O.a(param7, param5, 0, 0, param3, param1, param2);
    }

    final static void a(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          L0: {
            var2 = -58;
            var6 = mb.field_c;
            var1 = var6;
            var3 = 0;
            var4 = var6.length;
            L1: while (true) {
              if (var4 <= var3) {
                break L0;
              } else {
                int incrementValue$40 = var3;
                var3++;
                var6[incrementValue$40] = 0;
                int incrementValue$41 = var3;
                var3++;
                var6[incrementValue$41] = 0;
                int incrementValue$42 = var3;
                var3++;
                var6[incrementValue$42] = 0;
                int incrementValue$43 = var3;
                var3++;
                var6[incrementValue$43] = 0;
                int incrementValue$44 = var3;
                var3++;
                var6[incrementValue$44] = 0;
                int incrementValue$45 = var3;
                var3++;
                var6[incrementValue$45] = 0;
                int incrementValue$46 = var3;
                var3++;
                var6[incrementValue$46] = 0;
                int incrementValue$47 = var3;
                var3++;
                var6[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1_ref, "sa.B(" + -110 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        var4 = Main.field_T;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (1 >= param2) {
                if (param2 == 1) {
                  stackOut_9_0 = var3_int * param1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_11_0 = var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              } else {
                L2: {
                  if ((1 & param2) != 0) {
                    var3_int = var3_int * param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param2 = param2 >> 1;
                param1 = param1 * param1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "sa.C(" + 22316 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = 0;
    }
}
