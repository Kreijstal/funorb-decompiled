/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract boolean isLowDetailTexture(boolean param0, int param1);

    public abstract boolean isTextureReady(int param0, int param1);

    public abstract int getAverageTextureColor(byte param0, int param1);

    public abstract int[] getTexturePixels(float param0, byte param1, int param2);

    public abstract int getTextureAlphaMode(int param0, int param1);
}
