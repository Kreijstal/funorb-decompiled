/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ToolkitSprite implements RenderSurface {
    abstract int width();

    abstract void drawAffine(float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode, int flags);

    abstract int height();

    private final void drawRotatedAround(float x, float y, float originX, float originY, int scaleQ12, int angleQ16, int colorMode, int color, int blendMode) {
        double var10 = 0.0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        if (scaleQ12 != 0) {
          var10 = (double)(angleQ16 & 65535) * 0.00009587379924285257;
          var12 = (float)Math.sin(var10) * (float)scaleQ12;
          var13 = (float)Math.cos(var10) * (float)scaleQ12;
          var14 = (-originX * var13 + -originY * var12) / 4096.0f + x;
          var15 = (-(-originX) * var12 + -originY * var13) / 4096.0f + y;
          var16 = (((float)this.paddedWidth() - originX) * var13 + -originY * var12) / 4096.0f + x;
          var17 = (-((float)this.paddedWidth() - originX) * var12 + -originY * var13) / 4096.0f + y;
          var18 = (-originX * var13 + ((float)this.paddedHeight() - originY) * var12) / 4096.0f + x;
          var19 = (-(-originX) * var12 + ((float)this.paddedHeight() - originY) * var13) / 4096.0f + y;
          this.drawAffine(var14, var15, var16, var17, var18, var19, colorMode, color, blendMode);
          return;
        }
    }

    abstract void setInsets(int left, int top, int right, int bottom);

    final void drawRotated(float centerX, float centerY, int scaleQ12, int angleQ16) {
        this.drawRotatedAround(centerX, centerY, (float)this.paddedWidth() / 2.0f, (float)this.paddedHeight() / 2.0f, scaleQ12, angleQ16, 1, 0, 1);
    }

    abstract int paddedHeight();

    abstract int paddedWidth();

    final void drawScaled(int x, int y, int width, int height, int colorMode, int color, int blendMode) {
        this.drawScaled(x, y, width, height, colorMode, color, blendMode, 1);
    }

    final void draw(int x, int y) {
        this.draw(x, y, 1, 0, 1);
    }

    private final void drawAffine(float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode) {
        this.drawAffine(x0, y0, x1, y1, x2, y2, colorMode, color, blendMode, 1);
    }

    abstract void draw(int x, int y, int colorMode, int color, int blendMode);

    abstract void drawScaled(int x, int y, int width, int height, int colorMode, int color, int blendMode, int flags);

    final void drawRotated(float centerX, float centerY, int scaleQ12, int angleQ16, int colorMode, int color, int blendMode) {
        this.drawRotatedAround(centerX, centerY, (float)this.paddedWidth() / 2.0f, (float)this.paddedHeight() / 2.0f, scaleQ12, angleQ16, colorMode, color, blendMode);
    }
}
