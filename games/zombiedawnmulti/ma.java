/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static int field_d;
    static ga field_a;
    static mo[][] field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = (mo[][]) null;
        field_a = null;
        field_c = null;
        if (param0 != 64) {
            ma.a(-89);
        }
    }

    final static void a(cj param0, cj param1, boolean param2) {
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
        if (!param2) {
            return;
        }
        try {
            jf.field_d = param1.field_Cb;
            ro.field_M = param0.field_Cb;
            cf.d(-8328);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ma.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = "Show chat (1 unread message)";
    }
}
