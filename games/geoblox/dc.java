/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static int field_a;
    static rh field_c;
    static int field_b;

    public static void b(int param0) {
        field_c = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ja var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            var3 = (ja) (Object) a.field_d.g(0);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                var3.e(1643839728);
                var3 = (ja) (Object) a.field_d.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "dc.A(" + 7838 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
