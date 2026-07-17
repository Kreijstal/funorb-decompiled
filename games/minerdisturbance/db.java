/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends RuntimeException {
    static ea field_f;
    static int field_d;
    static boolean field_e;
    String field_a;
    Throwable field_c;
    static byte[][] field_b;

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
    }

    db(Throwable param0, String param1) {
        ((db) this).field_c = param0;
        ((db) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
    }
}
