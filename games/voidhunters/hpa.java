/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hpa extends rqa {
    static int field_p;
    static llb[] field_o;

    public static void a(int param0) {
        int var1 = 64 % ((param0 - -58) / 53);
        field_o = null;
    }

    hpa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        cnb.field_p = param0[0].a(125);
        return new nc((Object) (Object) "void");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 3;
    }
}
