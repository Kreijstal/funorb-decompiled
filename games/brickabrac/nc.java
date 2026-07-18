/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static jp field_e;
    int field_i;
    byte[][] field_j;
    static int field_g;
    wk[] field_c;
    static int field_k;
    static String field_f;
    int field_d;
    int field_h;
    int field_b;
    static int[] field_a;

    final void a(nc param0, boolean param1) {
        int var4 = 0;
        int var7 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!(param0.field_h < 0)) {
            throw new RuntimeException();
        }
        byte[][] var6 = new byte[((nc) this).field_i + param0.field_i][];
        byte[][] var3 = var6;
        if (param1) {
            return;
        }
        try {
            for (var4 = 0; var4 < ((nc) this).field_i; var4++) {
                var6[var4] = ((nc) this).field_j[var4];
            }
            var7 = 0;
            var4 = var7;
            while (param0.field_i > var7) {
                var3[var7 - -((nc) this).field_i] = param0.field_j[var7];
                var7++;
            }
            ((nc) this).field_i = ((nc) this).field_i + param0.field_i;
            ((nc) this).field_j = var3;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "nc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
    }

    final static void b(int param0) {
        if (!(null != ua.field_d)) {
            return;
        }
        t.a(false, (java.awt.Canvas) (Object) ua.field_d);
        ua.field_d.a(lp.field_ub, 121);
        ua.field_d = null;
        if (param0 <= 49) {
            field_f = null;
        }
        if (!(null == jj.field_a)) {
            jj.field_a.a(-33);
        }
        kj.field_D.requestFocus();
    }

    final static mh c(int param0) {
        int var1 = -61 / ((param0 - -36) / 63);
        return vp.field_u.field_Rb;
    }

    nc(int param0, int param1, int param2) {
        ((nc) this).field_b = param1;
        ((nc) this).field_h = param0;
        ((nc) this).field_d = param2;
    }

    final static boolean a(int param0, String param1) {
        return pf.a(false, param1) != null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 360;
        field_f = "<%0> has been removed.";
        field_a = new int[]{8, 23};
    }
}
