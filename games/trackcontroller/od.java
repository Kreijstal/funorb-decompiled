/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static ki field_a;
    static jc field_d;
    static String field_b;
    static int[] field_c;

    final static void a(byte param0, int param1) {
        int discarded$3 = ia.b(false);
        if (param0 > -56) {
            field_a = null;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 8192) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Connection lost. <%0>";
        field_c = new int[8192];
    }
}
