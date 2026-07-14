/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qf {
    static ei field_a;
    private static String field_z;

    public static void a(boolean param0) {
        if (!param0) {
            qf.a(false);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "qf.F(";
        field_a = new ei();
    }
}
