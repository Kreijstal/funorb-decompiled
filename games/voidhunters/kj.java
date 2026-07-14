/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends rqa {
    static gj field_o;
    static String field_p;
    static String field_q;

    kj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_p = null;
          field_o = null;
          field_q = null;
          field_p = null;
          return;
        } else {
          field_o = null;
          field_q = null;
          field_p = null;
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        bhb.field_g = param0[0].a(121);
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
        field_p = "Retry";
        field_o = new gj();
        field_q = "Absorbs all damage";
    }
}
