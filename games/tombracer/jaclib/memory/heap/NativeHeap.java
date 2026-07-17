/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeap {
    private boolean a;
    private int b;
    long peer;

    final synchronized native int allocateBuffer(int param0, boolean param1);

    final synchronized boolean b() {
        return ((jaclib.memory.heap.NativeHeap) this).a;
    }

    public final synchronized void a() {
        if (((jaclib.memory.heap.NativeHeap) this).a) {
            this.deallocateHeap();
            ((jaclib.memory.heap.NativeHeap) this).a = false;
            return;
        }
        ((jaclib.memory.heap.NativeHeap) this).a = false;
    }

    final synchronized native void put(int param0, byte[] param1, int param2, int param3, int param4);

    final synchronized native void get(int param0, byte[] param1, int param2, int param3, int param4);

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        ((jaclib.memory.heap.NativeHeap) this).a();
    }

    public final jaclib.memory.heap.NativeHeapBuffer a(int param0, boolean param1) {
        if (!((jaclib.memory.heap.NativeHeap) this).a) {
            throw new IllegalStateException();
        }
        return new jaclib.memory.heap.NativeHeapBuffer((jaclib.memory.heap.NativeHeap) this, ((jaclib.memory.heap.NativeHeap) this).allocateBuffer(param0, param1), param0);
    }

    public NativeHeap(int param0) {
        ((jaclib.memory.heap.NativeHeap) this).b = param0;
        this.allocateHeap(((jaclib.memory.heap.NativeHeap) this).b);
        ((jaclib.memory.heap.NativeHeap) this).a = true;
    }

    private final native void allocateHeap(int param0);

    final synchronized native long getBufferAddress(int param0);

    final synchronized native void deallocateBuffer(int param0);

    private final native void deallocateHeap();
}
