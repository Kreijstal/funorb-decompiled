/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VerticalGradientOperator extends TextureOperator {
    static int field_m;
    static int field_n;
    private static String field_z;

    public VerticalGradientOperator() {
        super(0, true);
    }

    final int[] getMonochromeRow(int param0, int param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param0 != 1) {
          this.getMonochromeRow(-83, -24);
          var4 = this.monochromeCache.getRow((byte) -108, param1);
          var3 = var4;
          if (this.monochromeCache.rowMissed) {
            ArrayUtils.fill(var4, 0, ns.textureWidth, sj.textureRowCoords[param1]);
            return var4;
          }
          return var4;
        }
        var4Lifetime1 = this.monochromeCache.getRow((byte) -108, param1);
        var3Lifetime1 = var4Lifetime1;
        if (!this.monochromeCache.rowMissed) {
          return var4Lifetime1;
        }
        ArrayUtils.fill(var4Lifetime1, 0, ns.textureWidth, sj.textureRowCoords[param1]);
        return var4Lifetime1;
    }

    static {
        field_z = "gm.H(";
    }
}
