/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends k {
    static ee[] field_k;
    static int[] field_l;

    final int[] a(int param0, int param1) {
        int[][] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        int[] var10 = ((sj) this).field_j.a(param0, -1);
        int[] var3 = var10;
        if (param1 != 0) {
            return null;
        }
        if (!(!((sj) this).field_j.field_m)) {
            var4 = ((sj) this).a((byte) -62, 0, param0);
            var5 = var4[0];
            var6 = var4[1];
            var7 = var4[2];
            for (var8 = 0; var8 < hh.field_d; var8++) {
                var10[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
            }
        }
        return var3;
    }

    public static void d(int param0) {
        field_k = null;
        field_l = null;
        if (param0 != 0) {
            sj.d(79);
        }
    }

    public sj() {
        super(1, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[]{16777215, 16728128, 16744448};
    }
}
