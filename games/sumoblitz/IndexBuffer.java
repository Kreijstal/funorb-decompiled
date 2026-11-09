/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface IndexBuffer extends GpuBuffer {
    public abstract jaclib.memory.Buffer map(boolean discard, int guard);

    public abstract void allocate(byte guard, int indexCount);

    public abstract boolean unmap(int guard);

    public abstract void close(int guard);
}
