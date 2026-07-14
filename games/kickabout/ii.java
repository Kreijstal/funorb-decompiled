/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends gn {
    static String field_h;
    int field_j;
    static String field_m;
    int field_g;
    int field_f;
    int field_i;
    static int field_l;
    int field_e;
    int field_k;

    final static void b(int param0) {
        int var1 = 0;
        eg var4 = null;
        eg var5 = null;
        int var3 = Kickabout.field_G;
        ad.field_c = new ut[je.field_g.length];
        if (param0 != 65280) {
            field_l = -68;
            for (var1 = 0; var1 < je.field_g.length; var1++) {
                ad.field_c[var1] = new ut(94, 84);
                var4 = df.a(var1, (int) wk.a(255, 63), true, (int) wk.a(65280, param0 + -65217)).b(100, 728, 20, -56, -20);
                pe.a(var4, ad.field_c[var1], var1, 40);
            }
            return;
        }
        for (var1 = 0; var1 < je.field_g.length; var1++) {
            ad.field_c[var1] = new ut(94, 84);
            var5 = df.a(var1, (int) wk.a(255, 63), true, (int) wk.a(65280, param0 + -65217)).b(100, 728, 20, -56, -20);
            pe.a(var5, ad.field_c[var1], var1, 40);
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 84) {
            field_m = null;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final static void a(hn param0, int param1) {
        ic.field_h.a(param0, cq.e(15137), 0);
        da.field_h.a((gn) (Object) param0, 3);
        if (param1 < 47) {
            field_h = null;
        }
    }

    final static void a(byte param0) {
        wh discarded$4 = sp.c(48, 36);
        if (param0 >= -116) {
            field_h = null;
        }
    }

    private ii() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "MY KIT";
        field_m = "Connection restored.";
        field_l = 0;
    }
}
