/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nf extends oh {
    static boolean field_f;
    static dl field_g;

    final int a(byte param0, boolean param1) {
        int discarded$12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -53) {
          L0: {
            discarded$12 = this.a((byte) -2, false);
            if (param1) {
              stackOut_7_0 = 16;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 8;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1) {
              stackOut_3_0 = 16;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 8;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final int a(int param0, int param1) {
        if (param0 != 1843275042) {
          field_f = false;
          return q.field_a[ma.field_n[param1]].field_j;
        } else {
          return q.field_a[ma.field_n[param1]].field_j;
        }
    }

    nf() {
    }

    public static void c(byte param0) {
        if (param0 != 39) {
            field_f = true;
            field_g = null;
            return;
        }
        field_g = null;
    }

    static {
    }
}
