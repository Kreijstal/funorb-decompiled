/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends rqa {
    static String field_o;

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            vo.b(true);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(143, 84));
        } else {
          return new nc((Object) (Object) frb.a(143, 84));
        }
    }

    vo(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Visit the Account Management section on the main site to view.";
    }
}
