/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hga extends rqa {
    static ij field_p;
    static int[] field_o;

    hga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          return null;
        } else {
          si.a(196, 62, param0[0].a(89));
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 <= 36) {
            field_o = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ij();
    }
}
