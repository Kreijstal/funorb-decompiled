/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gjb extends rqa {
    static dja field_o;
    static llb field_p;

    public static void a(int param0) {
        field_o = null;
        if (param0 >= -109) {
            return;
        }
        field_p = null;
    }

    gjb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        rkb.field_o = param0[0].a(65);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = (dja) (Object) new rg();
    }
}
