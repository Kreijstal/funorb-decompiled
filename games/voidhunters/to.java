/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends rqa {
    static clb field_o;
    static String[] field_p;
    static String field_q;

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        if (param0 != 204) {
            field_o = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_q = null;
          return new nc((Object) (Object) frb.a(204, 121));
        } else {
          return new nc((Object) (Object) frb.a(204, 121));
        }
    }

    final static void e(byte param0) {
        if (param0 >= -14) {
            return;
        }
        s.field_o.b((shb) (Object) new rla(), 90);
    }

    to(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Downloading at <%0>%";
        field_p = new String[100];
        field_o = new clb();
    }
}
