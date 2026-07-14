/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends rqa {
    static int field_p;
    static String field_o;

    final nc a(nc[] param0, int param1) {
        si.a(210, 62, param0[0].a(25));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    oh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 != 0) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Previous condition/action value 2";
        field_p = 3;
    }
}
