/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends rqa {
    static ha field_r;
    static String field_s;
    static int field_q;
    static String field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_s = null;
            return new nc(btb.field_a);
        }
        return new nc(btb.field_a);
    }

    og(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_r = null;
        field_o = null;
        field_p = null;
        if (param0 != 23969) {
            og.a(-24);
            field_s = null;
            return;
        }
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You are invited to <%0>'s game.";
        field_s = "<%0> has left the lobby.";
        field_q = 4;
        field_p = "RuneScape clan";
    }
}
