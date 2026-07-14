/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nw extends rqa {
    static int field_o;
    static kb field_p;

    public static void e(byte param0) {
        if (param0 > -89) {
            nw.e((byte) 122);
            field_p = null;
            return;
        }
        field_p = null;
    }

    nw(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_p = null;
            return new nc(qhb.field_o);
        }
        return new nc(qhb.field_o);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 4096;
        field_p = new kb(1);
    }
}
