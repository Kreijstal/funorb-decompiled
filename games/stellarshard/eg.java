/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static String[] field_a;
    static int field_d;
    static String field_c;
    static oj field_b;

    public static void b(int param0) {
        if (param0 > -85) {
            eg.b(42);
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        var2 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 <= -26) {
                break L1;
              } else {
                eg.b(12);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= 3000) {
                stackOut_10_0 = -1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (null == wk.field_b[var1_int]) {
                  stackOut_7_0 = var1_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  var1_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "eg.B(" + param0 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = "Change display name";
        field_b = new oj();
    }
}
