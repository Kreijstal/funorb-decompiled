/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract boolean isSize64(int param0, int param1);

    public abstract boolean isTextureReady(byte param0, int param1);

    public abstract int[] getTexturePixels(boolean param0, int param1, float param2);

    public abstract int getAverageTextureColor(int param0, int param1);

    public abstract int getTextureAlphaMode(int param0, byte param1);
}
