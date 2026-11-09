/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeToolkitSprite extends ToolkitSprite implements NativeResource {
    long field_nativeid;

    private final native void nativeCreateFromPalette(NativeSoftwareGraphicsToolkit toolkit, int[] palette, byte[] indices, byte[] alpha, int offset, int stride, int width, int height);

    private final native int nativePaddedHeight(long handle);

    final void draw(int x, int y, int colorMode, int color, int blendMode) {
        this.nativeDraw(this.field_nativeid, x, y, colorMode, color, blendMode);
    }

    private final native int nativeHeight(long handle);

    private final native void nativeSetInsets(long handle, int left, int top, int right, int bottom);

    private final native void nativeDrawAffine(long handle, float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode, int flags);

    final int paddedHeight() {
        return this.nativePaddedHeight(this.field_nativeid);
    }

    private final native int nativePaddedWidth(long handle);

    private final native void nativeDraw(long handle, int x, int y, int colorMode, int color, int blendMode);

    final int paddedWidth() {
        return this.nativePaddedWidth(this.field_nativeid);
    }

    final int width() {
        return this.nativeWidth(this.field_nativeid);
    }

    final void drawAffine(float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode, int flags) {
        this.nativeDrawAffine(this.field_nativeid, x0, y0, x1, y1, x2, y2, colorMode, color, blendMode, flags);
    }

    private final native void nativeDrawScaled(long handle, int x, int y, int width, int height, int colorMode, int color, int blendMode, int flags);

    final void drawScaled(int x, int y, int width, int height, int colorMode, int color, int blendMode, int flags) {
        this.nativeDrawScaled(this.field_nativeid, x, y, width, height, colorMode, color, blendMode, flags);
    }

    final int height() {
        return this.nativeHeight(this.field_nativeid);
    }

    private final native void nativeCreateFromPixels(NativeSoftwareGraphicsToolkit toolkit, int[] pixels, int offset, int stride, int width, int height, boolean copyPixels);

    final void setInsets(int left, int top, int right, int bottom) {
        this.nativeSetInsets(this.field_nativeid, left, top, right, bottom);
    }

    public final void disposeNativeResource(boolean param0) {
        this.nativeDispose(this.field_nativeid, param0);
    }

    private final native int nativeWidth(long handle);

    NativeToolkitSprite(NativeSoftwareGraphicsToolkit param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.nativeCreateFromPixels(param0, param1, param2, param3, param4, param5, param6);
    }

    private final native void nativeDispose(long handle, boolean deferred);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.deferDisposal((NativeResource) (this), (byte) -37);
        }
    }

    NativeToolkitSprite(NativeSoftwareGraphicsToolkit param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7) {
        this.nativeCreateFromPalette(param0, param1, param2, param3, param4, param5, param6, param7);
    }
}
