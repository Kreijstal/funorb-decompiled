/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends o {
    int field_r;
    static rk[] field_v;
    int field_q;
    static int field_s;
    String[][] field_t;
    static um field_o;
    int field_k;
    int[][] field_j;
    int field_m;
    boolean field_l;
    int field_u;
    int field_p;
    static String field_n;

    public static void c(byte param0) {
        field_o = null;
        field_n = null;
        field_v = null;
        int var1 = 0;
    }

    final static void a(byte param0, di param1) {
        if (!(param1 != null)) {
            return;
        }
        tl.field_Fb = param1;
        rh.field_c.field_I.e(-31023);
        rh.field_c.a((byte) 126, (ci) (Object) tl.field_Fb);
        try {
            an.field_c = true;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "pg.A(" + -18 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static vg a(int param0) {
        return new vg(jb.f(98), kb.j(-111));
    }

    pg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Concluded";
    }
}
