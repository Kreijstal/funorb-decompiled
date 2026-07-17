/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    boolean field_d;
    static String field_a;
    String field_e;
    static String field_g;
    String[] field_c;
    int field_b;
    boolean field_f;

    public static void a(int param0) {
        field_a = null;
        field_g = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        vg var4 = null;
        gj var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4 = (vg) (Object) kk.field_X.b((byte) -45);
            L1: while (true) {
              if (var4 == null) {
                var5 = (gj) (Object) cb.field_b.b((byte) 123);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    se.a(var5, param0, -49);
                    var5 = (gj) (Object) cb.field_b.d(853);
                    continue L2;
                  }
                }
              } else {
                bk.a(true, param0, var4);
                var4 = (vg) (Object) kk.field_X.d(853);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "qj.A(" + param0 + 44 + 7287 + 41);
        }
    }

    qj(boolean param0) {
        ((qj) this).field_f = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "FULL ACCESS";
        field_g = "Next";
    }
}
