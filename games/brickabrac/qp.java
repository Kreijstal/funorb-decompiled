/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp {
    static String field_a;
    static mh field_f;
    static tp[] field_e;
    static int[] field_c;
    static String field_b;
    static String field_d;

    public static void a() {
        field_c = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_d = null;
        field_e = null;
    }

    final static int a(int param0, int param1) {
        if (param0 < 2) {
            if (param1 >= 5) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Ask to join <%0>'s game";
        field_b = "This game is full.";
        field_d = "Only show private chat from my friends and opponents";
    }
}
