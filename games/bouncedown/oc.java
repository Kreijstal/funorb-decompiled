/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int[] field_a;
    static String field_c;
    static String field_b;
    private static String field_z;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            oc.a(true);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "oc.A(";
        field_a = new int[128];
        field_c = "To server list";
        field_b = null;
    }
}
