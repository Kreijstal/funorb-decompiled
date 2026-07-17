/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gka extends vg {
    static int field_g;
    static String field_f;
    String field_h;

    public static void a() {
        field_f = null;
    }

    gka(String param0) {
        try {
            ((gka) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gka.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Great!";
    }
}
