/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static hl field_a;
    static boolean field_b;
    static int[] field_c;

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        var4 = StarCannon.field_A;
        try {
          var1 = hj.field_c;
          synchronized (var1) {
            ie.field_D = ie.field_D + 1;
            wg.field_b = hc.field_b;
            if (ah.field_c < 0) {
              for (var2 = 0; var2 < 112; var2++) {
                wc.field_c[var2] = false;
              }
              ah.field_c = ec.field_a;
            } else {
              while (ec.field_a != ah.field_c) {
                var2 = ab.field_A[ec.field_a];
                ec.field_a = 127 & 1 + ec.field_a;
                if (var2 < 0) {
                  wc.field_c[~var2] = false;
                  continue;
                }
                wc.field_c[var2] = true;
              }
            }
            hc.field_b = pd.field_b;
          }
          var1_int = -111 % ((param0 - 35) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "bi.A(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          bi.a(-10);
        }
        field_c = null;
        field_a = null;
    }

    static {
        field_a = new hl(640, 480);
        field_c = new int[8];
    }
}
