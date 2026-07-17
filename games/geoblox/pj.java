/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends hf {
    byte[] field_h;
    static nd field_f;
    static int[] field_i;
    static ck field_g;

    pj(byte[] param0) {
        try {
            ((pj) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "pj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b() {
        field_i = null;
        field_g = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new nd();
        field_i = new int[16384];
        field_g = new ck(0, 2, 2, 1);
    }
}
