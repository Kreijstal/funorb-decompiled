/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static String field_d;
    static String field_b;
    static int field_a;
    static String field_c;
    private static String field_z;

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
            qd.a(true);
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "qd.A(";
        field_d = "Members";
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_c = "Retry";
    }
}
