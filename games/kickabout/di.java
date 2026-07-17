/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_a;

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        hn var3 = null;
        hn var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var3 = (hn) (Object) da.field_h.d(-9033);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_i != 9) {
                    break L2;
                  } else {
                    var3.c((byte) -109);
                    var3 = (hn) (Object) da.field_h.d(-9033);
                    continue L1;
                  }
                }
              }
              var4 = ic.field_h.a(param2, -86, param0);
              ii.a(var4, 85);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "di.B(" + param0 + 44 + 1 + 44 + param2 + 41);
        }
    }

    public static void a() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Leagues";
    }
}
