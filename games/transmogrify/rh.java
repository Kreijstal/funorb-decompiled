/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rh extends ri {
    static am field_t;
    volatile boolean field_m;
    static qj field_r;
    boolean field_o;
    private static tf field_u;
    boolean field_p;
    static pd field_v;
    static ti[] field_l;
    static ti field_s;
    static int field_n;
    static kg field_q;

    final static String a(byte param0, int param1) {
        int var2 = 0;
        return param1 + "/" + db.field_b.length;
    }

    final static tf[] d() {
        return new tf[]{nf.field_m, og.field_d, oa.field_l, field_u, ef.field_e, gk.field_b, rf.field_db, gk.field_d, gh.field_g, oj.field_m, u.field_c, kb.field_q, ik.field_cb, nj.field_g};
    }

    public static void b() {
        field_s = null;
        field_t = null;
        field_l = null;
        field_u = null;
        field_v = null;
        field_q = null;
        field_r = null;
    }

    abstract int f(int param0);

    abstract byte[] e(int param0);

    rh() {
        ((rh) this).field_m = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = null;
        field_r = new qj();
        field_u = new tf(4, 1, 1, 1);
    }
}
