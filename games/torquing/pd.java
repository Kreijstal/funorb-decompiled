/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static byte[][] field_b;
    static int field_c;
    static String field_a;

    final static void a(cb param0, boolean param1, int param2) {
        df var3 = null;
        try {
            var3 = wa.field_d;
            var3.f(96, param2);
            if (!param1) {
                cb var4 = (cb) null;
                pd.a((cb) null, false, -95);
            }
            var3.b(90, param0.field_k);
            var3.a(param0.field_l, 61);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "pd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = (byte[][]) null;
        if (param0) {
            cb var2 = (cb) null;
            pd.a((cb) null, false, -84);
        }
    }

    static {
        field_b = new byte[250][];
        field_a = "Loading levels";
    }
}
