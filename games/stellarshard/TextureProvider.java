/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract boolean hasTexture(int param0, byte param1);

    public abstract int getAverageTextureColor(int param0, int param1);

    public abstract boolean isTextureSize64(int param0, int param1);

    public abstract int getTextureAlphaMode(byte param0, int param1);

    public abstract int[] getTexturePixels(boolean param0, int param1, float param2);
}
