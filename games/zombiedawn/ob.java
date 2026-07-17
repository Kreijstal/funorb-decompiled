/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static vn[] field_c;
    static String[] field_a;
    static vn[][] field_b;
    private static String field_z;

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ob.A(";
        field_b = new vn[10][];
        field_a = new String[]{"All scores", "My scores", "Best each"};
    }
}
