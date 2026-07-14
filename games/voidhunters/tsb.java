/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tsb extends rqa {
    static String field_p;
    static String[] field_o;
    static boolean field_q;

    final nc a(nc[] param0, int param1) {
        tj.field_q = param0[0].a(7);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    public static void b(boolean param0) {
        if (param0) {
            tsb.b(true);
            field_o = null;
            field_p = null;
            return;
        }
        field_o = null;
        field_p = null;
    }

    tsb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Find opponents";
        field_o = new String[255];
    }
}
