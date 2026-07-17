/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static ja field_c;
    static long field_b;
    static volatile int field_a;

    public static void a(byte param0) {
        field_c = null;
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        dh var4 = null;
        nk var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (dh) (Object) field_c.b(2);
            L1: while (true) {
              if (var4 == null) {
                var5 = (nk) (Object) qh.field_e.b(2);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    gj.a(2, var5, param0);
                    var5 = (nk) (Object) qh.field_e.a(10);
                    continue L2;
                  }
                }
              } else {
                me.a(var4, 0, param0);
                var4 = (dh) (Object) field_c.a(10);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "pa.B(" + param0 + 44 + 40 + 41);
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 91) {
            return true;
        }
        return af.a(9819, gd.b((byte) 77));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ja();
        field_a = 0;
    }
}
