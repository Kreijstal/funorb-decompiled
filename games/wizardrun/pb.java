/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends wl {
    static int field_k;
    byte[] field_j;
    static String field_i;

    public static void b(boolean param0) {
        field_i = null;
    }

    pb(byte[] param0) {
        try {
            ((pb) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "pb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Press UP or <%1> to jump.";
    }
}
