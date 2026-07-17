/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static String field_a;
    static String[] field_d;
    static bc field_b;
    static int field_c;

    final static void a(boolean param0, boolean param1, byte param2) {
        if (param0) {
            na.a(0, 0, na.field_e, na.field_k, 0, 192);
        } else {
            na.a();
            na.a();
            na.a();
        }
        int discarded$0 = 1;
        pj.a(param0);
        int var3 = -128 / ((param2 - 41) / 34);
    }

    public static void a() {
        field_d = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = new String[]{"All scores", "My scores", "Best each"};
        field_b = new bc();
    }
}
