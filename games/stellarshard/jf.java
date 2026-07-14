/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends gg {
    static int[] field_k;
    static String field_l;
    static pf field_m;
    int field_o;
    static pb[] field_n;

    final static void e(int param0) {
        int[] var3 = null;
        int[] var10 = null;
        ha var5 = null;
        int var6 = 0;
        int var7 = 0;
        he var13 = null;
        int[] var11 = null;
        kl var12 = null;
        he var15 = null;
        int var8 = stellarshard.field_B;
        if (param0 <= 79) {
            return;
        }
        ha var14 = ae.field_N;
        int var2 = var14.f(4);
        if (var2 == 0) {
            var11 = ac.d((byte) 127);
            var3 = var11;
            var10 = var11;
            int[] var4 = var10;
            var5 = var14;
            var6 = ((ka) (Object) var5).f(4);
            for (var7 = 0; var7 < var6; var7++) {
                var10[var7] = ((ka) (Object) var5).b(false);
            }
            var13 = (he) (Object) pl.field_W.b(-78);
            if (!(var13 != null)) {
                oj.c(-2290);
                return;
            }
            var13.field_m = var3;
            var13.field_n = true;
            var13.c(20);
        } else {
            if ((var2 ^ -1) == -2) {
                var12 = (kl) (Object) nl.field_e.b(-97);
                if (!(var12 != null)) {
                    oj.c(-2290);
                    return;
                }
                var12.c(20);
            } else {
                if ((var2 ^ -1) == -3) {
                    var15 = (he) (Object) pl.field_W.b(-98);
                    if (var15 == null) {
                        oj.c(-2290);
                        return;
                    }
                    var15.field_m = ac.d((byte) 126);
                    var15.field_n = true;
                    var15.c(20);
                } else {
                    qe.a(115, "A1: " + bh.b((byte) -121), (Throwable) null);
                    oj.c(-2290);
                }
            }
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != -15917) {
            jf.e(-107);
        }
        field_n = null;
        field_k = null;
        field_l = null;
    }

    final static void d(int param0) {
        ck.field_db = false;
        gk.field_a = false;
        rh.a(param0, (byte) -72);
        el.field_E = ok.field_a;
        o.field_l = ok.field_a;
    }

    final static String b(CharSequence param0, boolean param1) {
        if (!param1) {
            jf.a(-95);
        }
        String var2 = cj.a(nd.a(param0, (byte) -35), (byte) -112);
        if (!(var2 != null)) {
            var2 = "";
        }
        return var2;
    }

    jf(int param0) {
        ((jf) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[8192];
        field_l = "Gravity Well";
    }
}
