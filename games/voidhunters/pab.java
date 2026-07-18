/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pab extends fh {
    static kka[] field_k;
    static int field_m;
    byte[] field_l;

    final static void a(int param0, int param1) {
        rda.field_p = param1;
        lva.field_p = param1;
        fua.field_p = param0;
        uqa.field_p = param0;
        rda.field_q = true;
    }

    public static void a() {
        field_k = null;
    }

    pab(byte[] param0) {
        try {
            ((pab) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "pab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 100;
    }
}
