/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip extends rqa {
    static String field_o;
    static java.awt.Dimension field_p;

    ip(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = null;
          return new nc((Object) (Object) frb.a(162, 82));
        } else {
          return new nc((Object) (Object) frb.a(162, 82));
        }
    }

    public static void e(byte param0) {
        if (param0 != 62) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "More thrusters";
        field_p = new java.awt.Dimension(640, 480);
    }
}
