/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends hg {
    static long field_k;
    static int[] field_l;
    int field_i;
    static String field_m;
    static rg field_h;
    byte[] field_j;
    static String field_g;

    public static void d() {
        field_m = null;
        field_h = null;
        field_g = null;
        field_l = null;
    }

    bd(byte[] param0) {
        try {
            ((bd) this).field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Service unavailable";
        field_g = "Waiting for sound effects";
    }
}
