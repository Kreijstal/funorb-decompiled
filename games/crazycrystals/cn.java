/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    static sj field_b;
    static int field_a;
    static dl[] field_c;
    static am field_e;
    static double[] field_d;

    final static boolean b(int param0) {
        pi var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pi var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            var5 = (pi) (Object) hc.field_b.g(32073);
            var1 = var5;
            if (var1 != null) {
              var2 = -1;
              var3 = 0;
              L1: while (true) {
                if (var1.field_i <= var3) {
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L2: {
                    if (var5.field_k[var3] == null) {
                      break L2;
                    } else {
                      if (var5.field_k[var3].field_a != 0) {
                        break L2;
                      } else {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0 != 0;
                      }
                    }
                  }
                  L3: {
                    if (null == var5.field_m[var3]) {
                      break L3;
                    } else {
                      if (var5.field_m[var3].field_a == 0) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1_ref, "cn.B(" + 114 + 41);
        }
        return stackIn_17_0 != 0;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new sj(14, 0, 4, 1);
    }
}
