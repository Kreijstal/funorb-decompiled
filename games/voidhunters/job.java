/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class job extends rqa {
    static String field_q;
    static String field_o;
    static int[] field_p;

    public static void e(byte param0) {
        field_p = null;
        field_q = null;
        field_o = null;
        if (param0 != -16) {
            field_p = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = null;
          si.a(113, 62, param0[0].a(50));
          return new nc((Object) (Object) "void");
        } else {
          si.a(113, 62, param0[0].a(50));
          return new nc((Object) (Object) "void");
        }
    }

    job(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "<%0> exploded";
        field_p = new int[1];
        field_o = "Player";
    }
}
