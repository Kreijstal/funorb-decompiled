/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static jb field_b;
    static gk field_a;
    static boolean[] field_c;

    final static void a(String param0, boolean param1) {
        try {
            if (!param1) {
                field_a = (gk) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "cb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 79) {
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
    }
}
