/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public class NativeBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private int a;
    private long b;

    private final native void get(long param0, byte[] param1, int param2, int param3, int param4);

    public final int getSize() {
        return this.a;
    }

    public void a(byte[] param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        L0: {
          if (0 <= param2) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {


          if (-1 >= (param1 ^ -1)) {

            stackIn_6_1 = 0;
            break L1;
          } else {

            stackIn_6_1 = 1;
            break L1;
          }
        }
        L2: {




          if ((this.b ^ -1L) != -1L) {


            stackIn_9_2 = 0;
            break L2;
          } else {


            stackIn_9_2 = 1;
            break L2;
          }
        }
        L3: {






          if (param0 != null) {



            stackIn_12_3 = 0;
            break L3;
          } else {



            stackIn_12_3 = 1;
            break L3;
          }
        }
        L4: {


          stackIn_14_1 = stackIn_6_1 | (stackIn_9_2 | stackIn_12_3);

          if (param3 + param1 <= param0.length) {

            stackIn_15_1 = stackIn_14_1;
            stackIn_15_2 = 0;
            break L4;
          } else {

            stackIn_15_1 = stackIn_14_1;
            stackIn_15_2 = 1;
            break L4;
          }
        }
        L5: {
          stackIn_17_0 = stackIn_3_0 | (stackIn_15_1 | stackIn_15_2);

          if (param2 + param3 <= this.a) {
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
          this.put(this.b, param0, param1, param2, param3);
          return;
        }
    }

    private final native void put(long param0, byte[] param1, int param2, int param3, int param4);

    protected NativeBuffer() {
        this.a = -1;
    }

    public final long getAddress() {
        return this.b;
    }

    protected final void a(long param0, int param1) {
        this.b = param0;
        this.a = param1;
    }
}
