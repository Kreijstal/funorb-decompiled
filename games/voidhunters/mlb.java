/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mlb extends rqa {
    static ij field_q;
    static boolean field_o;
    static int field_r;
    static String field_p;

    public static void e(byte param0) {
        field_p = null;
        if (param0 < 55) {
            return;
        }
        field_q = null;
    }

    mlb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          mlb.e((byte) 15);
          return new nc((Object) (Object) frb.a(134, 122));
        } else {
          return new nc((Object) (Object) frb.a(134, 122));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 65;
        field_p = "Your request to join has been declined.";
    }
}
