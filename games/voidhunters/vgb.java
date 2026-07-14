/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vgb extends rqa {
    static int[] field_p;
    static String field_q;
    static int field_o;

    vgb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(52, 80));
    }

    public static void a(int param0) {
        field_p = null;
        field_q = null;
        if (param0 < 48) {
            field_q = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new int[8192];
        field_o = 32;
        field_q = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
