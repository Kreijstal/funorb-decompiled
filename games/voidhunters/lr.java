/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends rqa {
    static int[] field_o;
    static String field_q;
    static int field_p;

    lr(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 125) {
            return;
        }
        field_q = null;
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(125, 92));
    }

    final static void a(String param0, int param1) {
        ajb.a((byte) -74, param0);
        fa.a(uta.field_p, -124, false);
        if (param1 > -39) {
            lr.a(10);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[8192];
        field_q = "Staff impersonation";
        hi discarded$0 = new hi();
        field_p = 256;
    }
}
