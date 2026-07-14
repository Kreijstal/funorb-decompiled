/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cga extends rqa {
    static String[] field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            cga.e((byte) 22);
            return new nc(apb.field_b);
        }
        return new nc(apb.field_b);
    }

    cga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != -31) {
            field_o = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"Become a member to save your ships"};
    }
}
