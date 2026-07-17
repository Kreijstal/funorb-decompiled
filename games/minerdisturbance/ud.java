/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static int field_a;
    static int field_e;
    static String field_b;
    int field_d;
    static String field_f;
    static char field_c;

    public static void a() {
        field_b = null;
        int var1 = -96;
        field_f = null;
    }

    final static void a(ac param0) {
        try {
            pm.field_c = 30;
            rb.field_e = param0;
            rf.field_b = 30;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ud.A(" + (param0 != null ? "{...}" : "null") + 44 + 30 + 44 + 30 + 44 + 88 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_f = "Loading sound effects";
        field_b = "Members";
    }
}
