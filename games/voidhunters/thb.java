/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class thb extends rqa {
    static String field_o;

    thb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          thb.a(69, 32, 84);
          si.a(200, 62, param0[0].a(110));
          return new nc((Object) (Object) "void");
        } else {
          si.a(200, 62, param0[0].a(110));
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 200) {
            field_o = null;
        }
    }

    final static void a(int param0, int param1, int param2) {
        gwa.a(param0, -1, (double)param2, param0, (double)param2);
        if (param1 != 0) {
            field_o = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Hold this to win the game";
    }
}
