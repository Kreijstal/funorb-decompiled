/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static cd field_c;
    static float field_d;
    static Boolean field_a;
    static int field_b;

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == ji.field_c) {
          return;
        } else {
          var1 = (Object) (Object) ji.field_c;
          synchronized (var1) {
            L0: {
              ji.field_c = null;
              break L0;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        int var1 = 0;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new cd();
    }
}
