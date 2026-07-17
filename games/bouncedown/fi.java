/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static int field_c;
    static String field_a;
    static int field_b;

    public static void a() {
        field_a = null;
    }

    final static boolean b() {
        if (null == kf.field_b) {
            return false;
        }
        if (kf.field_b.a(false) == null) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading graphics";
    }
}
