/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends rqa {
    static int field_o;
    static int field_p;

    pk(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = 85;
            return new nc(asb.field_f);
        }
        return new nc(asb.field_f);
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
            return;
        }
        mt.field_o = param4;
        ob.field_j = param3;
        hab.field_i = param0;
        lua.field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 68;
    }
}
