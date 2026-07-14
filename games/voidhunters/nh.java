/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        nl.field_n = param0[0].d(0);
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != 124) {
            nh.e((byte) -119);
        }
    }

    nh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "ESC - cancel this line";
    }
}
