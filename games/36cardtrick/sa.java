/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static int field_a;
    static int field_d;
    static int field_c;
    static int field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        jc.field_O.a(param7, param5, param0, param6, param3, param1, param2);
        if (param4 != 0) {
            field_c = 35;
        }
    }

    final static void a(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = Main.field_T;
        try {
          L0: {
            var2 = -116 / ((39 - param0) / 61);
            var6 = mb.field_c;
            var1 = var6;
            var3 = 0;
            var4 = var6.length;
            L1: while (true) {
              if (var4 <= var3) {
                break L0;
              } else {
                incrementValue$16 = var3;
                var3++;
                var6[incrementValue$16] = 0;
                incrementValue$17 = var3;
                var3++;
                var6[incrementValue$17] = 0;
                incrementValue$18 = var3;
                var3++;
                var6[incrementValue$18] = 0;
                incrementValue$19 = var3;
                var3++;
                var6[incrementValue$19] = 0;
                incrementValue$20 = var3;
                var3++;
                var6[incrementValue$20] = 0;
                incrementValue$21 = var3;
                var3++;
                var6[incrementValue$21] = 0;
                incrementValue$22 = var3;
                var3++;
                var6[incrementValue$22] = 0;
                incrementValue$23 = var3;
                var3++;
                var6[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "sa.B(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Main.field_T;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (1 >= param2) {
                if (-2 == (param2 ^ -1)) {
                  stackIn_11_0 = var3_int * param1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L2: {
                    if (param0 == 22316) {
                      break L2;
                    } else {
                      sa.a(-72);
                      break L2;
                    }
                  }
                  stackIn_15_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L3: {
                  if ((1 & param2 ^ -1) != -1) {
                    var3_int = var3_int * param1;
                    break L3;
                  } else {
                    break L3;
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
          throw ma.a((Throwable) ((Object) var3), "sa.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_15_0;
        }
    }

    static {
        field_b = 0;
        field_c = 0;
    }
}
