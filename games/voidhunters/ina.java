/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ina extends rqa {
    static int field_p;
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(30, 96));
    }

    ina(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -1721) {
            ina.a(-92);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 5;
        field_o = "Invite <%0> to this game";
    }
}
