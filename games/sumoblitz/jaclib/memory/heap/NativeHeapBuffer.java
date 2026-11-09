/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeapBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private jaclib.memory.heap.NativeHeap heap;
    public int size;
    private int handle;
    private boolean allocated;

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.close();
    }

    private final synchronized void close() {
        if (this.isValid()) {
          this.heap.deallocateBuffer(this.handle);
          this.allocated = false;
          return;
        }
        this.allocated = false;
    }

    public final long getAddress() {
        return this.heap.getBufferAddress(this.handle);
    }

    private final synchronized boolean isValid() {
        if (!this.heap.isAllocated()) {
          return false;
        }
        if (!this.allocated) {
          return false;
        }
        return true;
    }

    public final int getSize() {
        return this.size;
    }

    public final synchronized void putBytes(byte[] source, int sourceOffset, int destinationOffset, int length) {
        if (((sourceOffset < 0 ? 1 : 0) | ((!this.isValid() ? 1 : 0) | (source == null ? 1 : 0)) | (source.length < length + sourceOffset ? 1 : 0) | (destinationOffset < 0 ? 1 : 0) | (this.size < destinationOffset + length ? 1 : 0)) == 0) {
          this.heap.put(this.handle, source, sourceOffset, destinationOffset, length);
          return;
        }
        throw new RuntimeException();
    }

    NativeHeapBuffer(jaclib.memory.heap.NativeHeap param0, int param1, int param2) {
        this.allocated = true;
        this.size = param2;
        this.handle = param1;
        this.heap = param0;
    }
}
