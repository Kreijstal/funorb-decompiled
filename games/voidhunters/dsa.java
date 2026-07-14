/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dsa extends rqa {
    static qrb field_q;
    static String field_p;
    static String field_o;

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 0) {
            return;
        }
        field_q = null;
    }

    dsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(230, 62, param0[0].a(21));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new qrb();
        field_o = "Loading...";
    }
}
