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
        if (!(!this.a())) {
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
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        L0: {
          if (this.a()) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {


          if (param0 != null) {

            stackIn_6_1 = 0;
            break L1;
          } else {

            stackIn_6_1 = 1;
            break L1;
          }
        }
        L2: {
          stackIn_8_0 = stackIn_3_0 | stackIn_6_1;

          if ((param1 ^ -1) <= -1) {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = 0;
            break L2;
          } else {
            stackIn_9_0 = stackIn_8_0;
            stackIn_9_1 = 1;
            break L2;
          }
        }
        L3: {
          stackIn_11_0 = stackIn_9_0 | stackIn_9_1;

          if (param0.length >= param3 + param1) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_1 = 0;
            break L3;
          } else {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_1 = 1;
            break L3;
          }
        }
        L4: {
          stackIn_14_0 = stackIn_12_0 | stackIn_12_1;

          if (-1 >= (param2 ^ -1)) {
            stackIn_15_0 = stackIn_14_0;
            stackIn_15_1 = 0;
            break L4;
          } else {
            stackIn_15_0 = stackIn_14_0;
            stackIn_15_1 = 1;
            break L4;
          }
        }
        L5: {
          stackIn_17_0 = stackIn_15_0 | stackIn_15_1;

          if (param3 + param2 <= this.c) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_1 = 0;
            break L5;
          } else {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_1 = 1;
            break L5;
          }
        }
        if ((stackIn_18_0 | stackIn_18_1) != 0) {
          throw new RuntimeException();
        } else {
          this.a.put(this.b, param0, param1, param2, param3);
          return;
        }
    }
}
