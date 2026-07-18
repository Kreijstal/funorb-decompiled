/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_a;
    ola field_c;
    static boolean field_b;
    static kv field_d;

    ua(String param0, mu param1) {
        try {
            ((ua) this).field_c = new ola();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = 0;
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2, lda param3) {
        try {
            it.field_s = param3;
            lda.field_a = param2;
            fh.field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ua.B(" + -50 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email (Login):";
    }
}
