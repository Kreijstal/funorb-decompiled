/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    private long field_e;
    static String field_c;
    private gb[] field_d;
    private int field_a;
    private gb field_b;

    final static long b(int param0) {
        if (param0 != -21676) {
        }
        return -he.field_a + qg.a(false);
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        ij.a((byte) 120, fj.field_U, param1, vi.field_d, oe.field_c, true, 0);
        for (var2 = param0; var2 < oe.field_c; var2++) {
            lf.field_Y[param1 + var2] = var2;
        }
        ij.a((byte) 119, mj.field_d, param1 + param1, sd.field_b, param1 + oe.field_c, false, param1);
        if (!(oe.field_c <= param1)) {
            oe.field_c = param1;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            bj.a(84, -97);
        }
    }

    final gb a(int param0) {
        gb var3 = null;
        int var4 = TrackController.field_F ? 1 : 0;
        if (null == ((bj) this).field_b) {
            return null;
        }
        gb var2 = ((bj) this).field_d[(int)(((bj) this).field_e & (long)(param0 + ((bj) this).field_a))];
        while (((bj) this).field_b != var2) {
            if (!(((bj) this).field_b.field_m != ((bj) this).field_e)) {
                var3 = ((bj) this).field_b;
                ((bj) this).field_b = ((bj) this).field_b.field_k;
                return var3;
            }
            ((bj) this).field_b = ((bj) this).field_b.field_k;
        }
        ((bj) this).field_b = null;
        return null;
    }

    final void a(gb param0, long param1, int param2) {
        if (null != param0.field_j) {
            param0.e(0);
        }
        gb var5 = ((bj) this).field_d[(int)(param1 & (long)(((bj) this).field_a + -1))];
        param0.field_j = var5.field_j;
        param0.field_k = var5;
        param0.field_j.field_k = param0;
        param0.field_m = param1;
        int var6 = -35 / ((param2 - 52) / 58);
        param0.field_k.field_j = param0;
    }

    final gb a(int param0, long param1) {
        gb var5 = null;
        int var6 = TrackController.field_F ? 1 : 0;
        ((bj) this).field_e = param1;
        gb var4 = ((bj) this).field_d[(int)(param1 & (long)(param0 + ((bj) this).field_a))];
        ((bj) this).field_b = var4.field_k;
        while (((bj) this).field_b != var4) {
            if (!(param1 != ((bj) this).field_b.field_m)) {
                var5 = ((bj) this).field_b;
                ((bj) this).field_b = ((bj) this).field_b.field_k;
                return var5;
            }
            ((bj) this).field_b = ((bj) this).field_b.field_k;
        }
        ((bj) this).field_b = null;
        return null;
    }

    bj(int param0) {
        int var2 = 0;
        gb var3 = null;
        ((bj) this).field_d = new gb[param0];
        ((bj) this).field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new gb();
            ((bj) this).field_d[var2] = new gb();
            var3.field_j = var3;
            var3.field_k = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Passwords must be between 5 and 20 letters and numbers";
    }
}
