/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ou extends rqa {
    static String field_o;
    static int field_r;
    static String field_p;
    static int field_q;

    final nc a(nc[] param0, int param1) {
        si.a(217, 62, param0[0].a(99));
        if (param1 > -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    ou(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 != -33) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Combat mode in <%0>";
        field_r = 8;
        field_p = "Waiting for sound effects";
    }
}
