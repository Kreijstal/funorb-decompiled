/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oqa extends rqa {
    static phb[] field_q;
    static int field_p;
    static int field_o;

    public static void e(byte param0) {
        if (param0 != 53) {
            field_o = -42;
            field_q = null;
            return;
        }
        field_q = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(31, 62, param0[0].a(65));
        if (param1 > -119) {
          field_o = -106;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    oqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 64;
        field_o = 0;
    }
}
