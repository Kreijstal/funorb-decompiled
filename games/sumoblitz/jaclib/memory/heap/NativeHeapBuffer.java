/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeapBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private jaclib.memory.heap.NativeHeap a;
    public int c;
    private int b;
    private boolean d;

    protected final synchronized void finalize() throws Throwable {
        super.finalize();
        this.a();
    }

    private final synchronized void a() {
        if (this.b()) {
          this.a.deallocateBuffer(this.b);
          this.d = false;
          return;
        }
        this.d = false;
    }

    public final long c() {
        return this.a.getBufferAddress(this.b);
    }

    private final synchronized boolean b() {
        if (!this.a.b()) {
          return false;
        }
        if (!this.d) {
          return false;
        }
        return true;
    }

    public final int getSize() {
        return this.c;
    }

    public final synchronized void a(byte[] param0, int param1, int param2, int param3) {
        if (((param1 < 0 ? 1 : 0) | ((!this.b() ? 1 : 0) | (param0 == null ? 1 : 0)) | (param0.length < param3 + param1 ? 1 : 0) | (param2 < 0 ? 1 : 0) | (this.c < param2 + param3 ? 1 : 0)) == 0) {
          this.a.put(this.b, param0, param1, param2, param3);
          return;
        }
        throw new RuntimeException();
    }

    NativeHeapBuffer(jaclib.memory.heap.NativeHeap param0, int param1, int param2) {
        this.d = true;
        this.c = param2;
        this.b = param1;
        this.a = param0;
    }
}
