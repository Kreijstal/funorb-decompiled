/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu extends rqa {
    static String field_o;
    static String field_p;

    cu(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 163) {
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          si.a(163, 62, param0[0].a(51));
          return new nc((Object) (Object) "void");
        } else {
          si.a(163, 62, param0[0].a(51));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Game options changed (<%0>)";
        field_p = "Quick Chat Help";
    }
}
