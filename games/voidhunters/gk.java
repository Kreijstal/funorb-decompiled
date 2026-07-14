/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends rqa {
    static String field_o;
    static boolean field_p;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = true;
          return new nc((Object) (Object) frb.a(116, 79));
        } else {
          return new nc((Object) (Object) frb.a(116, 79));
        }
    }

    gk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 116) {
            gk.a(41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Full screen";
        field_p = false;
        ng discarded$0 = new ng();
    }
}
