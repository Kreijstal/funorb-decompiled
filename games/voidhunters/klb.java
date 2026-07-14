/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class klb extends rqa {
    static ij field_q;
    static int[] field_o;
    static ida field_r;
    static int field_p;

    public static void b(boolean param0) {
        field_r = null;
        field_o = null;
        field_q = null;
        if (!param0) {
            klb.b(true);
        }
    }

    klb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_q = null;
            return new nc(mra.e((byte) -97));
        }
        return new nc(mra.e((byte) -97));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 1;
        field_q = new ij();
    }
}
