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

    public static void a(int param0) {
        field_b = null;
        int var1 = -96;
        field_f = null;
    }

    final static void a(ac param0, int param1, int param2, int param3) {
        try {
            pm.field_c = param1;
            rb.field_e = param0;
            rf.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ud.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + 88 + 41);
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
