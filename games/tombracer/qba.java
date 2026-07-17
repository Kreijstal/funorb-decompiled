/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qba {
    static int field_a;
    static String field_d;
    static int field_c;
    static String field_b;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != 480) {
            return false;
        }
        return (param2 & 50560) != 0 ? true : false;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 480;
        field_d = "Crushers";
        field_c = 2;
        field_b = "Respect";
    }
}
