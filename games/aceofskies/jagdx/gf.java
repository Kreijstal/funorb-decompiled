/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public final class gf {
    public final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -1) {
          L0: {
            jagdx.gf.a(-75, -97);
            if ((param1 ^ -1) <= -1) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param1 ^ -1) <= -1) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final static boolean a(byte param0, int param1) {
        if (param0 <= 61) {
            return true;
        }
        return param1 >= 0 ? true : false;
    }
}
