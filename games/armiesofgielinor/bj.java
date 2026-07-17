/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends tc {
    static String field_o;
    static String field_l;
    int field_n;
    static String field_q;
    static boolean field_k;
    int field_m;
    static wk[] field_p;

    final static wk e() {
        int[] var20 = null;
        int[] var16 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        Object var3 = null;
        int[] var21 = null;
        int[] var17 = null;
        int[] var9 = null;
        int var5 = 0;
        byte[] var18 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var1 = qm.field_K[0] * c.field_e[0];
        byte[] var19 = vj.field_j[0];
        if (ne.field_e[0]) {
            var18 = cq.field_z[0];
            var20 = new int[var1];
            var16 = var20;
            var13 = var16;
            var11 = var13;
            var5_ref_int__ = var11;
            for (var6 = 0; var6 < var1; var6++) {
                var5_ref_int__[var6] = oe.c(rn.a(255, (int) var18[var6]) << 24, qv.field_j[rn.a(255, (int) var19[var6])]);
            }
            var3 = (Object) (Object) new nj(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var20);
        } else {
            var21 = new int[var1];
            var17 = var21;
            var9 = var17;
            for (var5 = 0; var1 > var5; var5++) {
                var9[var5] = qv.field_j[rn.a(255, (int) var19[var5])];
            }
            var3 = (Object) (Object) new wk(lg.field_d, wr.field_J, j.field_e[0], iq.field_g[0], qm.field_K[0], c.field_e[0], var21);
        }
        rj.d((byte) 113);
        return (wk) var3;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != 0) {
            return;
        }
        field_p = null;
        field_q = null;
        field_o = null;
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Equipment to sway the battle in your favour.";
        field_l = "Sandbox";
        field_k = true;
        field_o = "Highscores";
    }
}
