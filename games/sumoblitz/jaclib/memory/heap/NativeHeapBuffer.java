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
            ((jaclib.memory.heap.NativeHeapBuffer) this).a.deallocateBuffer(((jaclib.memory.heap.NativeHeapBuffer) this).b);
            ((jaclib.memory.heap.NativeHeapBuffer) this).d = false;
            return;
        }
        ((jaclib.memory.heap.NativeHeapBuffer) this).d = false;
    }

    public final long c() {
        return ((jaclib.memory.heap.NativeHeapBuffer) this).a.getBufferAddress(((jaclib.memory.heap.NativeHeapBuffer) this).b);
    }

    private final synchronized boolean b() {
        if (!((jaclib.memory.heap.NativeHeapBuffer) this).a.b()) {
            return false;
        }
        if (!((jaclib.memory.heap.NativeHeapBuffer) this).d) {
            return false;
        }
        return true;
    }

    public final int getSize() {
        return ((jaclib.memory.heap.NativeHeapBuffer) this).c;
    }

    public final synchronized void a(byte[] param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        L0: {
          if (param1 >= 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (this.b()) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          stackOut_6_0 = stackIn_6_0;
          stackOut_6_1 = stackIn_6_1;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          if (param0 != null) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            break L2;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            break L2;
          }
        }
        L3: {
          stackOut_9_0 = stackIn_9_0 | (stackIn_9_1 | stackIn_9_2);
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (param0.length >= param3 + param1) {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          stackOut_12_0 = stackIn_12_0 | stackIn_12_1;
          stackIn_14_0 = stackOut_12_0;
          stackIn_13_0 = stackOut_12_0;
          if (param2 >= 0) {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            break L4;
          } else {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            break L4;
          }
        }
        L5: {
          stackOut_15_0 = stackIn_15_0 | stackIn_15_1;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if (((jaclib.memory.heap.NativeHeapBuffer) this).c >= param2 - -param3) {
            stackOut_17_0 = stackIn_17_0;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L5;
          } else {
            stackOut_16_0 = stackIn_16_0;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L5;
          }
        }
        if ((stackIn_18_0 | stackIn_18_1) != 0) {
          throw new RuntimeException();
        } else {
          ((jaclib.memory.heap.NativeHeapBuffer) this).a.put(((jaclib.memory.heap.NativeHeapBuffer) this).b, param0, param1, param2, param3);
          return;
        }
    }

    NativeHeapBuffer(jaclib.memory.heap.NativeHeap param0, int param1, int param2) {
        ((jaclib.memory.heap.NativeHeapBuffer) this).d = true;
        ((jaclib.memory.heap.NativeHeapBuffer) this).c = param2;
        ((jaclib.memory.heap.NativeHeapBuffer) this).b = param1;
        ((jaclib.memory.heap.NativeHeapBuffer) this).a = param0;
    }
}
