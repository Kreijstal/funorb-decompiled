/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oha extends rqa {
    static pr field_o;
    static String field_p;

    oha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_o = null;
            return new nc(nl.field_n);
        }
        return new nc(nl.field_n);
    }

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        if (param0 != -23714) {
            oha.a(83);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Unable to add friend - system busy";
    }
}
