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
        if (param0 <= 61) {
            field_d = -89;
            field_b = (byte[][]) null;
            field_f = null;
            return;
        }
        field_b = (byte[][]) null;
        field_f = null;
    }

    db(Throwable param0, String param1) {
        this.field_c = param0;
        this.field_a = param1;
    }

    static {
        field_e = true;
    }
}
