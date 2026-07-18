/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static int field_d;
    static ga field_a;
    static mo[][] field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 64) {
            ma.a(-89);
        }
    }

    final static void a(cj param0, cj param1) {
        if (!(param0.field_Cb != null)) {
            param0.field_Cb = new th();
        }
        if (null == param1.field_Cb) {
            param1.field_Cb = new th();
        }
        if (!(ol.field_o != null)) {
            ol.field_o = new sc(64);
        }
        if (!(null != bh.field_f)) {
            bh.field_f = new sc(64);
        }
        try {
            jf.field_d = param1.field_Cb;
            ro.field_M = param0.field_Cb;
            int discarded$0 = -8328;
            cf.d();
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ma.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Show chat (1 unread message)";
    }
}
