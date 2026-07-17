/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends RuntimeException {
    static String field_e;
    static String field_d;
    static String field_b;
    String field_f;
    Throwable field_a;
    static int field_c;

    public static void a() {
        field_e = null;
        field_b = null;
        int var1 = 0;
        field_d = null;
    }

    wg(Throwable param0, String param1) {
        ((wg) this).field_a = param0;
        ((wg) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_e = "Phoenix device";
        field_b = "(Including <%0>)";
        field_c = -1;
    }
}
