/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract boolean isTextureSize64(byte param0, int param1);

    public abstract int[] getTexturePixels(float param0, int param1, boolean param2);

    public abstract boolean isTextureReady(boolean param0, int param1);

    public abstract int getTextureAlphaMode(int param0, int param1);

    public abstract int getAverageColor(int param0, int param1);
}
