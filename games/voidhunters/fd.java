/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends rqa {
    static int field_p;
    static int field_q;
    static String field_o;
    static int field_r;

    public static void e(int param0) {
        if (param0 != -1) {
            return;
        }
        field_o = null;
    }

    fd(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        pkb.field_o = wt.a(false);
        nkb.field_q = 0;
        if (param0 != 4907) {
            fd.a(-71);
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(39, 62, param0[0].a(104));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 1;
        field_r = -1;
        field_o = "Connection timed out. Please try using a different server.";
    }
}
