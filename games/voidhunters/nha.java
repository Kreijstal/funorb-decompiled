/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nha extends rqa {
    static String field_p;
    static dja field_o;

    nha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          rfa.field_p = param0[0].a(false);
          return new nc((Object) (Object) "void");
        } else {
          rfa.field_p = param0[0].a(false);
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 <= 18) {
            nha.e((byte) 115);
            field_p = null;
            return;
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        bab discarded$0 = new bab();
        field_p = "(<%0> players want to join)";
        field_o = (dja) (Object) new av();
    }
}
