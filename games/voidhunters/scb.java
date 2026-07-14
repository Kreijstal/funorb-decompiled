/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class scb extends rqa {
    static dja field_o;
    static String field_p;

    scb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_p = null;
            return new nc(oq.field_l);
        }
        return new nc(oq.field_l);
    }

    public static void a(int param0) {
        if (param0 != 30465) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = (dja) (Object) new ulb();
        field_p = "ms";
    }
}
