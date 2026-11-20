/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract int getTextureCount(int param0);

    public abstract int[] generateRgbPixels(int param0, float param1, boolean param2, int param3, int param4, boolean param5);

    public abstract TextureMetadata getTextureMetadata(int param0, int param1);

    public abstract int[] generateArgbPixels(int param0, int param1, int param2, boolean param3, int param4, float param5);

    public abstract boolean isTextureReady(int param0, byte param1);

    public abstract float[] generateFloatRgba(float param0, int param1, int param2, int param3, int param4, boolean param5);
}
