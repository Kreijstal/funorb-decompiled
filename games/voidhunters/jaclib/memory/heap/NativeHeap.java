/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory.heap;

public final class NativeHeap {
    private boolean a;
    long peer;
    private int b;

    private final native void deallocateHeap();

    final synchronized native long getBufferAddress(int param0);

    public final jaclib.memory.heap.NativeHeapBuffer a(int param0, boolean param1) {
        RuntimeException var3 = null;
        if (((jaclib.memory.heap.NativeHeap) this).a) {
          return new jaclib.memory.heap.NativeHeapBuffer((jaclib.memory.heap.NativeHeap) this, ((jaclib.memory.heap.NativeHeap) this).allocateBuffer(param0, param1), param0);
        } else {
          throw new IllegalStateException();
        }
    }

    public final synchronized void a() {
        L0: {
          if (((jaclib.memory.heap.NativeHeap) this).a) {
            this.deallocateHeap();
            break L0;
          } else {
            break L0;
          }
        }
        ((jaclib.memory.heap.NativeHeap) this).a = false;
    }

    final synchronized native void get(int param0, byte[] param1, int param2, int param3, int param4);

    final synchronized native int allocateBuffer(int param0, boolean param1);

    private final native void allocateHeap(int param0);

    final synchronized boolean b() {
        return ((jaclib.memory.heap.NativeHeap) this).a;
    }

    protected final synchronized void finalize() throws Throwable {
        try {
            super.finalize();
            ((jaclib.memory.heap.NativeHeap) this).a();
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    final synchronized native void put(int param0, byte[] param1, int param2, int param3, int param4);

    final synchronized native void deallocateBuffer(int param0);

    public NativeHeap(int param0) {
        try {
            ((jaclib.memory.heap.NativeHeap) this).b = param0;
            this.allocateHeap(((jaclib.memory.heap.NativeHeap) this).b);
            ((jaclib.memory.heap.NativeHeap) this).a = true;
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }
}
