/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fha extends rqa {
    static int field_p;
    static String[][] field_o;
    static String field_q;

    final static void e(int param0) {
        tmb.field_o = -1;
        jib.field_o = false;
        rfa.field_o = null;
        od.field_a = 0;
        js.field_r = -1;
        if (param0 <= 6) {
            fha.e(-19);
        }
    }

    fha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc(nua.field_o);
    }

    public static void a(int param0) {
        field_o = null;
        field_q = null;
        if (param0 != 25553) {
            field_p = 36;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[][]{new String[3]};
        field_p = 0;
        field_q = "You have declined the invitation.";
    }
}
