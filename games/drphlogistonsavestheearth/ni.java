/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends ei {
    static cd field_s;
    static int field_x;
    static String field_u;
    static String[] field_r;
    static jb field_q;
    static int field_t;
    static boolean field_w;
    static int field_p;
    static int[] field_v;

    ni(kl param0) {
        super(param0);
    }

    final String a(byte param0, String param1) {
        if (((ni) this).a(8192, param1) == u.field_b) {
            return lf.field_d;
        }
        if (param0 < 47) {
            field_q = null;
            return fl.field_e;
        }
        return fl.field_e;
    }

    public static void d(byte param0) {
        field_q = null;
        int var1 = 55 / ((-52 - param0) / 49);
        field_u = null;
        field_s = null;
        field_r = null;
        field_v = null;
    }

    final vh a(int param0, String param1) {
        int var3 = 0;
        if (param0 != 8192) {
            field_s = null;
            var3 = bc.a(param1, -3303) == null ? 1 : 0;
            if (!(var3 != 0)) {
                return u.field_b;
            }
            return ce.field_e;
        }
        var3 = bc.a(param1, -3303) == null ? 1 : 0;
        if (!(var3 != 0)) {
            return u.field_b;
        }
        return ce.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_x = 0;
        field_s = new cd();
        field_r = new String[]{"All scores", "My scores", "Best each"};
        field_t = 5;
        field_w = false;
        field_v = new int[]{6, 50, 50, 56};
    }
}
