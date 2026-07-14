/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends ma {
    boolean field_v;
    int field_l;
    String field_x;
    int field_s;
    static String field_r;
    static int field_m;
    dd field_n;
    static int field_u;
    int field_q;
    static dd field_w;
    static String field_t;
    static boolean field_o;
    int field_p;

    public static void a(int param0) {
        field_r = null;
        field_w = null;
        field_t = null;
        if (param0 != -24061) {
            field_u = 64;
        }
    }

    final void c(int param0) {
        int var2 = sa.field_h.b(((lk) this).field_x);
        ((lk) this).field_n = new dd(2 + var2, sa.field_h.field_C - (-sa.field_h.field_w + -2));
        ((lk) this).field_n.e();
        sa.field_h.a((bb[]) (Object) nf.field_Z, bi.field_d);
        sa.field_h.d(((lk) this).field_x, 1, 1 + sa.field_h.field_C, ((lk) this).field_s, param0);
        sh.field_P.b(param0 ^ -15101);
        ((lk) this).field_n.e((16711423 & ((lk) this).field_s) >> 945865697);
    }

    lk() {
        ((lk) this).field_n = null;
        ((lk) this).field_q = 1;
        ((lk) this).field_p = 230;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Now that you have finished potting all of your group's balls, you must pot the black ball (without fouling) to win.";
        field_u = 0;
        field_t = "This game option is only available to members.";
        field_o = false;
    }
}
