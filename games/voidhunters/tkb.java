/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tkb extends rqa {
    static int field_p;
    static String field_o;

    final static void a(ml param0, int param1) {
        param0.a(1, 1, new ml(13));
        param0.a(1, 3, new ml(13));
        param0.a(1, 23, new ml(13));
        param0.a(1, 25, new ml(13));
        param0.a(1, 11, new ml(15));
        param0.a(1, 15, new ml(15));
        param0.a(1, 10, new ml(42));
        param0.a(1, 13, new ml(42));
        param0.a(1, 16, new ml(42));
        ml var4 = new ml(31);
        var4.a(1, 1, new ml(13));
        var4.a(1, 2, new ml(13));
        var4.a(1, 3, new ml(13));
        var4.a(1, 0, new ml(15));
        param0.a(1, 7, var4);
        int var2 = 13 % ((param1 - 61) / 42);
        ml var3 = new ml(31);
        var3.a(1, 0, new ml(13));
        var3.a(1, 2, new ml(13));
        var3.a(1, 3, new ml(13));
        var3.a(1, 1, new ml(15));
        param0.a(1, 19, var3);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 3) {
            Object var2 = null;
            tkb.a((ml) null, 113);
        }
    }

    tkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(206, 122));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 1;
    }
}
