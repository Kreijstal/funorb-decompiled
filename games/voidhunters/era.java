/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class era extends rqa {
    static jra field_o;
    static int field_p;
    static boolean field_r;
    static String field_q;
    static String field_s;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_p = 118;
          return new nc((Object) (Object) frb.a(42, 119));
        } else {
          return new nc((Object) (Object) frb.a(42, 119));
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_q = null;
        field_o = null;
        if (param0 != 42) {
            field_p = -66;
        }
    }

    era(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new jra();
        field_p = 1;
        field_q = "Log in / Create account";
        field_s = "Scavengers";
    }
}
