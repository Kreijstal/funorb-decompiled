/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeapBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private int b;
    public int d;
    private boolean a;
    private jaclib.memory.heap.NativeHeap c;

    private final synchronized void a() {
        if (this.c()) {
            ((jaclib.memory.heap.NativeHeapBuffer) this).c.deallocateBuffer(((jaclib.memory.heap.NativeHeapBuffer) this).b);
            ((jaclib.memory.heap.NativeHeapBuffer) this).a = false;
            return;
        }
        ((jaclib.memory.heap.NativeHeapBuffer) this).a = false;
    }

    public final synchronized void a(byte[] param0, int param1, int param2, int param3) {
        if (!(((param0 == null ? 1 : 0) | (!this.c() ? 1 : 0) | (param1 < 0 ? 1 : 0) | (param0.length < param1 - -param3 ? 1 : 0) | (param2 < 0 ? 1 : 0) | (param2 - -param3 > ((jaclib.memory.heap.NativeHeapBuffer) this).d ? 1 : 0)) == 0)) {
            throw new RuntimeException();
        }
        ((jaclib.memory.heap.NativeHeapBuffer) this).c.put(((jaclib.memory.heap.NativeHeapBuffer) this).b, param0, param1, param2, param3);
    }

    public final int getSize() {
        return ((jaclib.memory.heap.NativeHeapBuffer) this).d;
    }

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.a();
    }

    private final synchronized boolean c() {
        if (!((jaclib.memory.heap.NativeHeapBuffer) this).c.b()) {
            return false;
        }
        if (!((jaclib.memory.heap.NativeHeapBuffer) this).a) {
            return false;
        }
        return true;
    }

    NativeHeapBuffer(jaclib.memory.heap.NativeHeap param0, int param1, int param2) {
        ((jaclib.memory.heap.NativeHeapBuffer) this).a = true;
        ((jaclib.memory.heap.NativeHeapBuffer) this).d = param2;
        ((jaclib.memory.heap.NativeHeapBuffer) this).c = param0;
        ((jaclib.memory.heap.NativeHeapBuffer) this).b = param1;
    }

    public final long b() {
        return ((jaclib.memory.heap.NativeHeapBuffer) this).c.getBufferAddress(((jaclib.memory.heap.NativeHeapBuffer) this).b);
    }
}
