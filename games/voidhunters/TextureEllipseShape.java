/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureEllipseShape extends TextureRasterShape {
    private int centerY;
    private int radiusY;
    private int centerX;
    private int radiusX;

    final void drawOutline(byte param0, int param1, int param2) {
        int var4 = 85 / ((param0 + 48) / 40);
    }

    TextureEllipseShape(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.centerY = param1;
        this.centerX = param0;
        this.radiusY = param3;
        this.radiusX = param2;
    }

    final void drawFilled(byte param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var4 = this.centerX * param1 >> 12;
        int var5 = this.radiusX * param1 >> 12;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param0 == -112) {
          var6 = this.centerY * param2 >> 12;
          var7 = param2 * this.radiusY >> 12;
          EllipseRasterizer.fillEllipse(var4, var7, param0 + 17112, var5, this.fillColor, var6);
          return;
        }
        this.centerY = -14;
        var6Lifetime1 = this.centerY * param2 >> 12;
        var7Lifetime1 = param2 * this.radiusY >> 12;
        EllipseRasterizer.fillEllipse(var4, var7Lifetime1, param0 + 17112, var5, this.fillColor, var6Lifetime1);
    }

    final void drawFilledAndOutline(int param0, byte param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var4 = param2 * this.centerX >> 12;
        int var5 = param2 * this.radiusX >> 12;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param1 == 110) {
          var6 = this.centerY * param0 >> 12;
          var7 = param0 * this.radiusY >> 12;
          GetShipToShipRamDamage.fillBorderedEllipse((byte) 11, var7, this.fillColor, this.outlineWidth, this.outlineColor, var5, var4, var6);
          return;
        }
        this.centerY = -115;
        var6Lifetime1 = this.centerY * param0 >> 12;
        var7Lifetime1 = param0 * this.radiusY >> 12;
        GetShipToShipRamDamage.fillBorderedEllipse((byte) 11, var7Lifetime1, this.fillColor, this.outlineWidth, this.outlineColor, var5, var4, var6Lifetime1);
    }

    static {
    }
}
