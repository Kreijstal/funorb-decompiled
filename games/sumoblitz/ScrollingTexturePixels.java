/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollingTexturePixels extends IntrusiveNode {
    private static int[] scratch;
    boolean used;
    private int size;
    int textureId;
    int elapsedMillis;
    private int[] pixels;

    public static void releaseStatics() {
        scratch = null;
    }

    final void scroll(int offsetX, int offsetY) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (offsetX == 0 &&
          offsetY == 0) {
          return;
        }
        if (scratch == null ||
          scratch.length != this.pixels.length) {
          scratch = new int[this.pixels.length];
        }
        int var3 = this.pixels.length;
        int var4 = offsetX;
        int var5 = this.size - 1;
        int var6 = this.size * offsetY;
        int var7 = var3 - 1;
        for (var8_int = 0; var8_int < var3; var8_int = var8_int + this.size) {
          var9 = var8_int + var6 & var7;
          for (var10 = 0; var10 < this.size; var10++) {
            var11 = var8_int + var10;
            var12 = var9 + (var10 + var4 & var5);
            scratch[var11] = this.pixels[var12];
          }
        }
        int[] var8 = this.pixels;
        this.pixels = scratch;
        scratch = var8;
    }

    private ScrollingTexturePixels() throws Throwable {
        throw new Error();
    }
}
