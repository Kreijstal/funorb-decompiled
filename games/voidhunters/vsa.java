/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vsa extends rqa {
    static phb[] field_p;
    static gdb field_r;
    static String field_o;
    static String field_q;
    static String field_s;

    vsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          si.a(142, 62, param0[0].a(46));
          return new nc((Object) (Object) "void");
        } else {
          si.a(142, 62, param0[0].a(46));
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        if (param0 > -30) {
          field_q = null;
          field_s = null;
          field_p = null;
          field_o = null;
          field_q = null;
          field_r = null;
          return;
        } else {
          field_s = null;
          field_p = null;
          field_o = null;
          field_q = null;
          field_r = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Click here or press <%0> to save your ship";
        field_s = "Close";
    }
}
