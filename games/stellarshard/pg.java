/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends wl {
    static ha field_fb;
    static pb[] field_hb;
    static hl field_cb;
    static volatile int field_gb;
    static String field_eb;
    static pf field_db;

    final void b(rj param0, int param1) {
        super.b(param0, param1 ^ 0);
        if (param1 != 23143) {
            pg.m(21);
        }
    }

    pg(ei param0, rj param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void m(int param0) {
        field_hb = null;
        field_db = null;
        field_eb = null;
        field_fb = null;
        field_cb = null;
        if (param0 != 7694) {
            pg.m(-42);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = -1;
        field_eb = "Unfortunately we are unable to create an account for you at this time.";
    }
}
