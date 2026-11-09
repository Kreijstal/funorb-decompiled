/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract int textureCount(int guard);

    public abstract boolean isTextureReady(int guard, int textureId);

    public abstract float[] loadFloatPixels(int param0, boolean param1, float param2, int param3, int param4, int param5);

    public abstract int[] loadPixels(boolean param0, int param1, byte param2, int param3, float param4, int param5);

    public abstract TextureMetadata metadata(int guard, int textureId);

    public abstract int[] loadPixels(int param0, int param1, int param2, boolean param3, float param4, int param5);
}
