/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ldb extends rqa {
    static int field_q;
    static String field_p;
    static long field_r;
    static int field_o;

    ldb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_p = null;
        if (param0) {
            field_r = -19L;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = 13;
          return new nc((Object) (Object) frb.a(217, 110));
        } else {
          return new nc((Object) (Object) frb.a(217, 110));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Public chat is unavailable while setting up a rated game.";
        field_o = 20;
        field_q = 128;
    }
}
