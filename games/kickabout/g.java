/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static hd field_a;
    static int[] field_b;

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            m.field_d = new int[16];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= m.field_d.length) {
                break L0;
              } else {
                m.field_d[var1_int] = (var1_int << 2) * 65793;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "g.A(" + 0 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[5];
        field_b[0] = 286720;
        field_b[3] = 163840;
        field_b[4] = 327680;
        field_b[2] = 163840;
        field_b[1] = 163840;
    }
}
