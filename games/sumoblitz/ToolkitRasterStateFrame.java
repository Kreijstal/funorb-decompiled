/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitRasterStateFrame {
    static int field_e;
    ToolkitRasterStateFrame previous;
    int clipTop;
    int clipRight;
    static SpriteData field_a;
    int clipBottom;
    int clipLeft;
    ToolkitSprite spriteTarget;

    final void set(ToolkitRasterStateFrame previous, int top, int right, ToolkitSprite target, int guard, int bottom, int left) {
        try {
          this.previous = previous;
          this.spriteTarget = target;
          this.clipRight = right;
          this.clipTop = top;
          this.clipLeft = left;
          if (guard != -1) {
            this.clipRight = -107;
          }
          this.clipBottom = bottom;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "bl.A(" + (previous != null ? "{...}" : "null") + ',' + top + ',' + right + ',' + (target != null ? "{...}" : "null") + ',' + guard + ',' + bottom + ',' + left + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        if (param0) {
          ToolkitRasterStateFrame.releaseStatics(true);
        }
    }

    static {
        field_e = -1;
    }
}
