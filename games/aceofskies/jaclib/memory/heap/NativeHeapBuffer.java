/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeapBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private jaclib.memory.heap.NativeHeap d;
    private boolean b;
    public int c;
    private int a;

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.c();
    }

    public final synchronized void a(byte[] param0, int param1, int param2, int param3) {
        if (!(((!this.b() ? 1 : 0) | (param0 == null ? 1 : 0) | (param1 < 0 ? 1 : 0) | (param3 + param1 > param0.length ? 1 : 0) | (0 > param2 ? 1 : 0) | (this.c < param3 + param2 ? 1 : 0)) == 0)) {
            throw new RuntimeException();
        }
        this.d.put(this.a, param0, param1, param2, param3);
    }

    private final synchronized boolean b() {
        if (!this.d.b()) {
            return false;
        }
        if (!this.b) {
            return false;
        }
        return true;
    }

    public final long a() {
        return this.d.getBufferAddress(this.a);
    }

    public final int getSize() {
        return this.c;
    }

    private final synchronized void c() {
        if (this.b()) {
            this.d.deallocateBuffer(this.a);
            this.b = false;
            return;
        }
        this.b = false;
    }

    NativeHeapBuffer(jaclib.memory.heap.NativeHeap param0, int param1, int param2) {
        this.b = true;
        this.a = param1;
        this.d = param0;
        this.c = param2;
    }
}
