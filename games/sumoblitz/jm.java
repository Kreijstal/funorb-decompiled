/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static vn field_a;
    static long field_b;
    static String field_d;
    static String field_c;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 == 28679) {
          if (wk.field_h == null) {
            return;
          } else {
            var1 = (Object) (Object) wk.field_h;
            synchronized (var1) {
              L0: {
                wk.field_h = null;
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "BEST HISCORES";
    }
}
