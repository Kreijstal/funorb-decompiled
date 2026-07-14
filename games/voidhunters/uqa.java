/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uqa extends rqa {
    static int field_p;
    static dja field_q;
    static int[] field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            uqa.a(-76);
            return new nc(unb.field_o);
        }
        return new nc(unb.field_o);
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 1) {
            uqa.a(35);
            field_o = null;
            return;
        }
        field_o = null;
    }

    uqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[1];
    }
}
