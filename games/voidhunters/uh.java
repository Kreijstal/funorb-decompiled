/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends rqa {
    static String field_r;
    static int field_p;
    static String field_o;
    static int field_q;

    uh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = 91;
          return new nc((Object) (Object) frb.a(178, 98));
        } else {
          return new nc((Object) (Object) frb.a(178, 98));
        }
    }

    public static void a(int param0) {
        if (param0 != 64) {
            return;
        }
        field_r = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 480;
        field_o = "Clan";
        field_r = "Dragon chassis";
        field_q = 64;
    }
}
