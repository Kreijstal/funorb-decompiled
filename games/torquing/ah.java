/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ah extends qf {
    static ce field_b;
    static dq field_c;

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 127) {
          param1 = param1 & 8191;
          if (param1 < 4096) {
            L0: {
              if (param1 < 2048) {
                stackOut_18_0 = bm.field_j[param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = bm.field_j[4096 - param1];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param1 >= 6144) {
                stackOut_14_0 = -bm.field_j[8192 + -param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -bm.field_j[-4096 + param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_c = null;
          param1 = param1 & 8191;
          if (param1 < 4096) {
            L2: {
              if (param1 < 2048) {
                stackOut_8_0 = bm.field_j[param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = bm.field_j[4096 - param1];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param1 >= 6144) {
                stackOut_4_0 = -bm.field_j[8192 + -param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -bm.field_j[-4096 + param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static boolean a(int param0) {
        L0: {
          if (oo.field_a == -1) {
            if (!no.a(1, 0)) {
              return false;
            } else {
              oo.field_a = kj.field_d.i((byte) -101);
              kj.field_d.field_n = 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (oo.field_a == -2) {
            if (no.a(2, 0)) {
              oo.field_a = kj.field_d.i(7088);
              kj.field_d.field_n = 0;
              break L1;
            } else {
              return false;
            }
          } else {
            break L1;
          }
        }
        if (param0 != 2) {
          return true;
        } else {
          return no.a(oo.field_a, 0);
        }
    }

    final static String c(int param0) {
        return eb.field_c;
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 1) {
            int discarded$0 = ah.a((byte) -16, 95);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ce();
    }
}
