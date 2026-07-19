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
        if (param0 != 93) {
            return;
        }
        field_k = null;
    }

    qe() {
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == -65) {
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
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L0;
                }
              }
              return stackIn_11_0 != 0;
            }
          } else {
            L1: {
              if ((1 + param1) % 4 != 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static boolean a(int param0) {
        if (param0 < 89) {
            return true;
        }
        if (rp.field_I == null) {
            return false;
        }
        if (rp.field_I.g((byte) 105) == null) {
            return false;
        }
        return true;
    }

    static {
        field_l = "Failed defences";
        field_k = new fg();
    }
}
