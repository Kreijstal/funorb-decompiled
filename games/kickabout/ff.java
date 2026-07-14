/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    int field_a;
    static ut field_b;
    int field_d;
    static String field_c;

    public static void a(byte param0) {
        if (param0 <= 100) {
            ff.a((byte) 118);
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ff(int param0, int param1, int param2, int param3) {
        ((ff) this).field_d = param3;
        ((ff) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ut(80, 10);
        field_c = "Withdraw request to join <%0>'s game";
    }
}
