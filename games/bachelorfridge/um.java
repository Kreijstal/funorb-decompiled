/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static int field_a;
    static int field_c;
    static String field_b;
    static int field_d;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 106) {
            field_c = 55;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            field_b = null;
            return !ua.field_b ? true : false;
        }
        return !ua.field_b ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This password contains your email address, and would be easy to guess";
    }
}
