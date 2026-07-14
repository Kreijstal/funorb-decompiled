/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jta extends rqa {
    static llb field_o;
    static String field_q;
    static asb field_r;
    static int field_p;

    public static void a(int param0) {
        field_q = null;
        if (param0 != -29044) {
            jta.a(17);
            field_o = null;
            field_r = null;
            return;
        }
        field_o = null;
        field_r = null;
    }

    jta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(212, 79));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "This password contains your Player Name, and would be easy to guess";
    }
}
