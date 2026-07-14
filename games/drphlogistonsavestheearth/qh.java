/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static int field_b;
    static int[] field_a;
    private static String field_z;

    public static void a(int param0) {
        if (param0 != 1) {
            qh.a(13);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "qh.A(";
        field_b = 500;
        field_a = new int[]{1, 1, 1, 1, 1, 3, 3, 2, 2, 1, 1, 2, 3, 2, 10};
    }
}
