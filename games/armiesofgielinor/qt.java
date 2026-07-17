/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qt {
    static int[] field_c;
    static String field_d;
    static ru field_e;
    static String field_a;
    static String field_b;

    public static void a() {
        field_d = null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param1 <= 0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | param0 & 1;
                param1--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "qt.A(" + param0 + 44 + param1 + 44 + -114 + 41);
        }
        return stackIn_5_0;
    }

    final static void a(boolean param0) {
        tm.a();
        tm.b(0.75f);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_d = "Bridges can only be built on straight coastlines.";
        field_a = "Defeat the enemy leader to win this battle.";
        field_b = "You have withdrawn your request to join.";
    }
}
