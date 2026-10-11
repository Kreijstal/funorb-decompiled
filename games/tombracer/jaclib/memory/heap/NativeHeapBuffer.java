/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeapBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private int b;
    private jaclib.memory.heap.NativeHeap a;
    private boolean d;
    public int c;

    public final long getAddress() {
        return this.a.getBufferAddress(this.b);
    }

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.b();
    }

    private final synchronized boolean a() {
        if (!this.a.b()) {
          return false;
        }
        if (!this.d) {
          return false;
        }
        return true;
    }

    private final synchronized void b() {
        if (this.a()) {
          this.a.deallocateBuffer(this.b);
        }
        this.d = false;
    }

    public final int getSize() {
        return this.c;
    }

    NativeHeapBuffer(jaclib.memory.heap.NativeHeap param0, int param1, int param2) {
        this.d = true;
        this.c = param2;
        this.a = param0;
        this.b = param1;
    }

    public final synchronized void a(byte[] param0, int param1, int param2, int param3) {
        if (((!this.a() ? 1 : 0) | (param0 == null ? 1 : 0) | (param1 < 0 ? 1 : 0) | (param0.length < param3 + param1 ? 1 : 0) | (param2 < 0 ? 1 : 0) | (param3 + param2 > this.c ? 1 : 0)) == 0) {
          this.a.put(this.b, param0, param1, param2, param3);
          return;
        }
        throw new RuntimeException();
    }
}
