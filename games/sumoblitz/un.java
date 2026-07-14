/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static int[] field_a;
    static jn field_b;
    static String field_c;
    private static String field_z;

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (!param0) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "un.A(";
        field_a = new int[]{1, 2, 3, 4, 5, 6};
        field_c = "Player Name: ";
    }
}
