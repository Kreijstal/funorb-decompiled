/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oja extends rqa {
    static no field_p;
    static String field_o;

    oja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc(ofb.field_o);
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 9141) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You cannot add yourself!";
    }
}
