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
        return this.a;
    }

    public final synchronized void a() {
        L0: {
          if (!this.a) {
            break L0;
          } else {
            this.deallocateHeap();
            break L0;
          }
        }
        this.a = false;
    }

    final synchronized native void put(int param0, byte[] param1, int param2, int param3, int param4);

    final synchronized native void get(int param0, byte[] param1, int param2, int param3, int param4);

    protected final synchronized void finalize() throws Throwable {
        try {
            super.finalize();
            this.a();
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public final jaclib.memory.heap.NativeHeapBuffer a(int param0, boolean param1) {
        RuntimeException var3 = null;
        if (this.a) {
          return new jaclib.memory.heap.NativeHeapBuffer((jaclib.memory.heap.NativeHeap) (this), this.allocateBuffer(param0, param1), param0);
        } else {
          throw new IllegalStateException();
        }
    }

    public NativeHeap(int param0) {
        try {
            this.b = param0;
            this.allocateHeap(this.b);
            this.a = true;
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    private final native void allocateHeap(int param0);

    final synchronized native long getBufferAddress(int param0);

    final synchronized native void deallocateBuffer(int param0);

    private final native void deallocateHeap();
}
