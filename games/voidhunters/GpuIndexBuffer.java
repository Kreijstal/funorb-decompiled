/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface GpuIndexBuffer extends GpuBuffer {
    public abstract void release(int param0);

    public abstract jaclib.memory.Buffer lock(byte param0, boolean param1);

    public abstract void allocate(int param0, int param1);

    public abstract boolean unlock(int param0);
}
