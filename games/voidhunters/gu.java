/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu extends rqa {
    static int field_p;
    static String field_o;
    static String field_q;

    gu(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 232) {
            gu.a(-85);
            field_o = null;
            field_q = null;
            return;
        }
        field_o = null;
        field_q = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(232, 102));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 25;
        field_o = "target";
        field_q = "Day";
    }
}
