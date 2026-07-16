/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends cg {
    private fg field_o;
    static int field_k;
    static int field_l;
    private String field_j;
    static int[] field_n;
    private boolean field_m;

    final static de a(int param0, int param1) {
        int var3 = 0;
        int var4 = Main.field_T;
        de[] var5 = bg.v(113);
        de[] var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
            if (!(param1 != var5[var3].field_a)) {
                return var5[var3];
            }
        }
        if (param0 == -1) {
            return null;
        }
        return null;
    }

    p(hf param0, hf param1) {
        super(param0);
        ((p) this).field_j = "";
        ((p) this).field_m = false;
        ((p) this).field_o = new fg(param0, param1);
    }

    public static void g(int param0) {
        if (param0 != 0) {
            return;
        }
        field_n = null;
    }

    final String a(String param0, boolean param1) {
        if (param1) {
            ((p) this).field_j = null;
        }
        if (!(((p) this).field_o.a(param0, -79) != pe.field_b)) {
            return ((p) this).field_o.a(param0, param1);
        }
        if (((p) this).a(param0, -99) == pe.field_b) {
            return bk.field_b;
        }
        return gi.field_g;
    }

    final sg a(String param0, int param1) {
        lb var3 = null;
        if (param1 >= -58) {
            p.g(126);
        }
        if (!(((p) this).field_o.a(param0, -61) != pe.field_b)) {
            return pe.field_b;
        }
        if (!(param0.equals((Object) (Object) ((p) this).field_j))) {
            var3 = hg.a(param0, (byte) -125);
            if (!(var3.a(640))) {
                return a.field_n;
            }
            ((p) this).field_j = param0;
            ((p) this).field_m = var3.b(640);
        }
        return !((p) this).field_m ? pe.field_b : ii.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = -1;
    }
}
