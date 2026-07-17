/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends gg {
    static uc field_m;
    static String field_r;
    int field_o;
    static pb field_s;
    static int field_q;
    int field_t;
    static String field_k;
    static int field_p;
    static boolean field_u;
    static boolean field_n;
    static String field_l;

    final static void a() {
        la.field_B = new mj();
        sf.field_f.b((rj) (Object) la.field_B, 23143);
    }

    final static void a(boolean param0, int param1) {
        sl.field_b = 0;
        ha.field_w = cj.field_c;
        gj.field_v = 0;
        nk.field_c = 0;
        cd.field_L = new qd(2);
        if (param1 != 713) {
          ta.a(false, -126);
          cd.field_L.a(af.a(1, ni.field_e, eb.field_a), -1, param0, false);
          return;
        } else {
          cd.field_L.a(af.a(1, ni.field_e, eb.field_a), -1, param0, false);
          return;
        }
    }

    public static void a(boolean param0) {
        field_m = null;
        field_r = null;
        field_l = null;
        field_s = null;
        field_k = null;
    }

    private ta() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Highscores";
        field_k = "Create";
        field_m = new uc();
        field_l = "Confirm Password: ";
    }
}
