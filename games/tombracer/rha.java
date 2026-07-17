/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rha extends vg {
    static String field_h;
    byte[] field_g;
    int field_i;
    long field_f;

    public static void a() {
        field_h = null;
    }

    rha(long param0, int param1, byte[] param2) {
        try {
            ((rha) this).field_i = param1;
            ((rha) this).field_f = param0;
            ((rha) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rha.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Johnsson";
    }
}
