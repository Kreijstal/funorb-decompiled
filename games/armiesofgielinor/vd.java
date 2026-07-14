/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static vh field_b;
    static String field_a;
    private static String field_z;

    public static void a(int param0) {
        if (param0 != 256) {
            vd.a(-28);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "vd.A(";
        field_b = new vh(256);
        field_a = "Are you sure you wish to restart this mission from the beginning?";
    }
}
