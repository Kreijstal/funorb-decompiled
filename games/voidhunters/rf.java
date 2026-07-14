/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends rqa {
    static String field_p;
    static String field_o;

    final nc a(nc[] param0, int param1) {
        si.a(123, 62, param0[0].a(29));
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 15110) {
            return;
        }
        field_p = null;
    }

    rf(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Fire missiles";
        field_o = "Use to grab ships or asteroids";
    }
}
