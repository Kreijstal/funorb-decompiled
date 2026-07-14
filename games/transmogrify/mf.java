/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static String field_a;
    static qj field_b;
    static int field_d;
    static int[] field_c;
    private static String field_z;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "mf.A(";
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = new qj();
        field_c = new int[4];
    }
}
