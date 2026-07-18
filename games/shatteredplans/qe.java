/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qe extends oh {
    static String field_l;
    ln field_h;
    gm field_i;
    static fg field_k;
    static bi field_j;

    public static void a(byte param0) {
        field_l = null;
        field_j = null;
        field_k = null;
    }

    qe() {
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 >= 0) {
          if (param1 >= 1582) {
            if (0 == param1 % 4) {
              if (param1 % 100 == 0) {
                if (0 == param1 % 400) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            L0: {
              if (0 != param1 % 4) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L0;
              }
            }
            return stackIn_9_0 != 0;
          }
        } else {
          L1: {
            if ((1 + param1) % 4 != 0) {
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

    final static boolean a(int param0) {
        if (rp.field_I == null) {
            return false;
        }
        if (rp.field_I.g((byte) 105) == null) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Failed defences";
        field_k = new fg();
    }
}
