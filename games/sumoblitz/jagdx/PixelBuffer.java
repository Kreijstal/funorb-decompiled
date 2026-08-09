/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class PixelBuffer extends jaclib.peer.sw implements jaclib.memory.Buffer {
    private final native void init();

    public PixelBuffer(jaclib.peer.pf param0) {
        super(param0);
        this.init();
    }

    private final native void geti(int[] param0, int param1, int param2, int param3);

    public final native int getSize();

    public final void a(byte[] param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_12_3 = 0;
        L0: {
          if (param2 >= 0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {


          if (param0.length >= param1 + param3) {

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






          if ((param1 ^ -1) <= -1) {



            stackIn_12_3 = 0;
            break L3;
          } else {



            stackIn_12_3 = 1;
            break L3;
          }
        }
        if ((stackIn_3_0 | (stackIn_6_1 | (stackIn_9_2 | stackIn_12_3))) == 0) {
          if (param3 + param2 > this.getSize()) {
            throw new jagdx.fg();
          } else {
            this.putub(param0, param1, param2, param3);
            return;
          }
        } else {
          throw new jagdx.fg();
        }
    }

    private final native void getub(byte[] param0, int param1, int param2, int param3);

    public final void a(int[] param0, int param1, int param2, int param3) {
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


          if (0 <= param1) {

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


          stackIn_11_1 = stackIn_6_1 | stackIn_9_2;

          if (param0.length >= param3 + param1) {

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
          if (4 * param3 + param2 > this.getSize()) {
            throw new jagdx.fg();
          } else {
            this.puti(param0, param1, param2, param3);
            return;
          }
        } else {
          throw new jagdx.fg();
        }
    }

    public final native int getRowPitch();

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    private final native void puti(int[] param0, int param1, int param2, int param3);

    public final native int getSlicePitch();
}
