/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static int field_a;
    static boolean field_d;
    static String field_c;
    static String field_e;
    static bd field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final static boolean a(boolean param0) {
        if (vh.field_c == null) {
            return false;
        }
        if (!vh.field_c.a((byte) 99)) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_c = "Encouraging rule breaking";
        field_e = "You are on <%0>";
        field_b = new bd();
    }
}
