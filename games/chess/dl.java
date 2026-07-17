/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    int field_d;
    int field_g;
    static String field_h;
    int field_f;
    static tk field_j;
    byte[] field_k;
    int field_e;
    byte[] field_a;
    static String field_m;
    int field_b;
    int field_l;
    static int field_n;
    int field_i;
    static bn[] field_c;

    final static rk[] a(int param0) {
        int var2 = 0;
        int var3 = Chess.field_G;
        rk[] var1 = new rk[h.field_n];
        for (var2 = 0; var2 < h.field_n; var2++) {
            var1[var2] = new rk(cd.field_p, ek.field_a, be.field_a[var2], a.field_c[var2], wm.field_b[var2], b.field_c[var2], vk.field_d[var2], uh.field_r);
        }
        if (param0 != -15326) {
            rk[] discarded$0 = dl.a(-33);
        }
        int discarded$1 = 4210752;
        ch.k();
        return var1;
    }

    public static void b() {
        field_m = null;
        field_h = null;
        field_j = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> has lost connection.";
        field_m = "Only show lobby chat from my friends";
        field_n = -1;
        field_j = new tk();
        field_c = new bn[7];
    }
}
