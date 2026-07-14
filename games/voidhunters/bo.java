/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(74, 79));
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -26081) {
            bo.a(-127);
        }
    }

    final static void a(byte param0, tv param1) {
        bk.field_w.field_e = 0;
        bk.field_w.q(-77);
        param1.b(bk.field_w, -117);
        bk.field_w.r(32712);
        int var2 = 1 % ((param0 - 38) / 57);
    }

    bo(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Status";
    }
}
