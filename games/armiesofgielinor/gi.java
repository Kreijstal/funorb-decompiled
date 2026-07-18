/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static sa field_d;
    static int field_b;
    static String[] field_c;
    static String field_a;

    final static boolean a(boolean param0) {
        return du.field_d == mh.field_b;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 180) {
            gi.a(-55);
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 180;
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_d = new sa();
        field_a = "Vile toxins to weaken your enemies.";
    }
}
