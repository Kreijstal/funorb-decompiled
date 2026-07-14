/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vha extends rqa {
    static String[] field_o;
    static int field_p;

    public static void e(byte param0) {
        if (param0 != -5) {
            field_o = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    vha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        ne.field_v = param0[0].a(false);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[100];
        field_p = 4;
    }
}
