/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    static String field_e;
    static String field_f;
    static int field_b;
    static jp field_d;
    static jp[][] field_c;
    static int field_a;

    final static void b() {
        int discarded$0 = 84;
        bj.field_T = sh.a();
        mf.field_f = new cp();
        ag.a((byte) -16, true, true);
    }

    public static void a(boolean param0) {
        field_f = null;
        field_d = null;
        field_e = null;
        field_c = null;
        if (!param0) {
            np.a(false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = "Decline invitation to <%0>'s game";
    }
}
