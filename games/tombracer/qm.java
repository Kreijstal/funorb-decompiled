/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface qm extends GpuBuffer {
    public abstract boolean allocate(int param0, int param1, boolean param2);

    public abstract void close(int param0);

    public abstract jaclib.memory.Buffer mapBuffer(int param0, boolean param1);

    public abstract boolean unmapBuffer(boolean param0);
}
