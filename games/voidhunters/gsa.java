/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gsa extends rqa {
    static String[] field_o;
    static String field_p;

    gsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 109) {
            gsa.a(114);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          gsa.a(112);
          si.a(109, 62, param0[0].a(52));
          return new nc((Object) (Object) "void");
        } else {
          si.a(109, 62, param0[0].a(52));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Go Back";
        field_o = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
