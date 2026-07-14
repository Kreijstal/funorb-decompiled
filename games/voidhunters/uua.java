/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uua extends rqa {
    static String field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        si.a(168, 62, param0[0].a(31));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        if (param0 > -26) {
            field_o = 111;
            field_p = null;
            return;
        }
        field_p = null;
    }

    uua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Increased map height";
        field_o = 1000;
    }
}
