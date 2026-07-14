/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class otb extends rqa {
    static int field_q;
    static String field_p;
    static String field_o;

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
            field_q = 95;
            field_p = null;
            return;
        }
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        si.a(23, 62, param0[0].a(70));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    otb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Solicitation";
        field_o = "You must play <%1> more rated games before playing with the current options.";
    }
}
