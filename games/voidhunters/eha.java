/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eha extends rqa {
    static String field_p;
    static wma[] field_o;
    static int field_q;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_q = 17;
          si.a(105, 62, param0[0].a(62));
          return new nc((Object) (Object) "void");
        } else {
          si.a(105, 62, param0[0].a(62));
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -17297) {
            field_q = 47;
            field_p = null;
            return;
        }
        field_p = null;
    }

    eha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Send private Quick Chat to <%0>";
        field_q = 1024;
    }
}
