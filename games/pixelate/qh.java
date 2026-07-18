/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static String field_a;
    static int field_c;
    static String field_e;
    static String field_f;
    static String[] field_d;
    static int field_b;

    final static void a(byte param0, int param1, ua param2, boolean param3) {
        if (param0 > -50) {
            return;
        }
        try {
            ri.field_a.a(1000000, false, param1, (byte) 124, param2, 256);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "qh.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 256) {
          qh.a(3);
          field_a = null;
          field_f = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for <%0> to start the game...";
        field_c = 20;
        field_f = "Next";
        field_d = new String[]{"Move:", "Rotate:", "Drop Fast:", "Pause:", "or"};
        field_e = "Add name";
    }
}
