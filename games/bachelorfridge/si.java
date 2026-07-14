/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    static String field_d;
    static String field_c;
    int field_b;
    int field_a;

    si(int param0, int param1, int param2) {
        ((si) this).field_a = param1;
        ((si) this).field_b = param0;
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != -28415) {
            si.a(85);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Next";
        field_d = "Play rated game";
    }
}
