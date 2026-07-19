/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static String field_a;

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = (String) null;
        }
        field_a = null;
    }

    final static boolean b(int param0) {
        boolean[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            var5 = qd.field_a;
            var1 = var5;
            var2 = 0;
            L1: while (true) {
              if (var2 >= var5.length) {
                var1_int = 15 / ((param0 - -54) / 33);
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = var5[var2] ? 1 : 0;
                if (var3 == 0) {
                  var2++;
                  continue L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "uc.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_a = "Name is available";
    }
}
