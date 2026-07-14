/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends rqa {
    static int[] field_o;
    static String field_q;
    static String field_p;

    pp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 256) {
            pp.a(79);
            field_p = null;
            field_o = null;
            return;
        }
        field_p = null;
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc(oaa.field_i);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Friends";
        field_p = "Unpacking music";
        field_o = new int[256];
    }
}
