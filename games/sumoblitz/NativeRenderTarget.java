/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeRenderTarget implements RenderTarget {
    NativeRenderBuffer buffer;
    NativeToolkitSprite sprite;

    NativeRenderTarget(NativeSoftwareGraphicsToolkit toolkit, NativeToolkitSprite colorSurface, NativeRenderBuffer renderBuffer) {
        this.sprite = colorSurface;
        this.buffer = renderBuffer;
    }
}
