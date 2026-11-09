/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeToolkitSprite extends ToolkitSprite implements NativeResource {
    long field_nativeid;

    private final native void ma(NativeSoftwareGraphicsToolkit param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7);

    private final native int JA(long param0);

    final void draw(int x, int y, int colorMode, int color, int blendMode) {
        this.W(this.field_nativeid, x, y, colorMode, color, blendMode);
    }

    private final native int I(long param0);

    private final native void A(long param0, int param1, int param2, int param3, int param4);

    private final native void b(long param0, float param1, float param2, float param3, float param4, float param5, float param6, int param7, int param8, int param9, int param10);

    final int paddedHeight() {
        return this.JA(this.field_nativeid);
    }

    private final native int wa(long param0);

    private final native void W(long param0, int param1, int param2, int param3, int param4, int param5);

    final int paddedWidth() {
        return this.wa(this.field_nativeid);
    }

    final int width() {
        return this.M(this.field_nativeid);
    }

    final void drawAffine(float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode, int flags) {
        this.b(this.field_nativeid, x0, y0, x1, y1, x2, y2, colorMode, color, blendMode, flags);
    }

    private final native void RA(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    final void drawScaled(int x, int y, int width, int height, int colorMode, int color, int blendMode, int flags) {
        this.RA(this.field_nativeid, x, y, width, height, colorMode, color, blendMode, flags);
    }

    final int height() {
        return this.I(this.field_nativeid);
    }

    private final native void ua(NativeSoftwareGraphicsToolkit param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6);

    final void setInsets(int left, int top, int right, int bottom) {
        this.A(this.field_nativeid, left, top, right, bottom);
    }

    public final void disposeNativeResource(boolean param0) {
        this.R(this.field_nativeid, param0);
    }

    private final native int M(long param0);

    NativeToolkitSprite(NativeSoftwareGraphicsToolkit param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.ua(param0, param1, param2, param3, param4, param5, param6);
    }

    private final native void R(long param0, boolean param1);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.a((NativeResource) (this), (byte) -37);
        }
    }

    NativeToolkitSprite(NativeSoftwareGraphicsToolkit param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7) {
        this.ma(param0, param1, param2, param3, param4, param5, param6, param7);
    }
}
