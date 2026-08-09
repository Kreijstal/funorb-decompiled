/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static dl field_a;
    static byte[][] field_b;
    static int[] field_c;

    public static void a(int param0) {
        if (param0 != 1000) {
          field_c = (int[]) null;
          field_a = null;
          field_b = (byte[][]) null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_b = (byte[][]) null;
          field_c = null;
          return;
        }
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 1000) {
          L0: {
            field_b = (byte[][]) null;
            if (wl.field_d.field_gc != hh.field_d) {
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
            if (wl.field_d.field_gc != hh.field_d) {
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

    static {
        field_a = new dl();
        field_b = new byte[1000][];
    }
}
