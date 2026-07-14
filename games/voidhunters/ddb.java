/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ddb extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc(vv.field_c);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 < 17) {
            ddb.e((byte) -125);
        }
    }

    ddb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> has been removed.";
    }
}
