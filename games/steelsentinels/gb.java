/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gb {
    static wk field_d;
    static String field_b;
    static gh[] field_f;
    static int field_a;
    static tg field_e;
    static ta field_c;

    abstract void a(byte param0, byte[] param1);

    abstract byte[] a(int param0);

    final static fm[] b() {
        return new fm[]{bk.field_M, ck.field_g, ig.field_n, gf.field_b, jb.field_D, wc.field_c, pc.field_p, nk.field_O, qb.field_H, li.field_x, wn.field_b, ml.field_b, sh.field_b, pe.field_A};
    }

    public static void a() {
        field_c = null;
        field_d = null;
        field_e = null;
        field_f = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new wk(270, 70);
        field_b = "Show chat (1 unread message)";
        field_a = 0;
    }
}
