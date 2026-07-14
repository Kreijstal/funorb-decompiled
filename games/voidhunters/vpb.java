/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vpb extends rqa {
    static String field_o;

    vpb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(106, 62, param0[0].a(19));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        if (param0 != 1600) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Connection lost. <%0>";
        int discarded$0 = ieb.a(1600, 61);
    }
}
