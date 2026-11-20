/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollingTexturePixels extends IntrusiveNode {
    private int width;
    int textureId;
    boolean field_h;
    private static int[] scratchPixels;
    int animationElapsedMillis;
    private int[] pixels;

    final void scroll(int param0, int param1) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param0 == 0 &&
          param1 == 0) {
          return;
        }
        if (scratchPixels == null ||
          scratchPixels.length != this.pixels.length) {
          scratchPixels = new int[this.pixels.length];
        }
        int var3 = this.pixels.length;
        int var4 = param0;
        int var5 = this.width - 1;
        int var6 = this.width * param1;
        int var7 = var3 - 1;
        for (var8_int = 0; var8_int < var3; var8_int = var8_int + this.width) {
          var9 = var8_int + var6 & var7;
          for (var10 = 0; var10 < this.width; var10++) {
            var11 = var8_int + var10;
            var12 = var9 + (var10 + var4 & var5);
            scratchPixels[var11] = this.pixels[var12];
          }
        }
        int[] var8 = this.pixels;
        this.pixels = scratchPixels;
        scratchPixels = var8;
    }

    public static void clearSharedReferences() {
        scratchPixels = null;
    }

    private ScrollingTexturePixels() throws Throwable {
        throw new Error();
    }
}
