/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ljb extends rqa {
    static int field_o;
    static String field_p;

    ljb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 >= -42) {
            field_o = -36;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = null;
          return new nc((Object) (Object) frb.a(41, 127));
        } else {
          return new nc((Object) (Object) frb.a(41, 127));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 1024;
        field_p = "Next round in <%0>";
    }
}
