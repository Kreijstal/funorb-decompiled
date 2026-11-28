/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract int getAverageTextureColor(int param0, int param1);

    public abstract boolean isTextureSize64(int param0, int param1);

    public abstract boolean hasTexture(int param0, int param1);

    public abstract int getTextureAlphaMode(int param0, int param1);

    public abstract int[] getTexturePixels(float param0, int param1, int param2);
}
