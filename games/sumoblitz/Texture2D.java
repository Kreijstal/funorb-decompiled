/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface Texture2D extends GpuTexture {
    public abstract float textureU(float pixelX, int guard);

    public abstract float textureV(float pixelY, int guard);

    public abstract boolean usesNormalizedCoordinates(int guard);

    public abstract int width(int guard);

    public abstract int height(byte guard);

    public abstract void setWrap(boolean repeatY, boolean repeatX, boolean guard);
}
