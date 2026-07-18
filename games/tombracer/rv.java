/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv extends Exception {
    String field_b;
    static int field_a;
    static jea field_c;

    public static void a() {
        field_c = null;
    }

    rv(String param0) {
        try {
            ((rv) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rv.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
