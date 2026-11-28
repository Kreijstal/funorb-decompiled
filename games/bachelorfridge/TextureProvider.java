/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract int[] getTexturePixels(boolean param0, int param1, float param2);

    public abstract boolean hasTexture(int param0, int param1);

    public abstract boolean isTextureSize64(byte param0, int param1);

    public abstract int getAverageTextureColor(byte param0, int param1);

    public abstract int getTextureAlphaMode(int param0, int param1);
}
