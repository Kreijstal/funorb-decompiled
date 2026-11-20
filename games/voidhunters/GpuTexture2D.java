/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface GpuTexture2D extends GpuTexture {
    public abstract float getV(float param0, int param1);

    public abstract int getWidth(byte param0);

    public abstract int getHeight(byte param0);

    public abstract void updatePixels(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7);

    public abstract float getU(float param0, int param1);

    public abstract void setRepeat(boolean param0, byte param1, boolean param2);

    public abstract boolean usesNormalizedCoordinates(int param0);
}
