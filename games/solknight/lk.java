/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int field_e;
    static int field_c;
    static String field_d;
    static String field_a;
    static int field_b;
    static int field_f;
    private static String field_z;

    public static void a(boolean param0) {
        if (!param0) {
            lk.a(true);
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "lk.A(";
        field_a = "Service unavailable";
        field_d = "Account created successfully!";
    }
}
