/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public class NativeBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private int a;
    private long b;

    public void a(byte[] param0, int param1, int param2, int param3) {
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
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
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
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        L0: {
          if (((jaclib.memory.NativeBuffer) this).a >= param3 + param2) {
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
          if (0 <= param2) {
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
          if (param3 + param1 <= param0.length) {
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
          stackOut_9_0 = stackIn_9_0;
          stackOut_9_1 = stackIn_9_1;
          stackOut_9_2 = stackIn_9_2;
          stackIn_11_0 = stackOut_9_0;
          stackIn_11_1 = stackOut_9_1;
          stackIn_11_2 = stackOut_9_2;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          stackIn_10_2 = stackOut_9_2;
          if (param1 >= 0) {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = stackIn_11_1;
            stackOut_11_2 = stackIn_11_2;
            stackOut_11_3 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            stackIn_12_3 = stackOut_11_3;
            break L3;
          } else {
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = stackIn_10_1;
            stackOut_10_2 = stackIn_10_2;
            stackOut_10_3 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_12_2 = stackOut_10_2;
            stackIn_12_3 = stackOut_10_3;
            break L3;
          }
        }
        L4: {
          stackOut_12_0 = stackIn_12_0;
          stackOut_12_1 = stackIn_12_1;
          stackOut_12_2 = stackIn_12_2;
          stackOut_12_3 = stackIn_12_3;
          stackIn_14_0 = stackOut_12_0;
          stackIn_14_1 = stackOut_12_1;
          stackIn_14_2 = stackOut_12_2;
          stackIn_14_3 = stackOut_12_3;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          stackIn_13_2 = stackOut_12_2;
          stackIn_13_3 = stackOut_12_3;
          if (param0 != null) {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = stackIn_14_1;
            stackOut_14_2 = stackIn_14_2;
            stackOut_14_3 = stackIn_14_3;
            stackOut_14_4 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            stackIn_15_2 = stackOut_14_2;
            stackIn_15_3 = stackOut_14_3;
            stackIn_15_4 = stackOut_14_4;
            break L4;
          } else {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = stackIn_13_1;
            stackOut_13_2 = stackIn_13_2;
            stackOut_13_3 = stackIn_13_3;
            stackOut_13_4 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_15_2 = stackOut_13_2;
            stackIn_15_3 = stackOut_13_3;
            stackIn_15_4 = stackOut_13_4;
            break L4;
          }
        }
        L5: {
          stackOut_15_0 = stackIn_15_0;
          stackOut_15_1 = stackIn_15_1;
          stackOut_15_2 = stackIn_15_2;
          stackOut_15_3 = stackIn_15_3;
          stackOut_15_4 = stackIn_15_4;
          stackIn_17_0 = stackOut_15_0;
          stackIn_17_1 = stackOut_15_1;
          stackIn_17_2 = stackOut_15_2;
          stackIn_17_3 = stackOut_15_3;
          stackIn_17_4 = stackOut_15_4;
          stackIn_16_0 = stackOut_15_0;
          stackIn_16_1 = stackOut_15_1;
          stackIn_16_2 = stackOut_15_2;
          stackIn_16_3 = stackOut_15_3;
          stackIn_16_4 = stackOut_15_4;
          if (0L != ((jaclib.memory.NativeBuffer) this).b) {
            stackOut_17_0 = stackIn_17_0;
            stackOut_17_1 = stackIn_17_1;
            stackOut_17_2 = stackIn_17_2;
            stackOut_17_3 = stackIn_17_3;
            stackOut_17_4 = stackIn_17_4;
            stackOut_17_5 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            stackIn_18_3 = stackOut_17_3;
            stackIn_18_4 = stackOut_17_4;
            stackIn_18_5 = stackOut_17_5;
            break L5;
          } else {
            stackOut_16_0 = stackIn_16_0;
            stackOut_16_1 = stackIn_16_1;
            stackOut_16_2 = stackIn_16_2;
            stackOut_16_3 = stackIn_16_3;
            stackOut_16_4 = stackIn_16_4;
            stackOut_16_5 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_18_2 = stackOut_16_2;
            stackIn_18_3 = stackOut_16_3;
            stackIn_18_4 = stackOut_16_4;
            stackIn_18_5 = stackOut_16_5;
            break L5;
          }
        }
        if ((stackIn_18_0 | (stackIn_18_1 | (stackIn_18_2 | (stackIn_18_3 | (stackIn_18_4 | stackIn_18_5))))) != 0) {
          throw new RuntimeException();
        } else {
          this.put(((jaclib.memory.NativeBuffer) this).b, param0, param1, param2, param3);
          return;
        }
    }

    private final native void get(long param0, byte[] param1, int param2, int param3, int param4);

    protected final void a(long param0, int param1) {
        ((jaclib.memory.NativeBuffer) this).b = param0;
        ((jaclib.memory.NativeBuffer) this).a = param1;
    }

    private final native void put(long param0, byte[] param1, int param2, int param3, int param4);

    protected NativeBuffer() {
        ((jaclib.memory.NativeBuffer) this).a = -1;
    }

    public final int getSize() {
        return ((jaclib.memory.NativeBuffer) this).a;
    }
}
