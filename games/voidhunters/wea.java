/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wea extends rqa {
    static String field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 153) {
            field_o = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_o = null;
        }
        si.a(153, 62, param0[0].a(18));
        return new nc((Object) (Object) "void");
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        for (var2 = 0; var2 < ub.field_f.length; var2++) {
            if (!(param1 != ub.field_f[var2])) {
                return true;
            }
        }
        if (param0 != -25915) {
            field_o = null;
            return false;
        }
        return false;
    }

    wea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Waiting for graphics";
    }
}
