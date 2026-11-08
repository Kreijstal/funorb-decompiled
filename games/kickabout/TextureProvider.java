/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract boolean isLowDetailTexture(boolean param0, int param1);

    public abstract boolean a(int param0, int param1);

    public abstract int getAverageTextureColor(byte param0, int param1);

    public abstract int[] getTexturePixels(float param0, byte param1, int param2);

    public abstract int b(int param0, int param1);
}
