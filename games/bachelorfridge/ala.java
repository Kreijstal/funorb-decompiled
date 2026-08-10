/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ala {
    static kv[] field_a;
    static boolean[] field_b;
    static String field_d;
    static String field_c;

    public static void a(int param0) {
        int var1 = 30 / ((79 - param0) / 46);
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, kia param1) {
        try {
            pka.a(param1, true, (byte) 73);
            if (param0 != 26219) {
                ala.a(101);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ala.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Updates will sent to the email address you've given";
        field_d = "Close";
    }
}
