/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends tc {
    static wk[] field_k;
    static kl field_m;
    byte[] field_n;
    static je field_l;

    public static void a(int param0) {
        field_m = null;
        field_l = null;
        field_k = null;
        if (param0 >= -64) {
            vc.a(-103);
        }
    }

    vc(byte[] param0) {
        try {
            ((vc) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "vc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
