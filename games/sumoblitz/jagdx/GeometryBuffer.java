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
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          if (param0 != null) {
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
          if (param1 >= 0) {
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
          stackOut_6_0 = stackIn_6_0 | stackIn_6_1;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (param0.length >= param1 - -param3) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          stackOut_9_0 = stackIn_9_0 | stackIn_9_1;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (0 <= param2) {
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
        if ((stackIn_12_0 | stackIn_12_1) == 0) {
          if (param3 + param2 > ((jagdx.GeometryBuffer) this).getSize()) {
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
