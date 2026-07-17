/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends ln implements fk {
    static boolean field_d;
    static int[] field_c;
    static String field_e;

    sl(fr param0, int param1, byte[] param2, int param3) {
        super(param0, param2, param3);
    }

    public final int a(int param0) {
        if (param0 != 2721) {
            return -30;
        }
        return 0;
    }

    public static void b() {
        field_e = null;
        field_c = null;
    }

    final static boolean a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param1) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (up.field_g[var2_int]) {
                  var2_int++;
                  continue L1;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "sl.C(" + 90 + 44 + param1 + 41);
        }
        return stackIn_10_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{1, 1, 1, 10, 3, 1, 1, 1, 2, 1, 5, 2, 3, 5, 2, 3, 1, 2, 2, 3, 2, 3, 1, 2, 3, 2, 3, 10};
        field_d = false;
        field_e = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
