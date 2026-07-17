/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_a;
    static ul field_e;
    static java.awt.Font field_c;
    static int field_d;
    static int field_f;
    static String field_b;

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please try again in a few minutes.";
        field_e = new ul(0);
        field_f = 0;
        field_b = "This option cannot be combined with the current '<%0>' setting.";
    }
}
