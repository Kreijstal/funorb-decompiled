/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ipb {
    int field_a;
    private tsa[] field_b;

    ipb(ij param0) {
        ((ipb) this).field_a = 0;
        ((ipb) this).field_b = new tsa[param0.c(3)];
        int var2 = 0;
        tsa var3 = (tsa) (Object) param0.d(0);
        while (var3 != null) {
            var3.b(-3846);
            var2++;
            ((ipb) this).field_b[var2] = var3;
            var3 = (tsa) (Object) param0.a((byte) 13);
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 18) {
          L0: {
            ((ipb) this).field_b = null;
            if (((ipb) this).field_a < ((ipb) this).field_b.length) {
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
            if (((ipb) this).field_a < ((ipb) this).field_b.length) {
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

    final tsa a(byte param0) {
        int var2 = 75 / ((param0 - 70) / 55);
        ((ipb) this).field_a = ((ipb) this).field_a + 1;
        return ((ipb) this).field_b[((ipb) this).field_a];
    }

    static {
    }
}
