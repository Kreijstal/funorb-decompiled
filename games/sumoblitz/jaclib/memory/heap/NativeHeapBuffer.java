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
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_2 = 0;
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
          if (-1 >= (param1 ^ -1)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {


          if (this.b()) {

            stackIn_6_1 = 0;
            break L1;
          } else {

            stackIn_6_1 = 1;
            break L1;
          }
        }
        L2: {




          if (param0 != null) {


            stackIn_9_2 = 0;
            break L2;
          } else {


            stackIn_9_2 = 1;
            break L2;
          }
        }
        L3: {
          stackIn_11_0 = stackIn_3_0 | (stackIn_6_1 | stackIn_9_2);

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

          if ((param2 ^ -1) <= -1) {
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

          if (this.c >= param2 - -param3) {
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

    NativeHeapBuffer(jaclib.memory.heap.NativeHeap param0, int param1, int param2) {
        this.d = true;
        this.c = param2;
        this.b = param1;
        this.a = param0;
    }
}
