/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ifb extends mfb {
    final int f(byte param0) {
        if (param0 <= 0) {
            return -105;
        }
        return qaa.field_b;
    }

    final boolean h(byte param0) {
        if (param0 < 18) {
            return true;
        }
        return false;
    }

    ifb() {
    }

    final static void l(int param0) {
        if (param0 > -115) {
            return;
        }
        if (ov.field_o != null) {
            ov.field_o.b(1);
            ov.field_o = null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -21) {
          L0: {
            ifb.l(71);
            if (0 == (param1 & 1024)) {
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
            if (0 == (param1 & 1024)) {
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

    final boolean c(boolean param0) {
        if (!param0) {
            return true;
        }
        return true;
    }

    final int c(int param0) {
        if (param0 != 0) {
            return -71;
        }
        return df.field_p;
    }

    final int b(int param0) {
        int var2 = 120 % ((param0 - 7) / 47);
        return wkb.field_b;
    }

    final int a(boolean param0) {
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = this.b(-100);
            return 87;
        }
        return 87;
    }

    static {
    }
}
