/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static oj field_d;
    static int field_f;
    static String field_a;
    static int field_b;
    static String field_c;
    static int field_g;
    static volatile int field_e;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -20973) {
            field_g = 51;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static boolean a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        var3 = Pool.field_O;
        try {
          L0: {
            if (0L == (pd.field_i & 1L)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              de.a(-105);
              var1_int = 0;
              var2 = -112 / ((-54 - param0) / 32);
              L1: while (true) {
                if (aq.field_a.length <= var1_int) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!aq.field_a[var1_int].b(59)) {
                    var1_int++;
                    continue L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ti.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    static {
        field_f = 4;
        field_d = null;
        field_a = "You have entered another game.";
        field_c = "Return to game";
        field_b = 3;
        field_g = -750;
        field_e = 0;
    }
}
