/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cab extends rqa {
    static int field_p;
    static int field_r;
    static String field_q;
    static pjb field_o;

    cab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc(bta.field_q);
    }

    public static void a(int param0) {
        int var1 = 53 / ((param0 - 47) / 55);
        field_q = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 524288;
        field_q = "Enter name of player to delete from list";
    }
}
