/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static String field_f;
    static Boolean field_b;
    static int field_d;
    static int field_a;
    static le field_g;
    static ci field_c;
    static int[] field_e;

    final static ci b(int param0) {
        return ib.field_c.field_Kb;
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = 0;
        field_e = null;
        field_g = null;
        field_b = null;
        field_f = null;
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (bj.field_cb == null) {
          return;
        } else {
          var1 = (Object) (Object) bj.field_cb;
          synchronized (var1) {
            L0: {
              bj.field_cb = null;
              break L0;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 24;
        field_f = "Similar rating";
        field_a = 2;
        field_e = new int[8192];
    }
}
