/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mma {
    static int field_a;

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        if (param0 != -12178) {
          L0: {
            field_a = 3;
            if (this != tib.field_h) {
              stackIn_11_0 = 0;
              break L0;
            } else {
              stackIn_11_0 = 1;
              break L0;
            }
          }
          L1: {


            if (pia.field_x != this) {

              stackIn_14_1 = 0;
              break L1;
            } else {

              stackIn_14_1 = 1;
              break L1;
            }
          }
          return (stackIn_11_0 | stackIn_14_1) != 0;
        } else {
          L2: {
            if (this != tib.field_h) {
              stackIn_4_0 = 0;
              break L2;
            } else {
              stackIn_4_0 = 1;
              break L2;
            }
          }
          L3: {


            if (pia.field_x != this) {

              stackIn_7_1 = 0;
              break L3;
            } else {

              stackIn_7_1 = 1;
              break L3;
            }
          }
          return (stackIn_4_0 | stackIn_7_1) != 0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
