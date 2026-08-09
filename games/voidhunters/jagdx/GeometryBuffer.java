/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class GeometryBuffer extends jaclib.peer.doa implements jaclib.memory.Buffer {
    public GeometryBuffer(jaclib.peer.tqb param0) {
        super(param0);
        this.init();
    }

    private final native void getub(byte[] param0, int param1, int param2, int param3);

    public final native long getAddress();

    private final native void init();

    public final void a(byte[] param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
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


          if ((param1 ^ -1) <= -1) {

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
          if (param2 + param3 > this.getSize()) {
            throw new jagdx.nba();
          } else {
            this.putub(param0, param1, param2, param3);
            return;
          }
        } else {
          throw new jagdx.nba();
        }
    }

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    public final native int getSize();
}
