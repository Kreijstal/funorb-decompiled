/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeapBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private int b;
    public int d;
    private boolean a;
    private jaclib.memory.heap.NativeHeap c;

    private final synchronized void deallocate() {
        if (this.isAllocated()) {
          this.c.deallocateBuffer(this.b);
          this.a = false;
          return;
        }
        this.a = false;
    }

    public final synchronized void writeBytes(byte[] param0, int param1, int param2, int param3) {
        if (((param0 == null ? 1 : 0) | (!this.isAllocated() ? 1 : 0) | (param1 < 0 ? 1 : 0) | (param0.length < param1 + param3 ? 1 : 0) | (param2 < 0 ? 1 : 0) | (param2 + param3 > this.d ? 1 : 0)) != 0) {
          throw new RuntimeException();
        }
        this.c.put(this.b, param0, param1, param2, param3);
    }

    public final int getSize() {
        return this.d;
    }

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.deallocate();
    }

    private final synchronized boolean isAllocated() {
        if (!this.c.isAllocated()) {
          return false;
        }
        if (!this.a) {
          return false;
        }
        return true;
    }

    NativeHeapBuffer(jaclib.memory.heap.NativeHeap param0, int param1, int param2) {
        this.a = true;
        this.d = param2;
        this.c = param0;
        this.b = param1;
    }

    public final long getAddress() {
        return this.c.getBufferAddress(this.b);
    }
}
