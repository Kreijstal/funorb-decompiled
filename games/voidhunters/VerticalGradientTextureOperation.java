/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VerticalGradientTextureOperation extends TextureOperation {
    private static String field_z;

    final int[] getMonochromeRow(int param0, boolean param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (!param1) {
          this.getMonochromeRow(79, false);
          var4 = this.field_f.getRow((byte) 127, param0);
          var3 = var4;
          if (this.field_f.field_e) {
            ArrayOperations.fill(var4, 0, TextHotspotRegion.textureWidth, SetSalvoUsesAllEnergy.textureYCoordinates[param0]);
            return var4;
          }
          return var4;
        }
        var4Lifetime1 = this.field_f.getRow((byte) 127, param0);
        var3Lifetime1 = var4Lifetime1;
        if (!this.field_f.field_e) {
          return var4Lifetime1;
        }
        ArrayOperations.fill(var4Lifetime1, 0, TextHotspotRegion.textureWidth, SetSalvoUsesAllEnergy.textureYCoordinates[param0]);
        return var4Lifetime1;
    }

    public VerticalGradientTextureOperation() {
        super(0, true);
    }

    static {
        field_z = "peb.A(";
    }
}
