/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv extends rqa {
    static String field_p;
    static String field_q;
    static int[] field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc(jra.field_c);
    }

    public static void a(int param0) {
        if (param0 != 16224) {
            return;
        }
        field_p = null;
        field_q = null;
        field_o = null;
    }

    fv(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Automatically shoots down ordnance";
        field_q = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
    }
}
