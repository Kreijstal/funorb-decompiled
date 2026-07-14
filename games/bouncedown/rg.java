/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    String[] field_d;
    boolean field_f;
    static String field_b;
    static String field_e;
    int field_g;
    String field_c;
    boolean field_a;

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -31) {
            rg.b((byte) 118);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static void b(byte param0) {
        ta.a((byte) -118, vi.b(0));
        if (param0 >= -60) {
            field_e = null;
        }
    }

    final static void a(int param0, String param1, String param2) {
        d.a(param2, false, param1, 0);
        if (param0 != -8742) {
            rg.a((byte) -58);
        }
    }

    rg(boolean param0) {
        ((rg) this).field_f = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_e = "Go Back";
    }
}
