/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract int[] getTexturePixels(boolean param0, float param1, int param2);

    public abstract boolean hasTexture(int param0, int param1);

    public abstract boolean isTextureSize64(byte param0, int param1);

    public abstract int getTextureAlphaMode(byte param0, int param1);

    public abstract int getAverageTextureColor(int param0, int param1);
}
