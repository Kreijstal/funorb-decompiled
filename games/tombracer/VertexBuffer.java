/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface VertexBuffer extends GpuBuffer {
    public abstract boolean unmap(byte param0);

    public abstract void close(int param0);

    public abstract una getFormat(int param0);

    public abstract void allocate(int param0, int param1);

    public abstract jaclib.memory.Buffer map(boolean param0, byte param1);
}
