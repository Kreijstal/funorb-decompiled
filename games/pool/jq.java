/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq {
    static vh field_d;
    static ko field_c;
    static String field_b;
    static String field_a;
    static int field_g;
    static vh field_f;
    static String[] field_e;
    static String field_h;

    final static void a(byte param0) {
        int var1 = -75 / ((-64 - param0) / 62);
        jk.a(120, w.field_b);
    }

    public static void a(boolean param0) {
        field_h = null;
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> would need a rating of <%1> to play with the current options.";
        field_b = "Ball-in-hand";
        field_g = 0;
        field_h = "You<%0> have won!";
    }
}
