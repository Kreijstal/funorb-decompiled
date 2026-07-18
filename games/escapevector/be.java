/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static String field_a;
    static pn field_b;

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        hg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        bd var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            var4 = (bd) (Object) rd.field_b.a(false);
            L1: while (true) {
              if (var4 == null) {
                var2 = nf.field_w.a(false);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    q.c(6, (byte) -63);
                    var2 = nf.field_w.b((byte) 70);
                    continue L2;
                  }
                }
              } else {
                r.a(-118, var4, 6);
                var4 = (bd) (Object) rd.field_b.b((byte) 70);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "be.B(" + 6 + ',' + 17205 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play Tutorial";
        cn discarded$0 = new cn();
    }
}
