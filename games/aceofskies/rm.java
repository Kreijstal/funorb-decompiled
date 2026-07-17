/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static String field_c;
    static int field_e;
    int field_f;
    int field_d;
    int field_a;
    int field_b;
    static int[] field_g;

    public static void a() {
        field_g = null;
        field_c = null;
    }

    final static boolean a(int param0) {
        if (!(ag.field_s != -1)) {
            if (!(wo.a(1, true))) {
                return false;
            }
            ag.field_s = nm.field_c.g(43);
            nm.field_c.field_g = 0;
        }
        if (!(ag.field_s != -2)) {
            if (wo.a(2, true)) {
                ag.field_s = nm.field_c.i((byte) 0);
                nm.field_c.field_g = 0;
                return wo.a(ag.field_s, true);
            }
            return false;
        }
        return wo.a(ag.field_s, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Connection timed out. Please try using a different server.";
        field_e = 0;
    }
}
