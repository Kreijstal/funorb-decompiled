/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareSprite extends ToolkitSprite implements NativeResource {
    long field_nativeid;

    private final native void drawAffineNative(long param0, float param1, float param2, float param3, float param4, float param5, float param6, int param7, int param8, int param9, int param10);

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        this.drawNative(this.field_nativeid, param0, param1, param2, param3, param4);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    final int getWidth() {
        return this.getWidthNative(this.field_nativeid);
    }

    public final void disposeNative(boolean param0) {
        this.disposeNativeHandle(this.field_nativeid, param0);
    }

    private final native void drawNative(long param0, int param1, int param2, int param3, int param4, int param5);

    final int getPaddedHeight() {
        return this.getPaddedHeightNative(this.field_nativeid);
    }

    private final native void disposeNativeHandle(long param0, boolean param1);

    private final native void initializeIndexedNative(NativeSoftwareToolkit param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7);

    final void drawScaled(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.drawScaledNative(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7);
    }

    final int getHeight() {
        return this.getHeightNative(this.field_nativeid);
    }

    private final native int getPaddedHeightNative(long param0);

    final void drawTiled(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.drawTiledNative(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6);
    }

    private final native void drawScaledNative(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    private final native int getHeightNative(long param0);

    private final native void initializePixelsNative(NativeSoftwareToolkit param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6);

    private final native void setPaddingNative(long param0, int param1, int param2, int param3, int param4);

    final void setPadding(int param0, int param1, int param2, int param3) {
        this.setPaddingNative(this.field_nativeid, param0, param1, param2, param3);
    }

    NativeSoftwareSprite(NativeSoftwareToolkit param0, int param1, int param2) {
        this.initializeBlankNative(param0, param1, param2);
    }

    final void drawAffine(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        this.drawAffineNative(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7, param8, param9);
    }

    private final native int getPaddedWidthNative(long param0);

    NativeSoftwareSprite(NativeSoftwareToolkit param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.initializePixelsNative(param0, param1, param2, param3, param4, param5, param6);
    }

    private final native void drawTiledNative(long param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    private final native void initializeBlankNative(NativeSoftwareToolkit param0, int param1, int param2);

    private final native int getWidthNative(long param0);

    private final native void writePixelsNative(long param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7);

    final int getPaddedWidth() {
        return this.getPaddedWidthNative(this.field_nativeid);
    }

    final void writePixels(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        this.writePixelsNative(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6);
    }

    NativeSoftwareSprite(NativeSoftwareToolkit param0, int[] param1, byte[] param2, byte[] param3, int param4, int param5, int param6, int param7) {
        this.initializeIndexedNative(param0, param1, param2, param3, param4, param5, param6, param7);
    }
}
