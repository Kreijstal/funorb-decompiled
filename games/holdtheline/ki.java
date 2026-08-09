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
        go.field_n = true;
        bn.field_k = 15000L + bb.b(-1);
        if (param0) {
          L0: {
            ki.a(false);
            if (bk.field_w != 11) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (bk.field_w != 11) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void b(boolean param0) {
        field_i = null;
        if (!param0) {
            field_i = (String[]) null;
        }
    }

    ki() {
    }

    static {
        field_o = 4;
    }
}
