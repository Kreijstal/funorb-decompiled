/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_a;
    ola field_c;
    static boolean field_b;
    static kv field_d;

    ua(String param0, mu param1) {
        ((ua) this).field_c = new ola();
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = -19 % ((64 - param0) / 60);
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2, lda param3) {
        it.field_s = param3;
        if (param0 != -50) {
            field_b = false;
            lda.field_a = param2;
            fh.field_v = param1;
            return;
        }
        lda.field_a = param2;
        fh.field_v = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email (Login):";
    }
}
