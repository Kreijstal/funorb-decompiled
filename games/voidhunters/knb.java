/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class knb extends rqa {
    static String field_q;
    static String field_p;
    static String field_r;
    static boolean field_o;

    knb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        if (param0 > -96) {
            knb.e((byte) -119);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_r = null;
          si.a(178, 62, param0[0].a(55));
          return new nc((Object) (Object) "void");
        } else {
          si.a(178, 62, param0[0].a(55));
          return new nc((Object) (Object) "void");
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Accept";
        field_p = "Type your password again to make sure it's correct";
        field_r = "Add <%0> to friend list";
        field_o = false;
    }
}
