/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static String field_a;
    static String[] field_c;
    static int field_b;

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 > 52) {
            break L0;
          } else {
            wj.b(94);
            break L0;
          }
        }
        if (kb.field_a != null) {
          var1 = (Object) (Object) kb.field_a;
          synchronized (var1) {
            L1: {
              kb.field_a = null;
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Achieved";
        field_b = 10;
    }
}
