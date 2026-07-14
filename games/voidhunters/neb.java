/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class neb extends rqa {
    static String field_p;
    static tsa[] field_q;
    static llb field_o;

    neb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        if (param0 >= -24) {
            neb.e((byte) -125);
            field_q = null;
            field_o = null;
            return;
        }
        field_q = null;
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(20, 62, param0[0].a(31));
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Please wait...";
    }
}
