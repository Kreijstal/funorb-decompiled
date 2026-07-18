/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_c;
    static float field_a;
    int field_d;
    static String field_b;

    final static int a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (cm.field_a == null) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var1_int = 0;
              L1: while (true) {
                if (cm.field_a.length <= var1_int) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (!cm.field_a[var1_int].a((byte) -47)) {
                    var1_int++;
                    continue L1;
                  } else {
                    stackOut_8_0 = var1_int;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "pl.A(" + 64 + ')');
        }
        return stackIn_12_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    pl(int param0) {
        ((pl) this).field_d = param0;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Suggest muting this player";
        field_b = "Instructions";
    }
}
