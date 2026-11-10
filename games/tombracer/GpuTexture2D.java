/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface GpuTexture2D extends GpuTexture {
    public abstract float textureU(int param0, float param1);

    public abstract int getWidth(int param0);

    public abstract boolean a(int param0);

    public abstract float textureV(float param0, byte param1);

    public abstract int getHeight(byte param0);

    public abstract void setWrap(byte param0, boolean param1, boolean param2);
}
