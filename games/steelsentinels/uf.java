/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static ul field_f;
    static int[] field_b;
    static int[] field_a;
    mj field_d;
    static int field_h;
    static String field_e;
    static int field_c;
    static rf field_g;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_g = null;
        field_a = null;
        if (param0 != 24) {
            field_b = null;
        }
    }

    final static int a(int param0, int[] param1) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        int var2 = 0;
        if (param0 < 54) {
            field_b = null;
        }
        for (var3 = 0; var3 < param1.length; var3++) {
            var2 = var2 + mm.a((byte) 124, param1[var3]);
        }
        return var2;
    }

    uf(String param0, gh param1) {
        String[] var3 = new String[]{param0, ad.field_a, cf.field_A};
        gh[] var4 = new gh[]{param1, ig.field_m, (gh) (Object) vi.field_W};
        ((uf) this).field_d = new mj(0L, ka.field_U, var3, be.field_c, var4, 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        ((uf) this).field_d.a(10, param0, var7, param2, param4, var6, param1);
        vc.field_h.a(0, 0, db.field_b, 0, ig.field_m.field_zb);
        mm.field_a.a(0, 2 + db.field_b, 18, 0, -2 + (-80 + ig.field_m.field_zb + (-ua.field_G + -2)));
        dh.field_E.a(0, db.field_b + 2, 18, -ua.field_G + (ig.field_m.field_zb - 82), 82 - -ua.field_G);
        km.field_j.a(ig.field_m.field_zb, -20 + ig.field_m.field_Lb + (-db.field_b - 2), 2, 0, 20, 122, ua.field_G, param3 + (db.field_b - -20));
        vi.field_W.a(2, 20, param3 ^ 46, ua.field_G);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_e = "<%0> has been removed.";
        field_f = new ul();
        field_c = 0;
        field_g = new rf();
    }
}
