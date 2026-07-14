/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hsa extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(14, 81));
        } else {
          return new nc((Object) (Object) frb.a(14, 81));
        }
    }

    hsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 < 61) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
