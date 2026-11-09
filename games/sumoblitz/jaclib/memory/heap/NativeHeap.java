/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeap {
    private int capacity;
    private boolean allocated;
    long peer;

    private final native void deallocateHeap();

    private final native void allocateHeap(int param0);

    final synchronized native long getBufferAddress(int param0);

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.close();
    }

    final synchronized native int allocateBuffer(int param0, boolean param1);

    final synchronized boolean isAllocated() {
        return this.allocated;
    }

    public final jaclib.memory.heap.NativeHeapBuffer allocate(int size, boolean allocationFlag) {
        RuntimeException var3;
        if (!this.allocated) {
          throw new IllegalStateException();
        }
        return new jaclib.memory.heap.NativeHeapBuffer(this, this.allocateBuffer(size, allocationFlag), size);
    }

    final synchronized native void deallocateBuffer(int param0);

    public NativeHeap(int param0) {
        this.capacity = param0;
        this.allocateHeap(this.capacity);
        this.allocated = true;
    }

    public final synchronized void close() {
        if (this.allocated) {
          this.deallocateHeap();
        }
        this.allocated = false;
    }

    final synchronized native void put(int param0, byte[] param1, int param2, int param3, int param4);

    final synchronized native void get(int param0, byte[] param1, int param2, int param3, int param4);
}
