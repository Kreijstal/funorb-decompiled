/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeap {
    private boolean b;
    long peer;
    private int a;

    public final synchronized void a() {
        L0: {
          if (this.b) {
            this.deallocateHeap();
            break L0;
          } else {
            break L0;
          }
        }
        this.b = false;
    }

    final synchronized native void deallocateBuffer(int param0);

    public final jaclib.memory.heap.NativeHeapBuffer a(int param0, boolean param1) {
        RuntimeException var3 = null;
        if (!this.b) {
          throw new IllegalStateException();
        } else {
          return new jaclib.memory.heap.NativeHeapBuffer((jaclib.memory.heap.NativeHeap) (this), this.allocateBuffer(param0, param1), param0);
        }
    }

    final synchronized native int allocateBuffer(int param0, boolean param1);

    public NativeHeap(int param0) {
        try {
            this.a = param0;
            this.allocateHeap(this.a);
            this.b = true;
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    private final native void deallocateHeap();

    protected final synchronized void finalize() throws Throwable {
        try {
            super.finalize();
            this.a();
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    final synchronized boolean b() {
        return this.b;
    }

    private final native void allocateHeap(int param0);

    final synchronized native void get(int param0, byte[] param1, int param2, int param3, int param4);

    final synchronized native long getBufferAddress(int param0);

    final synchronized native void put(int param0, byte[] param1, int param2, int param3, int param4);
}
