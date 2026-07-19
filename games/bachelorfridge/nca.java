/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nca {
    static String field_b;
    static ee[] field_a;

    public static void a(byte param0) {
        if (param0 != 87) {
            field_b = (String) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, lu param1, cj param2) {
        if (!(param2 != null)) {
            param1.d(-1, 0);
            return;
        }
        try {
            if (param0 < 82) {
                cj var4 = (cj) null;
                nca.a(-125, (lu) null, (cj) null);
            }
            param1.d(param2.field_h, 0);
            param2.a(param1, -9);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nca.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Connection timed out. Please try using a different server.";
    }
}
