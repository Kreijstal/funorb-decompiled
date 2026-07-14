/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends rqa {
    static dja field_q;
    static dcb field_o;
    static int field_p;

    ag(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_q = null;
        field_o = null;
        if (param0) {
            ag.b(true);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(164, 84));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = (dja) (Object) new cn();
        field_o = new dcb(0, 0);
    }
}
