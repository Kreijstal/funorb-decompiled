/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterStateFrame extends IntrusiveNode {
    int clipRight;
    static int field_k;
    static SpriteData[] field_l;
    static int field_n;
    int width;
    int clipBottom;
    int[] pixels;
    int clipTop;
    int clipLeft;
    static int field_q;
    static SpriteData field_o;
    int height;

    public static void releaseStatics(int param0) {
        field_o = null;
        if (param0 != 480) {
          RasterStateFrame.releaseStatics(99);
          field_l = null;
          return;
        }
        field_l = null;
    }

    final void set(int width, int height, int[] pixels, int right, byte guard, int top, int left, int bottom) {
        this.pixels = pixels;
        this.clipTop = top;
        this.clipLeft = left;
        if (guard >= -53) {
          return;
        }
        try {
          this.clipBottom = bottom;
          this.clipRight = right;
          this.height = height;
          this.width = width;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rl.A(" + width + ',' + height + ',' + (pixels != null ? "{...}" : "null") + ',' + right + ',' + guard + ',' + top + ',' + left + ',' + bottom + ')');
        }
    }

    RasterStateFrame() {
    }

    static {
        field_k = 480;
    }
}
