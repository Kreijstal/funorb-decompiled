/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeToolkitSprite extends ToolkitSprite implements NativeResource {
    long field_nativeid;

    private final native void drawScaledNative(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    public final void releaseNative(boolean param0) {
        this.releaseNativeHandle(this.field_nativeid, param0);
    }

    private final native int heightNative(long param0);

    private final native void releaseNativeHandle(long param0, boolean param1);

    private final native void drawAffineNative(long param0, float param1, float param2, float param3, float param4, float param5, float param6, int param7, int param8, int param9, int param10);

    final int paddedWidth() {
        return this.paddedWidthNative(this.field_nativeid);
    }

    final int height() {
        return this.heightNative(this.field_nativeid);
    }

    private final native void setInsetsNative(long param0, int param1, int param2, int param3, int param4);

    final void drawScaled(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.drawScaledNative(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7);
    }

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        this.drawNative(this.field_nativeid, param0, param1, param2, param3, param4);
    }

    final void setInsets(int param0, int param1, int param2, int param3) {
        this.setInsetsNative(this.field_nativeid, param0, param1, param2, param3);
    }

    private final native int widthNative(long param0);

    final int width() {
        return this.widthNative(this.field_nativeid);
    }

    final int paddedHeight() {
        return this.paddedHeightNative(this.field_nativeid);
    }

    final void drawAffine(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        this.drawAffineNative(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    private final native void drawNative(long param0, int param1, int param2, int param3, int param4, int param5);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeReleaseQueue.queueRelease(-1, (NativeResource) (this));
        }
    }

    NativeToolkitSprite(NativeSoftwareGraphicsToolkit param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.initializeFromPixels(param0, param1, param2, param3, param4, param5, param6);
    }

    private final native int paddedWidthNative(long param0);

    private final native void initializeFromIndexedPixels(NativeSoftwareGraphicsToolkit param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7);

    private final native int paddedHeightNative(long param0);

    private final native void initializeFromPixels(NativeSoftwareGraphicsToolkit param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6);

    NativeToolkitSprite(NativeSoftwareGraphicsToolkit param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7) {
        this.initializeFromIndexedPixels(param0, param1, param2, param3, param4, param5, param6, param7);
    }
}
