/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iga {
    static vr field_d;
    static wma field_c;
    static String field_b;
    static kv[] field_a;
    private static String field_z;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (param0) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    abstract wba a(byte param0);

    abstract void a(lu param0, boolean param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "iga.E(";
        field_b = "Options";
    }
}
