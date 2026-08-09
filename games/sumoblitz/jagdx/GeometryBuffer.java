/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class GeometryBuffer extends jaclib.peer.sw implements jaclib.memory.Buffer {
    private final native void getub(byte[] param0, int param1, int param2, int param3);

    public final native long getAddress();

    private final native void init();

    public final native int getSize();

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    public final void a(byte[] param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        L0: {
          if (param0 != null) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {


          if ((param1 ^ -1) <= -1) {

            stackIn_6_1 = 0;
            break L1;
          } else {

            stackIn_6_1 = 1;
            break L1;
          }
        }
        L2: {
          stackIn_8_0 = stackIn_3_0 | stackIn_6_1;

          if (param0.length >= param1 - -param3) {
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

    public GeometryBuffer(jaclib.peer.pf param0) {
        super(param0);
        this.init();
    }
}
