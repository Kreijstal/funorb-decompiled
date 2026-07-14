/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eia extends rqa {
    static String field_r;
    static kla field_q;
    static phb[] field_o;
    static String field_p;

    eia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(92, 82));
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 92) {
          eia.a(111);
          field_p = null;
          field_o = null;
          field_r = null;
          return;
        } else {
          field_p = null;
          field_o = null;
          field_r = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = null;
        field_r = "Defence";
        field_p = "Play free version";
    }
}
