/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface GpuVertexBuffer extends GpuBuffer {
    public abstract boolean unlock(int param0);

    public abstract void release(int param0);

    public abstract jaclib.memory.Buffer lock(boolean param0, byte param1);

    public abstract boolean allocate(int param0, int param1, int param2);
}
