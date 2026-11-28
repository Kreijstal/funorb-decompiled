/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract boolean isTextureSize64(int param0);

    public abstract int getAverageTextureColor(int param0);

    public abstract int[] getTexturePixels(int param0, float param1);

    public abstract int getTextureAlphaMode(int param0);

    public abstract boolean hasTexture(int param0);
}
