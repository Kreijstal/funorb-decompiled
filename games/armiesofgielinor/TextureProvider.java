/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextureProvider {
    public abstract boolean hasTexture(boolean obfuscationGuard, int textureId);

    public abstract int getTextureAlphaMode(int param0, int param1);

    public abstract int[] getTexturePixels(int textureId, float brightness, int obfuscationGuard);

    public abstract int getAverageTextureColor(int textureId, byte obfuscationGuard);

    public abstract boolean isTextureSize64(int param0, int param1);
}
