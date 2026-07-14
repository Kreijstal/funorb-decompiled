/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ei {
    int field_b;
    int field_a;
    boolean field_c;

    boolean a(ei param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 55) {
          L0: {
            ((ei) this).field_b = -96;
            if (((ei) this).field_b != param0.field_b) {
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
            if (((ei) this).field_b != param0.field_b) {
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

    public String toString() {
        return super.toString();
    }

    final boolean a(iqa param0, byte param1) {
        if (param1 != -126) {
            return true;
        }
        return true;
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 != 27) {
            return true;
        }
        return 0 != (55 & param1) ? true : false;
    }

    ei(int param0, int param1) {
        ((ei) this).field_c = true;
        ((ei) this).field_b = param0;
        ((ei) this).field_a = param1;
    }

    static {
    }
}
