/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    String field_e;
    static int field_b;
    static String field_c;
    boolean field_g;
    static boolean field_a;
    static ll field_d;
    String field_f;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != 544) {
            field_c = (String) null;
        }
        return (((param0 & 24) != 0 ? 1 : 0) | ((param0 & 544 ^ -1) == -545 ? 1 : 0)) != 0;
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != -11760) {
            ll[] discarded$0 = gl.a(20);
        }
    }

    final static vt a(gk param0, String param1, String param2, gk param3, int param4) {
        if (param4 != 24) {
            ll[] discarded$0 = gl.a(-112);
        }
        int var5 = param0.b(param2, 0);
        int var6 = param0.a(-79, var5, param1);
        return eo.a(param0, var6, -112, var5, param3);
    }

    final static vt a(byte[] param0, int param1) {
        if (param0 == null) {
            return null;
        }
        vt var2 = new vt(param0, lh.field_a, lg.field_j, ji.field_b, ee.field_e, fk.field_a);
        kf.f(1);
        if (param1 != 544) {
            field_a = false;
        }
        return var2;
    }

    final static ll[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = AceOfSkies.field_G ? 1 : 0;
        ll[] var1 = new ll[to.field_t];
        for (var2 = param0; var2 < to.field_t; var2++) {
            var3 = ee.field_e[var2] * ji.field_b[var2];
            var4 = fk.field_a[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = ud.field_e[pg.a(255, (int) var4[var6])];
            }
            var1[var2] = new ll(pu.field_a, cc.field_i, lh.field_a[var2], lg.field_j[var2], ji.field_b[var2], ee.field_e[var2], var5);
        }
        kf.f(1);
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "start game";
    }
}
