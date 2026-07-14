/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static oa field_j;
    String field_b;
    int field_f;
    static int field_h;
    String field_m;
    int field_d;
    String field_a;
    int field_g;
    boolean field_l;
    boolean field_e;
    String field_i;
    static int field_c;
    String field_k;

    public static void a(int param0) {
        field_j = null;
        if (param0 != -2) {
            field_h = 12;
        }
    }

    lg(int param0) {
        ((lg) this).field_b = "";
        ((lg) this).field_l = false;
        ((lg) this).field_f = 0;
        ((lg) this).field_e = false;
        ((lg) this).field_m = "";
        ((lg) this).field_a = "";
        ((lg) this).field_i = "";
        ((lg) this).field_k = "";
        ((lg) this).field_m = kh.field_H[param0];
        ((lg) this).field_b = pf.field_e[param0];
        ((lg) this).field_k = bd.field_f[param0];
        ((lg) this).field_a = jg.field_jb[param0];
        int var2 = param0;
        if (-1 != (var2 ^ -1)) {
            // if_icmpeq L136
            // if_icmpeq L166
            // if_icmpne L221
        } else {
            ((lg) this).field_l = true;
            ((lg) this).field_i = ah.field_C;
            ((lg) this).field_g = 5;
            ((lg) this).field_l = true;
            ((lg) this).field_g = 50;
            ((lg) this).field_e = true;
            ((lg) this).field_i = qe.field_j;
            ((lg) this).field_f = 15;
            ((lg) this).field_f = 20;
            ((lg) this).field_i = th.field_e;
            ((lg) this).field_g = 100;
            ((lg) this).field_e = true;
        }
        ((lg) this).field_i = uj.field_e;
        ((lg) this).field_g = 100;
        ((lg) this).field_e = true;
        ((lg) this).field_d = 50;
        ((lg) this).field_f = 25;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new oa();
    }
}
