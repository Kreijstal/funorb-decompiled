/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract int getTextureAlphaMode(byte param0, int param1);

    public abstract int[] getTexturePixels(float param0, byte param1, int param2);

    public abstract int getAverageColor(int param0, byte param1);

    public abstract boolean isTextureSize64(int param0, int param1);

    public abstract boolean isTextureReady(int param0, byte param1);
}
