/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static double field_c;
    static String field_a;
    static String field_d;
    static bi field_b;

    public static void a(byte param0) {
        int var1 = 20;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 10) {
                break L0;
              } else {
                L2: {
                  if (fb.field_d[var1_int] == null) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "ne.B(" + -11 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = Math.atan2(1.0, 0.0);
        field_a = "Homing energy weapons";
        field_d = "Connection restored.";
    }
}
