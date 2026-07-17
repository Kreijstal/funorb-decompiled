/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends ai {
    byte[] field_h;
    static String field_g;
    static int field_i;

    public static void a() {
        field_g = null;
    }

    kj(byte[] param0) {
        try {
            ((kj) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "kj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "More suggestions";
    }
}
