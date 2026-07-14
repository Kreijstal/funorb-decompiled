/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends hl {
    static int field_o;
    af[] field_k;
    int[] field_j;
    static String[] field_i;
    int[] field_m;
    int[] field_r;
    int field_n;
    int field_p;
    byte[][][] field_q;
    af[] field_l;

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        go.field_n = true;
        bn.field_k = 15000L + bb.b(-1);
        if (param0) {
          L0: {
            boolean discarded$8 = ki.a(false);
            if (bk.field_w != 11) {
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
            if (bk.field_w != 11) {
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

    public static void b(boolean param0) {
        field_i = null;
        if (!param0) {
            field_i = null;
        }
    }

    ki() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 4;
    }
}
