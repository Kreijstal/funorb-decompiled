/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fh extends gp {
    static String field_v;
    static java.awt.Font field_t;
    static int field_w;
    static int[] field_u;
    static String field_x;
    static fo[] field_y;

    fh() {
    }

    final static void a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            rh.field_I.field_S = param0;
            ce.field_c = true;
            var2_int = ro.field_g.field_i;
            var3 = ro.field_g.field_d;
            var4 = rh.field_I.field_z.a(param0, 272, rh.field_I.field_qb);
            var5 = -(var4 / 2) + 7 + (-110 + var3 / 2);
            oc.field_v.a(77, 320, -120 + var3 - var5 * 2, var5, (-320 + var2_int) / 2);
            oc.field_v.field_Bb = vl.a(oc.field_v.field_db, 3, 0, 2105376, 11579568, 8421504);
            rh.field_I.a(125, -48 + oc.field_v.field_Fb, -20 + (oc.field_v.field_db + -24), 16, 24);
            gb.field_c.a(79, 80, 24, -44 + oc.field_v.field_db, 120);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "fh.A(" + (param0 != null ? "{...}" : "null") + 44 + -19615 + 41);
        }
    }

    public static void h(int param0) {
        field_u = null;
        int var1 = -58 / ((-23 - param0) / 51);
        field_t = null;
        field_x = null;
        field_y = null;
        field_v = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
        field_v = "<col=ee9d32>Items - Blocks 2/2</col>";
        field_x = "Invite only";
        field_y = new fo[23];
        field_u = new int[8192];
    }
}
