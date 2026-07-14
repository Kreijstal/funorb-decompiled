/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rja extends rqa {
    static String field_o;

    rja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -91) {
            rja.e((byte) 92);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(101, 103));
        } else {
          return new nc((Object) (Object) frb.a(101, 103));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "(1 player wants to join)";
    }
}
