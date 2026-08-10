/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static String field_b;
    static int field_c;
    static int field_a;
    static nf[] field_d;

    final static void a(mi param0, int param1, boolean param2, mi param3, mi param4) {
        try {
            fb.field_a = a.a("", -6728);
            fb.field_a.a(false, param1 + 64187);
            rk.a(param0, param1 ^ 122, param4, param3);
            jk.a((byte) -81);
            na.field_S = ml.field_a;
            oe.field_Q = ml.field_a;
            if (param1 != 0) {
                field_d = (nf[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "fi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 > -121) {
            field_a = -5;
        }
    }

    static {
        field_b = "Waiting for graphics";
        field_c = 0;
    }
}
