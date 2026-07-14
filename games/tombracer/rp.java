/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends vg {
    bua field_j;
    static ft field_g;
    static int field_h;
    static int field_i;
    static jpa field_f;

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
            rp.a(-58);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 != -16226) {
          L0: {
            rp.a(false);
            if (param2 > param3) {
              stackOut_11_0 = param2;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (param3 > param0) {
                stackOut_10_0 = param0;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = param3;
                stackIn_12_0 = stackOut_9_0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (param2 > param3) {
              stackOut_5_0 = param2;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (param3 > param0) {
                stackOut_4_0 = param0;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = param3;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param3 != 73) {
            return;
        }
        hp.a(param1, 0, 0, ((rp) this).field_j.b((byte) 74), -1918106173, param2, param0);
    }

    rp(int param0) {
        ((rp) this).field_j = new bua(0, param0, 1);
        ((rp) this).field_j.a(param0, false, 0, 0, true);
    }

    final static void a(int param0) {
        pra.b(-1);
        if (param0 != 8824) {
            return;
        }
        pqa.i(0);
    }

    final void b(int param0) {
        if (param0 > -30) {
            field_h = 127;
            ((rp) this).field_j.a(0);
            return;
        }
        ((rp) this).field_j.a(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ft(1);
    }
}
