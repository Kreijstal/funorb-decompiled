/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br {
    static String field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        String var2 = pb.field_G[35];
        String var4 = var2;
        var4 = var2;
        String var3 = lw.field_a[param1];
        if (!(!th.field_a[param1])) {
            var3 = ma.field_w;
            var4 = var3;
            var4 = var3;
        }
        var4 = vo.a((byte) -18, gd.field_e[35], new String[2]);
        if (hv.field_a[param1]) {
            if (!c.a(param1, 0, bh.field_f)) {
                var4 = vu.field_Gb;
            }
        }
        np.field_Jb.a((gn) (Object) new i(35, (lv) null, var2, var4), 3);
    }

    final static boolean a(int param0) {
        if (null == k.field_m) {
            return false;
        }
        if (!k.field_m.h((byte) 16)) {
            return false;
        }
        return true;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The team captain is choosing a formation.";
        field_a = "Show players in <%0>'s game";
    }
}
