/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface VertexBuffer extends GpuBuffer {
    public abstract boolean unmap(int guard);

    public abstract void close(int guard);

    public abstract jaclib.memory.Buffer map(int guard, boolean discard);

    public abstract boolean allocate(int stride, byte guard, int sizeBytes);
}
