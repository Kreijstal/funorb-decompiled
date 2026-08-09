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

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        if (param0 >= -83) {
            field_e = (String) null;
        }
    }

    final static boolean a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 90) {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= param1) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (up.field_g[var2_int]) {
                    var2_int++;
                    continue L1;
                  } else {
                    stackIn_8_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "sl.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    static {
        field_c = new int[]{1, 1, 1, 10, 3, 1, 1, 1, 2, 1, 5, 2, 3, 5, 2, 3, 1, 2, 2, 3, 2, 3, 1, 2, 3, 2, 3, 10};
        field_d = false;
        field_e = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
