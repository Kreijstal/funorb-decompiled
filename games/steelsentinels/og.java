/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_a;
    static long field_b;
    static String field_c;

    final static void b() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (ub.field_e != null) {
          var1 = (Object) (Object) ub.field_e;
          synchronized (var1) {
            L0: {
              ub.field_e = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a() {
        field_a = null;
        field_c = null;
    }

    final static void a(int param0) {
        if (!mg.b(true)) {
            return;
        }
        cl.a(118, false, 4);
        if (param0 != -5213) {
            field_c = null;
        }
    }

    final static int a(boolean param0) {
        qd[] var1 = new qd[]{};
        qd[] var2 = hl.field_v.a(var1, -21636, fg.field_Ob);
        var1 = var2;
        return var2.length * 36;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Hide game chat";
        field_c = "Waiting for fonts";
    }
}
