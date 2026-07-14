/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static String field_c;
    static String field_a;
    static String field_b;
    static String field_d;
    private static String field_z;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 6457) {
            me.a(-87);
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "me.A(";
        field_c = "Game options";
        field_b = "Loading graphics";
        field_d = "<%0> is offering an unrated rematch.";
        field_a = "Game options changed (<%0>)";
    }
}
