/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hgb extends rqa {
    static osa field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          hgb.e((byte) 25);
          return new nc((Object) (Object) frb.a(118, 116));
        } else {
          return new nc((Object) (Object) frb.a(118, 116));
        }
    }

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 < 14) {
            field_p = null;
        }
    }

    hgb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new osa(0, 0);
        field_p = "Rated game";
    }
}
