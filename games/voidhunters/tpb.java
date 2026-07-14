/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tpb {
    int field_a;
    ml field_b;

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 61) {
          L0: {
            ((tpb) this).a(33);
            if (((tpb) this).field_b == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((tpb) this).field_b == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0) {
        ((tpb) this).field_a = param0;
        ((tpb) this).field_b = null;
    }

    public tpb() {
        ((tpb) this).a(2147483647);
    }

    static {
    }
}
