/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uka extends rqa {
    static String field_o;
    static String[] field_p;

    public static void a(int param0) {
        field_p = null;
        if (param0 != 0) {
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        lua.field_d = param0[0].a(66);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    uka(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Out of sync";
        vfb discarded$0 = new vfb();
    }
}
