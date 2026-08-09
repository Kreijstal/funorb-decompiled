/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class PixelBuffer extends jaclib.peer.nd implements jaclib.memory.Buffer {
    public PixelBuffer(jaclib.peer.qt param0) {
        super(param0);
        this.init();
    }

    public final native int getSize();

    public final native int getRowPitch();

    public final native int getSlicePitch();

    private final native void puti(int[] param0, int param1, int param2, int param3);

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    private final native void getub(byte[] param0, int param1, int param2, int param3);

    public final void a(int[] param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        L0: {
          if (param0.length >= param1 - -param3) {
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

          if (0 <= param2) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_1 = 0;
            break L3;
          } else {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_1 = 1;
            break L3;
          }
        }
        if ((stackIn_12_0 | stackIn_12_1) == 0) {
          if (this.getSize() < param3 * 4 + param2) {
            throw new jagdx.ie();
          } else {
            this.puti(param0, param1, param2, param3);
            return;
          }
        } else {
          throw new jagdx.ie();
        }
    }

    public final void a(byte[] param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        L0: {
          if ((param2 ^ -1) <= -1) {
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




          if (0 <= param1) {


            stackIn_9_2 = 0;
            break L2;
          } else {


            stackIn_9_2 = 1;
            break L2;
          }
        }
        L3: {


          stackIn_11_1 = stackIn_6_1 | stackIn_9_2;

          if (param0.length >= param1 + param3) {

            stackIn_12_1 = stackIn_11_1;
            stackIn_12_2 = 0;
            break L3;
          } else {

            stackIn_12_1 = stackIn_11_1;
            stackIn_12_2 = 1;
            break L3;
          }
        }
        if ((stackIn_3_0 | (stackIn_12_1 | stackIn_12_2)) == 0) {
          if (param2 + param3 > this.getSize()) {
            throw new jagdx.ie();
          } else {
            this.putub(param0, param1, param2, param3);
            return;
          }
        } else {
          throw new jagdx.ie();
        }
    }

    private final native void init();

    private final native void geti(int[] param0, int param1, int param2, int param3);
}
